package co.com.google.testing.fdr.stepdefinitions.autentificacion.logueo;


import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static co.com.google.testing.fdr.questions.autentificacion.VerResultadosQuestion.verResultados;
import static co.com.google.testing.fdr.tasks.autentificacion.logueo.IngresarPalabraTask.ingresarValor;
import static co.com.google.testing.fdr.tasks.opensite.OpenSiteTask.openSiteGoogle;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuscarStepDefinitions {


    @Before
    public void initialConfiguration() {
        setTheStage(new OnlineCast());
    }



}
