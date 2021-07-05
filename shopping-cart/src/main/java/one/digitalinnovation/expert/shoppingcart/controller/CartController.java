package one.digitalinnovation.expert.shoppingcart.controller;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.expert.shoppingcart.model.Cart;
import one.digitalinnovation.expert.shoppingcart.model.Item;
import one.digitalinnovation.expert.shoppingcart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping(value = "/cart")
public class CartController {

    @Autowired
    private CartRepository cartRepository;

    @RequestMapping(value= "/{id}", method = RequestMethod.POST)
    public Cart addItem(@PathVariable("id") Integer id, @RequestBody Item item){
        Optional<Cart> savedCart = cartRepository.findById(id);
        Cart cart;
        if(savedCart.equals(Optional.empty())){
            cart = new Cart(id);
        } else{
            cart = savedCart.get();
        }
        cart.getItems().add(item);

        return cartRepository.save(cart);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Cart> findById(@PathVariable("id") Integer id){
        return cartRepository.findById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void clear(@PathVariable("id") Integer id){
        cartRepository.deleteById(id);
    }

}
