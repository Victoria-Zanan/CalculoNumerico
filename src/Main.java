

import org.mariuszgromada.math.mxparser.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean isCallSuccessful = License.iConfirmNonCommercialUse("Ycaro");
        boolean isConfirmed = License.checkIfUseTypeConfirmed();
        String message = License.getUseTypeConfirmationMessage();

        mXparser.consolePrintln("isCallSuccessful = " + isCallSuccessful);
        mXparser.consolePrintln("isConfirmed = " + isConfirmed);
        mXparser.consolePrintln("message = " + message);


        Scanner teclado = new Scanner(System.in);   //instancia teclado
        System.out.println("expressão: ");
        String expressao = teclado.nextLine();  //pega a expressao em formato de string

        System.out.println("x1: ");
        int x1 = teclado.nextInt();
        System.out.println("x2: ");
        int x2 = teclado.nextInt();
        System.out.println("erro: ");

        double erro = teclado.nextDouble();

        double bissecaoResult = new Bissecao().bissecao(x1, x2, erro, expressao);
        double secanteResult = new Secante().secante(x1, x2, erro, expressao);

        System.out.println();

        if (secanteResult == 0) {
            System.out.println("Não há raízes neste intervalo");
        } else {
            System.out.println(">>>>>METODO SECANTE<<<<<");
            System.out.println("A raiz é: " + secanteResult);
        }
        if (bissecaoResult == 0) {
            System.out.println("Não há raízes neste intervalo");
        } else {
            System.out.println(">>>>>METODO BISSEÇÃO<<<<<");
            System.out.println("A raiz é: " + bissecaoResult);
        }
    }
}