package rateLimiter;

import java.util.concurrent.TimeUnit;

public class RateLimiterConstant {

    public static final int BUCKET_SIZE = 5;
    public static final long TIME_WINDOW = TimeUnit.SECONDS.toMillis(1);
}
