package com.aprendizaje.spring.cap6.ex1_simpleAspect.aspects;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import com.aprendizaje.spring.cap6.ex1_simpleAspect.services.CommentService;

/*
 * PASO 2.1 DE LA IMPLEMENTACION DE ASPECTOS: Creamos una clase que tendrá la lógica del aspecto.
 * 
 * Observacion: La anotacion @Aspect no es una anotacion stereotype, por lo que necesitamos agregar explicitamente la instancia al context.
 */

@Aspect
public class LoggingAspect {

	private Logger logger = Logger.getLogger(CommentService.class.getName());
	
	/*
	 * PASO 3 DE LA IMPLEMENTACION DE ASPECTOS:
	 * Definimos donde estan los metodos interceptados.
	 * El metodo arroja un Throwable ya que el metodo proceed() esta diseñado para arrojar una excepcion proveniente
	 * del metodo interceptado.
	 */


	@Around("execution(* com.aprendizaje.spring.cap6.ex1_simpleAspect.services.*.*(..))")
	public void log(ProceedingJoinPoint joinPoint) throws Throwable {
		/*
		 * Mostramos por consola un mensaje antes de que se ejecute el metodo
		 */
		logger.info("Method will execute");
		/*
		 * Procedemos con la ejecucion del metodo interceptado. Tambien es posible no delegar la ejecucion
		 * si ocurrien ciertas condiciones (se puede desarrollar cierta logica de autenticación o seguridad)
		 */
		joinPoint.proceed();
		/*
		 * Mostramos por consola un mensjae luego de que se haya ejecutado el metodo
		 */
		logger.info("Method executed");
	}

}
