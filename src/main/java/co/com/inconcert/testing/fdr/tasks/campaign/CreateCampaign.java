package co.com.inconcert.testing.fdr.tasks.campaign;

import co.com.inconcert.testing.fdr.interactions.comunes.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static co.com.inconcert.testing.fdr.userinterfaces.campaign.CampaignPage.*;
import static co.com.inconcert.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateCampaign implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(CREAR_CAMPAÑA),
                Enter.theValue(obtener("campaignname")).into(NOMBRE),
                Enter.theValue(obtener("descripcion")).into(DESCRIPCION),
                Click.on(CLIC_HORARIO),
                Click.on(CLIC_DOS_HORARIO),
                Click.on(BTN_CONFIRMAR),
                Esperar.esperarEnSegundos(1000),
                Click.on(HORARIOS),
                Esperar.esperarEnSegundos(2000),
                Click.on(DESPLEGAR_DIAS),
                Click.on(SELECCIONAR_SEMANA),
                Click.on(SELECCIONAR_HORARIO),
                Click.on(BTN_CONFIRMAR_HORARIO),
                Click.on(CUENTAS),
                Esperar.esperarEnSegundos(2000),
                Click.on(CREAR_CUENTA),
                Click.on(SELECCIONAR_CHAT),
                Esperar.esperarEnSegundos(4000),
                Enter.theValue(obtener("accountname")).into(TEXT_NOMBRE_CUENTA),
                Click.on(DISTRIBUCION),
                Click.on(SELECCIONAR_DISTRIBUCCION),
                Click.on(IDIOMA),
                Click.on(SELECCIONAR_IDIOMA),
                Enter.theValue(obtener("umbrales")).into(UMBRALES),
                Click.on(BTN_CONFIRMAR_CUENTAS),
                Esperar.esperarEnSegundos(3000),
                Click.on(BTN_CERRAR_POP),
                Click.on(BTN_ATRAS),
                Enter.theValue(obtener("campaignname")).into(TXT_BUSCAR),
                Click.on(BUSCAR),
                Esperar.esperarEnSegundos(3000)

        );
    }

    public static CreateCampaign createCampaign(){
        return instrumented(CreateCampaign.class);
    }

}
