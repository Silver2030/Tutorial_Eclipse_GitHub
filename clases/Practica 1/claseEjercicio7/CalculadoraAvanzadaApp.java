package claseEjercicio7;


import java.util.Scanner;
import javax.swing.JOptionPane;

public class CalculadoraAvanzadaApp {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String signo;
		CalculadoraAvanzada obj = new CalculadoraAvanzada();
		JOptionPane.showMessageDialog(null,"Programa Calculadora");
		System.out.println("+. Sumar");
		System.out.println("-. Restar");
		System.out.println("*. Multiplicar");
		System.out.println("/. Dividir");
		System.out.println("^. Potencia");
		System.out.println("%. Resto");
		signo = in.nextLine();
		while((!"+".equals(signo))&&(!"-".equals(signo))&&(!"*".equals(signo))&&(!"/".equals(signo))&&(!"^".equals(signo))&&(!"%".equals(signo))) {
            System.out.println("Respuesta invalida, por favor vuelta a intentarlo");
            System.out.println("+. Sumar");
    		System.out.println("-. Restar");
    		System.out.println("*. Multiplicar");
    		System.out.println("/. Dividir");
    		System.out.println("^. Potencia");
    		System.out.println("%. Resto");
            signo = in.nextLine();
		}

		obj.setNum1(obj.pedir());
		obj.setNum2(obj.pedir());
		switch(signo) {
		case "+":
			System.out.println(obj.getNum1() + " + " + obj.getNum2() + " = " + (obj.Sumar()));
			break;
		case "-":
			System.out.println(obj.getNum1() + " - " + obj.getNum2() + " = " + (obj.Restar()));
			break;
		case "*":
			System.out.println(obj.getNum1() + " * " + obj.getNum2() + " = " + (obj.Multiplicar()));
			break;
		case "/":
			System.out.println(obj.getNum1() + " / " + obj.getNum2() + " = " + (obj.Dividir()));
			break;
		case "^":
			System.out.println(obj.getNum1() + "^" + obj.getNum2() + " = " + (obj.Potencia()));
			break;
		case "%":
			System.out.println(obj.getNum1() + " % " + obj.getNum2() + " = " + (obj.Resto()));
			break;
			
		}

	}
}
