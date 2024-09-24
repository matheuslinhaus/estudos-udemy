package util;

public class ConversorMoedas {
	
	private static final double IOF = 0.06;
	
	public static Double calcularCompra(Double dolar, Double quantidade) {
		return (dolar * quantidade) + (dolar * quantidade * IOF);
	
	}

}
