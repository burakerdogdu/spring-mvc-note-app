package com.works.restcontrollers;

import com.works.entities.Product;
import com.works.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductRestController {

    final ProductService productService;

    @PostMapping("/save")
    public ResponseEntity save (@RequestBody Product product ){
        return productService.save(product);
    }

    @GetMapping("/list")
    public ResponseEntity list(){
        return productService.list();

    }
    @GetMapping("/delete/{pid}")
    public ResponseEntity delete(@PathVariable Long pid){
        return productService.delete(pid);
    }

    @PostMapping("/update")
    public ResponseEntity update(@RequestBody Product product){
        return productService.update(product);
    }

}
