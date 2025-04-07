package paquete;

public class Util 
{
	public static double media(double[] n)
	{
		int i = 0;
		double nota = 0;
		while (i < n.length)
		{
			nota += n[i];
			i++;
		}
		nota /= i;
		return (nota);
	}
	
	public static boolean isApto(String str) throws Exception
	{
		if ("apto".equalsIgnoreCase(str))
			return (true);
		else if ("no apto".equalsIgnoreCase(str))
			return (false);
		else
			throw new Exception ("Opcion no valida");
	}
}
