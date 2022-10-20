package com.alkomprar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuPage {
	public static final Target OPTION_EMAIL= Target.the("opcion Correo").locatedBy("//li[@id='js-loginEmail']");
	public static final Target CATEGORIA = Target.the("Categoria {0} del menu").locatedBy("//li[@data-category='{0}']/a[@title='{0}']");
	public static final Target PRIMER_SUB_CATEGORIA = Target.the("Primer subcategoria de {0}").locatedBy("//li[@data-category='{0}']//div[@data-subcategory]//li[@class='main-navigation__subcategory__items__subitems']/ul/li/a[@data-name]");
	public static final Target CARRITO = Target.the("Primer subcategoria de {0}").locatedByFirstMatching("//a[@href='/cart']");
	public static final Target TXT_CORREO = Target.the("texto Correo").locatedBy("//input[@id='js-login-email']");
	public static final Target TXT_BUSCAR = Target.the("Buscador").locatedByFirstMatching("//input[@name='text']");
	public static final Target LOGIN = Target.the("Boton Login").locatedBy("//a[@href='/my-account']");
	public static final Target LOGIN_IN = Target.the("Boton Ingresar").locatedBy("//button[@id='js-login-continue']");
	public static final Target SEGURO_CATEGORIA = Target.the("Seguros").locatedBy("//a[@class='main-navigation__subcategory__label js-main-navigation-open-subitems'][normalize-space()='Seguros']");
	public static final Target SEGURO_BOTON = Target.the("Boton seguro personal").locatedBy("//h2[@class='color_azul tit_par txt-seguros']");
}