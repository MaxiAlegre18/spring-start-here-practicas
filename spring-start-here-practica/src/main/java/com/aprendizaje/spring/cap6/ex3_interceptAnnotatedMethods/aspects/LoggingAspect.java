package com.aprendizaje.spring.cap6.ex3_interceptAnnotatedMethods.aspects;

import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import com.aprendizaje.spring.cap6.ex3_interceptAnnotatedMethods.services.CommentService;

/*
 * PASO 2.1 DE LA IMPLEMENTACION DE ASPECTOS: Creamos una clase que tendrá la lógica del aspecto.
 * 
 * Observacion: La anotacion @Aspect no es una anotacion stereotype, por lo que necesitamos agregar explicitamente la instancia al context.
 */

@Aspect
public class LoggingAspect {

	private Logger logger = Logger.getLogger(CommentService.class.getName());
	
	/*
	 * Definimos un metodo que se va a interceptar un metodo durante (around) su ejecucion.
	 * Establecemos que este método se ejecutará tras interceptar los métodos que tengan la anotación @ToLog
	 */
	@Around("@annotation(ToLog)")
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
		/*
		 * Obtenemos el nombre del metodo interceptado.
		 */
		String methodName = joinPoint.getSignature().getName();
		
		/*
		 * Obtenemos los parametros del metodo interceptado.
		 */
		Object [] arguments = joinPoint.getArgs();
		
		/*
		 * Mostramos la informacion recoletada en el log.
		 */
		logger.info("Method " + methodName + " withParameters " + Arrays.asList(arguments) + " will execute.");
		
		/*
		 * Procedemos con la ejecucion del metodo interceptado y obtenemos lo que devuelve.
		 */
		Object returnedByMethod = joinPoint.proceed();
		
		/*
		 * Mostramos la informacion recoletada en el log.
		 */
		logger.info("Method executed and returned " + returnedByMethod);
		
		/*
		 * Retornamos el valor que nos devolvió el metodo interceptado
		 */
		
		return returnedByMethod;
	}

}
