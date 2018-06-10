package per.jgx.conf;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    /**
     * feign调用失败后会进行重试
     */
    @Bean
    Retryer feignRetryer() {
        return new Retryer.Default();
//        return new Retryer.Default(100, TimeUnit.SECONDS.toMillis(1L), 5);
    }
}
