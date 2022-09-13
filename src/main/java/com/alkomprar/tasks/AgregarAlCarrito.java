package com.alkomprar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitWithTimeout;
import org.openqa.selenium.Keys;

import static com.alkomprar.userinterfaces.ConfirmacionCarritoPage.CONTINUAR_ELEMENTO;
import static com.alkomprar.userinterfaces.DetalleArticuloPage.AGREGAR_ELEMENTO_CARRITO;
import static com.alkomprar.userinterfaces.GoogleResultadosPage.RESULTADOS_BUSQUEDA;
import static com.alkomprar.userinterfaces.GoogleSearchPage.CAMPO_BUSQUEDA;
import static com.alkomprar.userinterfaces.GoogleSearchPage.GOOGLE_HOME_PAGE;
import static com.alkomprar.userinterfaces.MenuPage.CATEGORIA;
import static com.alkomprar.userinterfaces.MenuPage.PRIMER_SUB_CATEGORIA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarAlCarrito implements Task {
    private String categoria;

    public AgregarAlCarrito(String categoria) {
        this.categoria = categoria;
    }

    public static Performable elemento(String categoria) {
        return instrumented(AgregarAlCarrito.class, categoria);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(CATEGORIA.of(categoria)),
                WaitUntil.the(PRIMER_SUB_CATEGORIA.of(categoria), isVisible()),
                Click.on(PRIMER_SUB_CATEGORIA.of(categoria)),
                WaitUntil.the(AGREGAR_ELEMENTO_CARRITO, isClickable()),
                Click.on(AGREGAR_ELEMENTO_CARRITO),
                Click.on(CONTINUAR_ELEMENTO)
        );
    }
}
