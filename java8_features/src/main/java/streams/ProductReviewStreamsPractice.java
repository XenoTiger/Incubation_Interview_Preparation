package streams;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class ProductReviewStreamsPractice {
    public static void main(String[] args) {
        List<ProductReview> reviews = Arrays.asList(
                new ProductReview("Laptop", 4.5, LocalDate.of(2023, 10, 5)),
                new ProductReview("Smartphone", 4.8, LocalDate.of(2023, 9, 25)),
                new ProductReview("Laptop", 3.8, LocalDate.of(2023, 9, 20)),
                new ProductReview("Smartphone", 3.2, LocalDate.of(2023, 10, 15)),
                new ProductReview("Tablet", 5.0, LocalDate.of(2023, 10, 10)),
                new ProductReview("Laptop", 4.7, LocalDate.of(2023, 10, 12))

        );
        //Get all reviews with a score above 4.
        List<ProductReview> productReviews = reviews.stream().
                filter(e -> e.getReviewScore() > 4).toList();
        productReviews.forEach(System.out::println);

        System.out.println("********************");

        //Calculate the average review score for a specific product.
        Map<String, Double> avgScoreForEachProduct = reviews.stream()
                .collect(Collectors.groupingBy(ProductReview::getProductName,
                        Collectors.averagingDouble(ProductReview::getReviewScore)));
        avgScoreForEachProduct.forEach((name, review) -> {
            System.out.println("Product: " + name + ", Average Review: " + review);
        });

        System.out.println("********************");

        //Find the latest review for each product. (Use Collectors.maxBy())
        Map<String, Optional<ProductReview>> latestReviewForEachProduct = reviews.stream()
                .collect(Collectors.groupingBy(ProductReview::getProductName,
                        Collectors.maxBy(Comparator.comparing(ProductReview::getReviewDate))));
        latestReviewForEachProduct.forEach((name, review) -> {
            System.out.println("Product: " + name + ", Latest Review: " + review.orElse(null));
        });


    }
}
