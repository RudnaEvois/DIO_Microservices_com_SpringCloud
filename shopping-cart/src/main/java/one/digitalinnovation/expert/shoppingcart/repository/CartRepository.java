package one.digitalinnovation.expert.shoppingcart.repository;

import one.digitalinnovation.expert.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;


public interface CartRepository extends CrudRepository<Cart, Integer> {
}
