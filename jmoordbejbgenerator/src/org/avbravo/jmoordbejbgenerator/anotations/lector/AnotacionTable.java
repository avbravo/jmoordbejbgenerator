package org.avbravo.jmoordbejbgenerator.anotations.lector ;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
*
* @author avbravo
*/


@Retention(RetentionPolicy.RUNTIME)

public @interface AnotacionTable {

String nombre();

String catalogo() default "";

 String esquema() default "";

}
