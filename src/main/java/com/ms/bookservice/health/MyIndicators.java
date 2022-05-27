package com.ms.bookservice.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component("myProp")
public class MyIndicators implements HealthIndicator {

    @Override
    public Health health() {

        boolean condition = verifyIfAlgumacoisa();
        if(condition){
            return Health.up()
                    .withDetail("Application UP", 200)
                    .build();
        }else {
            return Health.down()
                    .withDetail("Application DOWN", 113)
                    .build();
        }
    }

    private boolean verifyIfAlgumacoisa(){
        return true;
    }
}
