package com.project.ecom_be_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the Ecom BE Gateway application.
 */
@SpringBootApplication
public final class EcomBeGatewayApplication {

    private EcomBeGatewayApplication() {
    }

    /**
     * Starts the spring boot application.
     *
     * @param args command-line arguments.
     */
    public static void main(final String[] args) {
        SpringApplication.run(EcomBeGatewayApplication.class, args);
    }

}
