package Senati.ddw.ciclo3.clase01b;

public class Ejercicio005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sueldob=0;
		float d1=0f;
		float d2=0f;
		float d3=0f;
		float sn=0f;
		
		sueldob = 2500;
		
		d1 = sueldob * 0.10f;
		d2 = sueldob * 0.05f;
		d3 = (sueldob - d1 - d2) * 0.03f;
		sn = sueldob-d1-d2-d3;
		
		System.out.println("Sueldo: " +sueldob);
		System.out.println("Descuento 1: " +d1);
		System.out.println("Descuento 2: " +d2);
		System.out.println("Descuento 3: " +d3);
		System.out.println("Sueldo Neto: " +sn);

		
		
		
	}

}
