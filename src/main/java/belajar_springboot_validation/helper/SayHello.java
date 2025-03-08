package belajar_springboot_validation.helper;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotBlank;

@Component
@Validated
public class SayHello implements ISayHello{
    public String sayHello(@NotBlank String name) {
        return "Hello " + name;
    }
}
