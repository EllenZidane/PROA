import java.util.*;

public class atividade44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        double v1, v2, tot;

        System.out.println("Digite um valor:");
        v1 = sc.nextDouble();

        System.out.println("Digite outro valor:");
        v2 = sc.nextDouble();

        System.out.println("Escolha uma operação matematica:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Dividir");
        System.out.println("4 - Multiplicar");
        op = sc.nextInt();

        if (op == 1){
            tot = v1 + v2;
            System.out.println(v1 + " + " + v2 + " = " + tot);
        }else if (op == 2){
            tot = v1 - v2;
            System.out.println(v1 + " - " + v2 + " = " + tot);
        }else if (op == 3){
            tot = v1 / v2;
            System.out.println(v1 + " / " + v2 + " = " + tot);
        }else if (op == 4){
            tot = v1 * v2;
            System.out.println(v1 + " * " + v2 + " = " + tot);
        }else {
            System.out.println("Opção não reconhecida");
        }
}
}
