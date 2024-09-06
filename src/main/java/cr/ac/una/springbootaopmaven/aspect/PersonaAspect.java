package cr.ac.una.springbootaopmaven.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class PersonaAspect {
    private static final Logger logger = Logger.getLogger(PersonaAspect.class.getName());

    @Before("execution(* cr.ac.una.springbootaopmaven.controller.PersonaController.savePersona*(..))")
    public void logBeforeV2(JoinPoint joinPoint) {
        logger.info("Antes de ejecutar el metodo save persona : " + joinPoint.getSignature().getName());
    }

    @After("execution(* cr.ac.una.springbootaopmaven.controller.PersonaController.*(..))")
    public void logAfterV1(JoinPoint joinPoint) {
        logger.info("Antes de ejecutar cualquier método del controller : " + joinPoint.getSignature().getName());

    }

    @Before("execution(* cr.ac.una.springbootaopmaven.controller.PersonaController.*(..))")
    public void logAfterV2(JoinPoint joinPoint) {
        logger.info("Después de ejecutar cualquier método del controller :  " + joinPoint.getSignature().getName());

    }
}
