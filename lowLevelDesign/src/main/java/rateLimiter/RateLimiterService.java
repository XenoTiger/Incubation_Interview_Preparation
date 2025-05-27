package rateLimiter;

import java.util.HashMap;
import java.util.Map;

public class RateLimiterService {

    Map<Integer, Pair<Integer, Long>> map = new HashMap<>();

    public boolean rateLimit(int customerId) {
        if (!map.containsKey(customerId)) {
            Pair pair
                    = new Pair(RateLimiterConstant.BUCKET_SIZE - 1, System.currentTimeMillis() + RateLimiterConstant.TIME_WINDOW);
            map.put(customerId, pair);
            return true;
        } else {
            if (map.get(customerId).getKey() > 0) {
                Pair pair = new Pair(map.get(customerId).getKey() - 1, map.get(customerId).getVal());
                map.put(customerId, pair);
                return true;
            } else {
                long currentTime = System.currentTimeMillis();
                if (currentTime > map.get(customerId).getVal()) {
                    Pair pair = new Pair(RateLimiterConstant.BUCKET_SIZE - 1, System.currentTimeMillis() + RateLimiterConstant.TIME_WINDOW);
                    map.put(customerId, pair);
                    return true;
                } else {
                    return false;
                }
            }
        }

    }

}
