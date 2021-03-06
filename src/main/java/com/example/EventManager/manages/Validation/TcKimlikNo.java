package com.example.EventManager.manages.Validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = TcKimlikNoValidator.class)
public @interface TcKimlikNo {

    String message() default "Tc kimlik numarası formata uygun olmalıdır.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
