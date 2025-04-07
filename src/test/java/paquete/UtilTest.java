package paquete;

import org.junit.Assert;
import org.junit.Test;

public class UtilTest 
{
	@Test
	public void mediaTest()
	{
		double[] valores = {6.0, 5.4};
		double media = Util.media(valores);
		Assert.assertEquals(5.7, media, 0.01);
	}
	
	@Test
	public void mediaTestGivenEmptyArray()
	{
		double[] valores = {};
		double media = Util.media(valores);
		Assert.assertEquals(Double.NaN, media, 0.01);
	}
	
	@Test(expected = Exception.class)
	public void aptoGivenIncorrectFormatInputThrowsException() throws Exception
	{
		Util.isApto("no");
	}
	
	@Test
	public void aptoGivencorrectFormatInput() throws Exception
	{
		Assert.assertEquals(true, Util.isApto("Apto"));
		Assert.assertEquals(false, Util.isApto("no apto"));
		
		try
		{
			Util.isApto("asdfas");
		}
		catch (Exception ex)
		{
			Assert.assertEquals("Opcion no valida", ex.getMessage());
		}
	}
}
