package com.alkomprar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ui.Dropdown;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.alkomprar.userinterfaces.CarritoPage.SELECT_CANTIDAD;
import static com.alkomprar.userinterfaces.ConfirmacionCarritoPage.CERRAR_MODAL;
import static com.alkomprar.userinterfaces.DetalleArticuloPage.AGREGAR_ELEMENTO_CARRITO;
import static com.alkomprar.userinterfaces.DetalleArticuloPage.DIV_PRIMER_ELEMENTO;
import static com.alkomprar.userinterfaces.MenuPage.CATEGORIA;
import static com.alkomprar.userinterfaces.MenuPage.PRIMER_SUB_CATEGORIA;
import static com.alkomprar.userinterfaces.CarritoPage.MODIFICAR_CANTIDAD;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ModificarCantidad implements Task {

    private int cantidad;

    public ModificarCantidad(int cantidad){this.cantidad = cantidad;}

    public static Performable elemento(int cantidad) {
        return instrumented(ModificarCantidad.class, cantidad);
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(MODIFICAR_CANTIDAD, isClickable()),
                Click.on(MODIFICAR_CANTIDAD),
                Click.on(SELECT_CANTIDAD)
        );
    }
}
