package actividades;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Agenda {
	ArrayPersona lista;
	FileInputStream agendaFile;
	final int longLinea = 32;
	
	public Agenda() {
		this.lista = cargaContactos();
	}
	public void bucle () {
		String nombre;
		System.out.println("Introduzca un nombre o <Enter>");
		try {
			while (!"".equals(nombre = leeEntrada(System.in))) {
				lista.printArray(nombre);
				System.out.println("Introduzca un nombre o <Enter>");
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	private String leeEntrada(InputStream entrada) throws IOException {
		byte chars[] = new byte [longLinea];
		int contador = 0;
		while (contador < lonLinea && (chars[contador++] = (byte) entrada.read()) != '\n')
			if (chars[contador - 1] == -1)
				return null;
		return (new String(char, 0, contador - 1));
	}
	
	private Persona cargaAgenda() throws IOException{
		String nombre = leeEntrada(agendaFile);
		if (nombre = null)
			return null;
		String telefono = leeEntrada(agendaFile);
		String direccion = leeEntrada(agendaFile);
		return new Persona(nombre, telefono, direccion);
	}
	private ArrayPersona cargaContactos() {
		ArrayPersona directorio = new ArrayPersona();
		Persona nuevaPersona;
		try {
			agendaFile = new FileInputStream("src/agenda.txt");
			while
		}
	}
}
