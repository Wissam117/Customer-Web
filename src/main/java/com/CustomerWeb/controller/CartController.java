package com.CustomerWeb.controller;

import com.CustomerWeb.entity.Cart;
import com.CustomerWeb.entity.Product;
import com.CustomerWeb.service.CartService;
import com.CustomerWeb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/api/cart")
@CrossOrigin(origins = "http://localhost:4200")
public class CartController {


    @Autowired
    private CartService cartService;

    @Autowired
    private ProductService productService;

    @GetMapping("/customer/{customerId}")
    public ResponseEntity<Cart> getCartByCustomerId(@PathVariable Long customerId) {
        Optional<Cart> cart = cartService.getCartByCustomerId(customerId);
        return cart.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/customer/{customerId}/add/{productId}")
    public ResponseEntity<Cart> addProductToCart(@PathVariable Long customerId, @PathVariable Long productId) {
        Optional<Cart> cartOpt = cartService.getCartByCustomerId(customerId);
        Optional<Product> productOpt = productService.getProductById(productId);

        if (cartOpt.isPresent() && productOpt.isPresent()) {
            Cart updatedCart = cartService.addProductToCart(cartOpt.get(), productOpt.get());
            return ResponseEntity.ok(updatedCart);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/customer/{customerId}/remove/{productId}")
    public ResponseEntity<Cart> removeProductFromCart(@PathVariable Long customerId, @PathVariable Long productId) {
        Optional<Cart> cartOpt = cartService.getCartByCustomerId(customerId);
        Optional<Product> productOpt = productService.getProductById(productId);
        if (cartOpt.isPresent() && productOpt.isPresent()) {
            Cart updatedCart = cartService.removeProductFromCart(cartOpt.get(), productOpt.get());
            return ResponseEntity.ok(updatedCart);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/customer/{customerId}/clear")
    public ResponseEntity<Void> clearCart(@PathVariable Long customerId) {
        Optional<Cart> cartOpt = cartService.getCartByCustomerId(customerId);
        if (cartOpt.isPresent()) {
            cartService.clearCart(cartOpt.get());
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}