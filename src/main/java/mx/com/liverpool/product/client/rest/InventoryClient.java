package mx.com.liverpool.product.client.rest;

import mx.com.liverpool.product.model.dto.InventoryResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "inventory-service", url = "http://localhost:8081/api/v1")
public interface InventoryClient {

    @GetMapping("/inventory/{productId}")
    InventoryResponse findById(@PathVariable String productId);
}
