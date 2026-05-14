package mx.com.liverpool.product.mapper;

import mx.com.liverpool.product.model.dto.ProductResponse;
import mx.com.liverpool.product.model.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(target = "name", source = "product.title")
    @Mapping(target = "stock", source = "stock")
    ProductResponse toDto(Product product, Integer stock);
}
