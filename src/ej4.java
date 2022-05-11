import java.util.Scanner;

public class ej4 extends laboral {

	private static final double Pi = 3.14;

	public static void main(String[] args) {
	
		Scanner Reader = new Scanner(System.in);
		System.out.println("Introduzca un dia de la semana:");
		String DIA=Reader.next();
		
		//comprobamos si el dia introducido es laboral o no
		laboral(DIA);
		
		//calculamos el area de una circunferencia dado su radio
		area(Reader);

	}

	public static double area(Scanner Reader) {
		System.out.println("Introduzca el radio de la circunferencia:");
		String RadioCirc=Reader.next();
		double area;
		double r=Double.valueOf(RadioCirc);
		return area = Pi * Math.pow(r, 2);
	}

}
