package controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ControllerTesting {
	Controller controller = new Controller();
	@Test
	//Verefica se só utilizador cadastrado pode ter acesso
	public void testAutentication() {
		assertEquals(true,controller.authencication("user.leonildo","StrongPassword1"));
	}
	@Test
	//Verefica tamanho minimo de password
	public void testinglenghtPassword() {
		assertEquals(true, controller.isValidlenghtPassword("StrongPassword1"));
	}
	
	@Test
	//Verifica se o nome é valido
	public void testingValidName() {
		assertEquals(true, controller.isValidName("Leonildo"));
	}
	

}
