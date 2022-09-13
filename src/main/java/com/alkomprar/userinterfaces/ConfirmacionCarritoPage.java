package com.alkomprar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmacionCarritoPage {
	public static final Target CONTINUAR_ELEMENTO = Target.the("Boton continuar del carrito").located(By.xpath("//div[@class='cart-pop-up__content']/aside/div/button"));
}
