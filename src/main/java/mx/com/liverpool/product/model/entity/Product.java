package mx.com.liverpool.product.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "products", schema = "public")
public class Product {
    @Id
    private Integer id;
    private String extId;
    private String title;
    private String description;
    private String price;
    private String currency;
    private String category;
    private Boolean active;
}
