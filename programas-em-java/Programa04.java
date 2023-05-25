//salvar como Programa04.java
import javax.swing.*;

class Programa04{
	public static void main(String entrada[]){
		int n1, n2, div; // declaracao das variaveis.
		double pot;
		String msg="";

		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: ")); //entrada de dados
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));

		div = (int)n1 / (int)(n2); //Processamento
		pot = Math.pow(n1,n2);

		msg = msg + "Quociente da divisão de " + n1 + " por " + n2 + " = " + div + "\n";
		msg = msg + "Potência de " + n1 + " por " + n2 + " = " + pot + "\n";
		JOptionPane.showMessageDialog(null, msg); // saida na tela.
	
		System.exit(0);
	}
}