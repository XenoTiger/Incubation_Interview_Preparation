package streams;

import java.time.LocalDate;

public class ProductReview {
    private String productName;
    private double reviewScore;
    private LocalDate reviewDate;

    public ProductReview(String productName, double reviewScore, LocalDate reviewDate) {
        this.productName = productName;
        this.reviewScore = reviewScore;
        this.reviewDate = reviewDate;
    }

    public String getProductName() {
        return productName;
    }

    public double getReviewScore() {
        return reviewScore;
    }

    public LocalDate getReviewDate() {
        return reviewDate;
    }

    @Override
    public String toString() {
        return "Product: " + productName + ", Score: " + reviewScore + ", Date: " + reviewDate;
    }
}
