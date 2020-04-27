import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class TestRedisJava {
    public TestRedisJava(){

    }

    @Test
    @DisplayName("Test Redis cache");
    void testRedisCache(){
        RedisJava cache = new RedisJava();
        cache.get_cached_value()
        assertEquals("42", cache);
    }
}
