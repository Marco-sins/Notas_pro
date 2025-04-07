package paquete;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Nota del primer control: ");
		double primer_control = scan.nextDouble();
		System.out.println("Nota del segundo control: ");
		double segundo_control = scan.nextDouble();
		double[] controles = {primer_control, segundo_control};
		double nota = Util.media(controles);
		if (nota < 5)
		{
			System.out.println("¿Cuál fue el resultado de la recuperacion (apto/no apto)");
			scan.nextLine();
			String recu = scan.nextLine();
			
			try
			{
				if (Util.isApto(recu))
					System.out.println("Tu nota de programacion es 5");
				else
					System.out.println("Tu nota de programacion es " + nota);
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
			}
		}
		else
			System.out.println("Tu nota de programacion es " + nota);
	}
		
	
	
}
