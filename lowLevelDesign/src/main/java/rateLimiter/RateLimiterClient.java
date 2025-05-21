package rateLimiter;

/**
 * Design rate limiter using token bucket algorithm
 */
public class RateLimiterClient {

    public static void main(String[] args) {

        RateLimiterService rateLimiterService = new RateLimiterService();
        for(int i=0;i<10; i++){
            System.out.println(rateLimiterService.rateLimit(1) + "CustomerId: 1");
        }
    }
}
