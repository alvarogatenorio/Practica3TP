package pr3.control.comandos;

import pr3.control.Controlador;

public class Iniciar implements Comando {

	public void ejecuta(Controlador controlador) {
		System.out.println("Inicializando mundo...");
		controlador.inicializar();
	}

	public Comando parsea(String[] cadenaComando) {
		Comando comando = null;
		if (cadenaComando[0].equals("INICIAR"))
			comando = this;
		return comando;
	}

	public String textoAyuda() {
		return "INICIAR:\t\tInicializa el mundo.\n";
	}

}
