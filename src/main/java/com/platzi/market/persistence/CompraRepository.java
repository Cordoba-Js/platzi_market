package com.platzi.market.persistence;

import com.platzi.market.domain.Purchase;
import com.platzi.market.domain.repository.PurchaseRepository;
import com.platzi.market.persistence.crud.CompraCrudRepository;
import com.platzi.market.persistence.entity.Compra;
import com.platzi.market.persistence.mapper.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CompraRepository implements PurchaseRepository {

    @Autowired
    private CompraCrudRepository compraCrudRepository;

    @Autowired
    private PurchaseMapper purchaseMapper;

    @Override
    public List<Purchase> finAll() {
        List<Compra> compras = (List<Compra>) compraCrudRepository.findAll();
        return purchaseMapper.toPurchases(compras);
    }

    @Override
    public Optional<List<Purchase>> getByCliente(String clientId) {
        return compraCrudRepository.findByIdCliente(clientId)
                .map(comprasCliente -> purchaseMapper.toPurchases(comprasCliente));
    }

    @Override
    public Optional<Purchase> getPurchase(int purchaseId) {
        return compraCrudRepository.findById(purchaseId)
                .map(compra -> purchaseMapper.toPurchase(compra));
    }

    @Override
    public Purchase save(Purchase purchase) {
        Compra compra = purchaseMapper.toCompra(purchase);
        compra.getProductos().forEach(prodcuto -> prodcuto.setCompra(compra));
        return purchaseMapper.toPurchase(compra);
    }
}
