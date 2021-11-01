import javax.swing.JOptionPane;

public class CalculoFracao
{
	public static void main( String args[] )
	{
		int num, den;
		num = Integer.parseInt(JOptionPane.showInputDialog( "Informe o numerador:" ));
		den = Integer.parseInt(JOptionPane.showInputDialog( "Informe o denominador:" ));
		
		Fracao dados = new Fracao(num, den);
		
		int op;
		
		do
		{
			op = Integer.parseInt( JOptionPane.showInputDialog( "1-Multiplicação \n 2-Divisão \n 3-Subtracao \n 4-Adicao \n 3-Sair"));
			
			if( op == 1 )
			{
				int x = Integer.parseInt( JOptionPane.showInputDialog( "Informe o numerador: "));
				int y = Integer.parseInt( JOptionPane.showInputDialog( "Informe o denominador: "));
				dados.multiplicacao( x, y );
			}
			
			if( op == 2 )
			{
				int x = Integer.parseInt( JOptionPane.showInputDialog( "Informe o numerador: "));
				int y = Integer.parseInt( JOptionPane.showInputDialog( "Informe o denominador: "));
				dados.divisao( x, y );
			}	
			
			if( op == 3 )
			{
				int x = Integer.parseInt( JOptionPane.showInputDialog( "Informe o numerador: "));
				int y = Integer.parseInt( JOptionPane.showInputDialog( "Informe o denominador: "));
				dados.subtracao( x, y );
			}
			
			if( op == 4 )
			{
				int x = Integer.parseInt( JOptionPane.showInputDialog( "Informe o numerador: "));
				int y = Integer.parseInt( JOptionPane.showInputDialog( "Informe o denominador: "));
				dados.adicao( x, y );
			}
		} while(op!=3);
		System.exit(0);	
	}	
}	