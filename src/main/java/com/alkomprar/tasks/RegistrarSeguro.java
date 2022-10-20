package com.alkomprar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.alkomprar.userinterfaces.ConfirmacionCarritoPage.CERRAR_MODAL;
import static com.alkomprar.userinterfaces.DetalleArticuloPage.AGREGAR_ELEMENTO_CARRITO;
import static com.alkomprar.userinterfaces.DetalleArticuloPage.DIV_PRIMER_ELEMENTO;
import static com.alkomprar.userinterfaces.MenuPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegistrarSeguro implements Task {
    private String seguro;

    public RegistrarSeguro(String seguro) {
        this.seguro = seguro;
    }

    public static Performable elemento(String seguro) {
        return instrumented(RegistrarSeguro.class, seguro);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                MoveMouse.to(CATEGORIA.of("Otros")),
                WaitUntil.the(SEGURO_CATEGORIA.of("Otros"), isVisible()),
                Click.on(SEGURO_CATEGORIA.of("Otros")),
                WaitUntil.the(SEGURO_BOTON, isClickable()),
                Click.on(SEGURO_BOTON)
        );
    }
}