package mx.com.liverpool.product.service;

import lombok.RequiredArgsConstructor;
import mx.com.liverpool.product.client.rest.InventoryClient;
import mx.com.liverpool.product.mapper.ProductMapper;
import mx.com.liverpool.product.model.dto.InventoryResponse;
import mx.com.liverpool.product.model.dto.ProductResponse;
import mx.com.liverpool.product.model.entity.Product;
import mx.com.liverpool.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    private final InventoryClient inventoryClient;

    public List<ProductResponse> search(String query) {
        return productRepository.search(query).stream()
                .map(this::mapResponse)
                .toList();
    }

    private ProductResponse mapResponse(Product product) {
        InventoryResponse inventory = inventoryClient.findById(product.getExtId());
        Integer stock = inventory != null ? inventory.getStock() : null;
        return productMapper.toDto(product, stock);
    }
}
