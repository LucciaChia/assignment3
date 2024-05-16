package guru.springframework.assignment3.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

/**
 * has to contain also some profile for i18n, otherwise an exception will be thrown
 * Caused by: org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'guru.springframework.assignment3.services.GreetingService' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {@org.springframework.beans.factory.annotation.Qualifier("i18NService")}
 */
@ActiveProfiles({"dev"})
@SpringBootTest
class EnvironmentControllerTest {

    @Autowired
    EnvironmentController environmentController;

    @Test
    void getEnv() {
        System.out.println(environmentController.getEnv());
    }
}