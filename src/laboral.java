
public class laboral {

	public static String laboral(String DIA) {
		String Resultado="";
		
		switch (DIA) {
			case "lunes":
			case "martes":
			case "miercoles":
			case "jueves":
			case "viernes":
			String Laboral = "Es un dia laboral";
			Resultado= Laboral;
			case "sabado":
			case "domingo":
			String NoLaboral = "Es un dia no laboral";
			Resultado=NoLaboral;
			default:
				Resultado="Introduzca un dia de la semana:";
		}
		return Resultado;
	}

	public laboral() {
		super();
	}

}