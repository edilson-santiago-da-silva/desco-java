import javax.swing.*;

class ProgDecisao{
	public static void main(String entrada[]){
		int num;
		char op = 0;
		String msg = "", msgEntr = "Digite 1 para par/impar\nDigite 2 para positivo/negativo:";

		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro:"));  //Entrada de Dados.
		op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);
		
		switch(op) {
			case '1': {
				if(num % 2 == 0) {
					msg += num + " Eh par.\n";
				}
				else {
					msg = msg + num + " Eh impar.\n";
				}
				break;
			}
			
			case '2': {
				if(num > 0) {
					msg = msg + num + " Eh positivo\n";
				}
				else {
					msg = msg + num + " Eh negativo\n";
				}
				break;
			}
		default: JOptionPane.showMessageDialog(null, "Opcão invalida, calculos não realizados");
		}
		
		if (op == '1' || op == '2') {  //Saida de processamentos.
			JOptionPane.showMessageDialog(null, msg);
		}
		
		System.exit(0);
	}
}