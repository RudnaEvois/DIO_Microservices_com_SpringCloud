package one.digitalinnovation.experts.productcatalog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "product", indexStoreType = "catalog")
public class Product {

    @Id
    private Long id;
    private String nome;
    private Integer amount;
}
