package com.CustomerWeb.service;

import com.CustomerWeb.entity.Cart;
import com.CustomerWeb.entity.Product;
import com.CustomerWeb.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;
    public Optional<Cart> getCartByCustomerId(Long customerId) {
        return cartRepository.findByCustomerId(customerId);
    }
    public Cart saveCart(Cart cart) {
        return cartRepository.save(cart);
    }
    public Cart addProductToCart(Cart cart, Product product) {
        cart.getProducts().add(product);
        return cartRepository.save(cart);
    }
    public Cart removeProductFromCart(Cart cart, Product product) {
        cart.getProducts().remove(product);
        return cartRepository.save(cart);
    }

    public void clearCart(Cart cart) {
        cart.getProducts().clear();
        cartRepository.save(cart);
    }
    public void deleteCart(Long id) {
        cartRepository.deleteById(id);
    }
}