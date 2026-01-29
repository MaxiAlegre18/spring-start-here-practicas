package com.aprendizaje.spring.cap6.ex3_interceptAnnotatedMethods.aspects;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * Creamos una anotacion para marcar aquellos metodos que queremos que sean interceptados por un aspecto.
 * 
 * La primer regla es establecer la política de retención en runtime, esto nos permite que los metodos anotados puedan
 * ser interceptadas en tiempo de ejecucion.
 * 
 * La anotacion Target define en donde se puede poner la etiqueta, en este caso, se define que solo se puede poner en
 * los métodos.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ToLog {

}
