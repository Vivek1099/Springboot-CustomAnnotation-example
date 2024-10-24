package Springboot_Custom_Annonation_example;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE, ElementType.PARAMETER, ElementType.TYPE_USE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AddressValidator.class) // Specify your validator class
public @interface AddressValidation 
{
	String message() default "Invalid address"; // Default message

	Class<?>[] groups() default {}; // Required groups parameter

	Class<? extends Payload>[] payload() default {}; // Optional payload parameter
}
