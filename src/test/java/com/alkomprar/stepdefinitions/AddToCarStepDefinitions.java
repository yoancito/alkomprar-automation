package com.alkomprar.stepdefinitions;

import com.alkomprar.tasks.AgregarAlCarrito;
import com.alkomprar.tasks.BuscarYAgregarCarrito;
import com.alkomprar.tasks.ModificarCantidad;
import com.alkomprar.tasks.RegistrarSeguro;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.ensure.web.ElementLocated;

import static com.alkomprar.userinterfaces.CarritoPage.ALERT_MESSAGE;
import static com.alkomprar.userinterfaces.CarritoPage.ARTICULOS_CARRITO;
import static com.alkomprar.userinterfaces.SeguroPage.SEGURO_BUTTON;
import static com.alkomprar.userinterfaces.MenuPage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddToCarStepDefinitions {

    @Cuando("{string} quiere comprar un articulo de las categorias {string}, {string}, {string}  y {string}")
    public void rodolfoQuiereComprarUnCelularComputadorTvYLlanta(String actor, String categoria1, String categoria2, String categoria3, String categoria4) {
        theActorCalled(actor).attemptsTo(
                Open.url("https://www.alkosto.com/"),
                AgregarAlCarrito.elemento(categoria1),
                AgregarAlCarrito.elemento(categoria2),
                AgregarAlCarrito.elemento(categoria3),
                AgregarAlCarrito.elemento(categoria4)
        );
    }
    @Entonces("debe ver {int} articulos en el carrito")
    public void debeVerEnElCarrito(int cantidadArticulos) {
        theActorInTheSpotlight().attemptsTo(
                Click.on(CARRITO),
                Ensure.that(ARTICULOS_CARRITO).values().hasSize(cantidadArticulos)
        );
    }
    @Cuando("{string} quiere comprar un {string}")
    public void rodolfoQuiereComprarUnIphone(String actor, String item) {
        theActorCalled(actor).attemptsTo(
                Open.url("https://www.alkosto.com/"),
                BuscarYAgregarCarrito.elemento(item)
        );
    }
    @Entonces("debe ver en el carrito de comprar {string}")
    public void debeVerEnElCarritoDeComprarIphone(String item) {
        theActorInTheSpotlight().attemptsTo(
                Click.on(CARRITO.of(item)),
                Ensure.that(ARTICULOS_CARRITO).values().hasSize(2)
        );
    }
    @Cuando("{string} quiere ingresar al login")
    public void Rodolfoquiereingresarallogin(String actor) {
        theActorCalled(actor).attemptsTo(
                Open.url("https://www.alkosto.com/"),
                Click.on(LOGIN),
                Enter.theValue("sebastianzeta211@gmail.com").into(TXT_CORREO),
                Click.on(LOGIN_IN),
                Click.on(OPTION_EMAIL)
        );
    }
    @Entonces("debe abrir sesion")
    public void debeabrirsesion() {
        theActorInTheSpotlight().attemptsTo(
                // Open.url("https://www.alkosto.com/"),
                Ensure.that(ElementLocated.by("#loginOptionModal")).silently().isDisplayed()
                // Ensure.that(ARTICULOS_CARRITO).values().hasSize(1)
        );
    }
    @Cuando("{string} quiere agregar un producto de la categoria {string} y modificar el carrito para tener {int} de cantidad de un mismo producto")
    public void rodolfoQuiereModificarCarrito(String actor, String categoria, int cantidad) {
        theActorCalled(actor).attemptsTo(
                Open.url("https://www.alkosto.com/"),
                AgregarAlCarrito.elemento(categoria),
                Click.on(CARRITO),
                ModificarCantidad.elemento(cantidad)
        );
    }
    @Entonces("debe ver la alerta {string}")
    public void deberVerAlerta(String message){
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(ALERT_MESSAGE).text().isEqualTo("La cantidad del producto ha sido actualizada.")
        );
    }
    @Cuando("{string} quiere registrar un {string}")
    public void registrarUnSeguro(String actor, String seguro){
        theActorCalled(actor).attemptsTo(
                Open.url("https://www.alkosto.com/"),
                RegistrarSeguro.elemento(seguro)
        );
    }
    @Entonces("debe ver la pagina con el boton de {string}")
    public void debeVerBotonSeguro(String seguro){
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(SEGURO_BUTTON).text().isEqualTo(seguro)
        );
    }
}
