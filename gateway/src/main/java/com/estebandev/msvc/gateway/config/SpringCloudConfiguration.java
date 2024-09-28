package com.estebandev.msvc.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * SpringCloudConfiguration
 */
@Configuration
public class SpringCloudConfiguration {

  @Bean
  RouteLocator gatewayRoutes(RouteLocatorBuilder routeLocatorBuilder) {
    return routeLocatorBuilder.routes()
        .route("user_test", r -> r.path("/users/**")
            .uri("lb://users"))
        .build();
  }
}
