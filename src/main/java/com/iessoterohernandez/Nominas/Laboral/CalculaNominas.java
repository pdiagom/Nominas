package com.iessoterohernandez.Nominas.Laboral;

/**
 * La clase {@code CalculaNominas} es la clase principal que se encarga de calcular y mostrar
 * la nómina de empleados. Contiene el método principal,
 * modificaciones en sus datos y muestra la información relevante.
 */
public class CalculaNominas {

	/**
	 * Crea instancias de {@code Empleado}, actualiza sus datos y
	 * imprime la información de la nómina correspondiente a cada uno.
	 *
	 * @param args Los argumentos de línea de comandos (no se utilizan en esta implementación).
	 */
	public static void main(String[] args) {
		try {
			Empleado e1 = new Empleado("32000032G", "James Cosling", 'M', 4, 7);
			Empleado e2 = new Empleado("32000031F", "Ada Lovelace", 'F');

			escribe(e1, e2);

			e2.incrAnyo();
			e1.setCategoria(9);

			escribe(e1, e2);
		} catch (DatosNoCorrectosException e) {
			System.err.println(e.getMessage());
		}
	}

	/**
	 * Imprime la información de los empleados y su sueldo.
	 *
	 * @param e1 El primer empleado.
	 * @param e2 El segundo empleado.
	 */
	private static void escribe(Empleado e1, Empleado e2) {
		e1.imprime();
		e2.imprime();
		System.out.println("Sueldo de " + e1.nombre + ": " + Nomina.sueldo(e1));
		System.out.println("Sueldo de " + e2.nombre + ": " + Nomina.sueldo(e2));
	}
}
