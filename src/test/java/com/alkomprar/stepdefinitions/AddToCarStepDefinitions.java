package com.alkomprar.stepdefinitions;

import com.alkomprar.tasks.AgregarAlCarrito;
import com.alkomprar.tasks.BuscarEnGoogle;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.alkomprar.userinterfaces.CarritoPage.ARTICULOS_CARRITO;
import static com.alkomprar.userinterfaces.GoogleResultadosPage.PRIMER_RESULTADO;
import static com.alkomprar.userinterfaces.MenuPage.CARRITO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddToCarStepDefinitions {

    @Cuando("^(.*) quiere comprar un articulo de las categorias (.*), (.*), (.*)  y (.*)$")
    public void rodolfoQuiereComprarUnCelularComputadorTvYLlanta(String actor, String categoria1, String categoria2, String categoria3, String categoria4) {
        theActorCalled(actor).attemptsTo(
                Open.url("https://www.alkosto.com/"),
                AgregarAlCarrito.elemento(categoria1)
                //AgregarAlCarrito.elemento(categoria2),
                //AgregarAlCarrito.elemento(categoria3)
                //AgregarAlCarrito.elemento(categoria4)
        );
    }
    @Entonces("debe ver {int} articulos en el carrito")
    public void debeVerEnElCarrito(int cantidadArticulos) {
        theActorInTheSpotlight().attemptsTo(
                Click.on(CARRITO),
                Ensure.that(ARTICULOS_CARRITO).values().hasSize(cantidadArticulos)
        );
    }

}
