package ro.cpatrut.auth.dto.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = AlreadyRegisteredEmailValidator.class)
public @interface AlreadyRegisteredEmail {
    String message() default "Checks if email already exists";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
