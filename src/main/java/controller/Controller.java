package controller;

import java.util.ArrayList;

public class Controller {

	public ArrayList<Utilizador> listaUtilizador() {
		ArrayList<Utilizador> lista = new ArrayList<Utilizador>();
		
		Utilizador utilizador1 = new Utilizador("Leonildo", "leonildo.moniz@nosi.cv", "9101112", "user.leonildo",
				"StrongPassword1");
		Utilizador utilizador2 = new Utilizador("Varela", "varela.lopes@nosi.cv", "9101113", "user.varela",
				"StrongPassword2");
		Utilizador utilizador3 = new Utilizador("Carlos", "carlos.borges@nosi.cv", "9101114", "user.carlos",
				"StrongPassword3");
		Utilizador utilizador4 = new Utilizador("Lozano", "lozanoo.perreira@nosi.cv", "9101115", "user.lozano",
				"StrongPassword4");
		Utilizador utilizador5 = new Utilizador("Maria", "maria.tavares@nosi.cv", "9101116", "user.maria",
				"StrongPassword5");
		Utilizador utilizador6 = new Utilizador("Carla", "carla.pina@nosi.cv", "9101117", "user.carla",
				"StrongPassword7");
		Utilizador utilizador7 = new Utilizador("Jorges", "jorges.gomes@nosi.cv", "9101118", "user.jorge",
				"StrongPassword7");
		lista.add(utilizador1);
		lista.add(utilizador2);
		lista.add(utilizador3);
		lista.add(utilizador4);
		lista.add(utilizador5);
		lista.add(utilizador6);
		lista.add(utilizador7);
		
		return lista;
	}
	
	// verefica se o utilizador esta logado
		protected boolean authencication(String username, String password) {
			
			for (int i = 0; i < listaUtilizador().size(); i++) {
				if ((listaUtilizador().get(i).getUser().equals(username) && listaUtilizador().get(i).getPassword().equals(password))
						&& isValidlenghtPassword(password)) {
					return true;
				}
			}
			return false;
		}
		// retorna tamanho de password
		protected boolean isValidlenghtPassword(String password) {
			return (password.length() >= 12 && password.length() <= 64);
		}
		// vereficar input
		protected boolean isValidName(String name) {
			return name.matches("[a-zA-Z]{2,}");
		}
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	public int subtract(int num1, int num2) {
		return num1 - num2;
	}

	public int subtract(int num1, int num2, int num3) {
		return num1 - num2 - num3;
	}
}
