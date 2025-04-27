package com.springdemo.spring_mvc_thymeleaf_0;

import com.springdemo.spring_mvc_thymeleaf_0.entities.Product;
import com.springdemo.spring_mvc_thymeleaf_0.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SpringMvcThymeleaf0Application {

    public static void main(String[] args) {

        SpringApplication.run(SpringMvcThymeleaf0Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository) {
        return args -> {
            Product product = Product.builder()
                    .name("PC").price(1000).quantity(50)
                    .build();
            productRepository.save(product);
            productRepository.save(Product.builder()
                    .name("Printer").price(200).quantity(20)
                    .build());
            productRepository.save(Product.builder()
                    .name("Laptop").price(1500).quantity(30)
                    .build());
            productRepository.findAll().forEach(p->{
                System.out.println(p.toString());
            });
        };
    }

}
