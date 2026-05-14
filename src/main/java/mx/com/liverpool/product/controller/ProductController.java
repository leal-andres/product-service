package mx.com.liverpool.product.controller;

import lombok.RequiredArgsConstructor;
import mx.com.liverpool.product.model.dto.ProductResponse;
import mx.com.liverpool.product.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping("/search")
    public ResponseEntity<List<ProductResponse>> search(@RequestParam String query) {
        return ResponseEntity.ok(productService.search(query));
    }
}
