package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Aspect
@Component
public class FacadeWatcher {

    private static final Logger LOGGER = LoggerFactory.getLogger(FacadeWatcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
            "&& args(orderDto, userId) && target(object)")
    public void logEvent(OrderDto orderDto, Long userId, Object object) {
        LOGGER.info("Logging the event: facade pattern for the Order:\n" +
                "Class: " + object.getClass().getName() + ",\n" +
                "Args:\n  OrderDto:\n" + orderDto.getItems().stream()
                .map(o -> "    product id: " + o.getProductId().toString())
                .collect(Collectors.joining(",\n")) + ",\n" +
                "  UserId:\n" + "    " + userId + ",\n");
    }
}
