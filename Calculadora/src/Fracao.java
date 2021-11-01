import javax.swing.JOptionPane;

class Fracao{
	private int numerador;
	private int denominador;

	public Fracao( int num, int den ){
		numerador = num;
		denominador = den;
	}
	
	public void multiplicacao( int x, int y )
	{
		numerador = numerador * x;
		denominador = denominador * y;
		JOptionPane.showMessageDialog( null, numerador + "*" + denominador );
	}
	
	public void divisao( int x, int y )
	{
		numerador = numerador / y;
		denominador = denominador / x;
		JOptionPane.showMessageDialog( null, numerador + "/" + denominador );
	}
	
	public void subtracao( int x, int y )
	{
		numerador = numerador - y;
		denominador = denominador - x;
		JOptionPane.showMessageDialog( null, numerador + "-" + denominador );
		
	}
	public void adicao( int x, int y )
	{
		numerador = numerador + y;
		denominador = denominador + x;
		JOptionPane.showMessageDialog( null, numerador + "+" + denominador );
	}
}

