package day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Ibrahim Chowdhury on 17 Jun, 2021
 *
 * Today I will show Stream Filter
 */
public class Day2 {
    public static void main(String[] args) {
        Product product1 = new Product("Harry Potter",120.60,"Book");
        Product product2 = new Product("Plain Shirt",1520,"Cloth");
        Product product3 = new Product("T-shirt",450,"Cloth");
        Product product4 = new Product("The Soul of a New Machine",350,"Book");

        List<Product> products = Arrays.asList(product1, product2, product3, product4);

        List<Product> productPriceLessThan500 = products
                .stream()
                .filter(p -> p.getPrice() > 100)
                .collect(Collectors.toList());

        System.out.println(productPriceLessThan500.toString());

        List<Product> productofClothCategory = products
                .stream()
                .filter(p -> p.getCategory().equals("Cloth"))
                .collect(Collectors.toList());

        System.out.println(productofClothCategory.toString());
    }
}
