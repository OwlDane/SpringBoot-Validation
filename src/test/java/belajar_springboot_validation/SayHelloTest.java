package belajar_springboot_validation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import belajar_springboot_validation.helper.SayHello;

import jakarta.validation.ConstraintViolationException;

@SpringBootTest
public class SayHelloTest {

    @Autowired
    private SayHello sayHello;

    @Test
    void testSuccess() {
        String message = sayHello.sayHello("Zidane");
        Assertions.assertEquals("Hello Zidane", message);
    }

    @Test
    void testError() {
        Assertions.assertThrows(ConstraintViolationException.class, () -> {
        sayHello.sayHello("");
        });
    }
}
