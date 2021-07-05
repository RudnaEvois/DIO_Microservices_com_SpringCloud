package one.digitalinnovation.expert.shoppingcart.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("item")
public class Item {

    private Integer productId;
    private Integer amount;


}
