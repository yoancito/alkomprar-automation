package com.alkomprar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetalleArticuloPage {
	public static final Target AGREGAR_ELEMENTO_CARRITO = Target.the("Agregar elemento al carrito").located(By.xpath("//div[@class='SearchResultsList-ListAddToCartAction']//button[1]"));
}
