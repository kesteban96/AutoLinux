package co.com.inconcert.testing.fdr.utilities.exceldata;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Se crea una anotación personalizada porque necesitamos copiar todos los datos del archivo de
 * Excel al archivo .feature antes de comenzar a ejecutar
 *
 * @author Mateo Ortiz Bedoya
 * @since 01 /11/2019
 */
// @Retention(RUNTIME)
// @Target(METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BeforeRunner {}
