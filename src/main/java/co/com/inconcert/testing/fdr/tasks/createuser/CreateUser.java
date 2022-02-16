package co.com.inconcert.testing.fdr.tasks.createuser;

import co.com.inconcert.testing.fdr.interactions.comunes.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static co.com.inconcert.testing.fdr.userinterfaces.createuser.CreateUserPage.*;
import static co.com.inconcert.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateUser implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(USUARIOS),
                Click.on(CREAR_USUARIO),
                Enter.theValue(obtener("identificador")).into(IDENTIFICADOR_USER),
                Enter.theValue(obtener("nombre")).into(FIRST_NAME),
                Enter.theValue(obtener("apellido")).into(SURNAME),
                Enter.theValue(obtener("contraseña")).into(PASSWORD),
                Enter.theValue(obtener("validarcontra")).into(PASSWORD_VERIFY),
                Click.on(PERMISOS_CLIC),
                Click.on(SELECCIONAR_PERMISOS),
                Click.on(LENGUAJE_CLIC),
                Click.on(SELECCIONAR_LENGUAJE),
                Click.on(HORARIO_CLIC),
                Click.on(HORARIO),
                Esperar.esperarEnSegundos(2000),
                Click.on(PAIS_CLIC),
                Click.on(PAIS),
                Click.on(AREA_CLIC),
                Click.on(AREA),
                Click.on(CAMPAÑA),
                Click.on(CAMPAÑA_PREDETERMINADA),
                Esperar.esperarEnSegundos(5000),
                Click.on(BTN_CONFIRMAR_CONTINUAR),
                Esperar.esperarEnSegundos(5000),
                Click.on(BTN_ATRAS),
                Enter.theValue(obtener("identificador")).into(TXT_BUSCAR),
                Click.on(BUSCAR),
                Esperar.esperarEnSegundos(3000)
        );

    }

    public static CreateUser createUser(){

        return instrumented(CreateUser.class);
    }
}
