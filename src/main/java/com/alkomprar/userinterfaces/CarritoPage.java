package com.alkomprar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoPage {
	public static final Target ARTICULOS_CARRITO = Target.the("Articulos carrito").locatedBy("//ul[@class='item__list item__list__cart']/li");
	public static final Target NOMBRE_ARTICULO_CARRITO = Target.the("Nombre Articulos carrito").locatedBy("//span[contains(text(), '{0}')]");
	public static final Target MODIFICAR_CANTIDAD = Target.the("Cantidad").locatedBy("//*[@id=\"quantity_0\"]");
	public static final Target SELECT_CANTIDAD = Target.the("Cantidad value").locatedBy("//*[@id='quantity_0']/option[3]");
	public static final Target ALERT_MESSAGE = Target.the("Alerta").locatedBy("//*[@id=\"noStoreSelected\"]/span");
}
