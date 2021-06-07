import java.util.*;
public class atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op;
        double v1, v2, tot;

        System.out.println("Digite um valor:");
        v1 = sc.nextDouble();

        System.out.println("Digite outro valor:");
        v2 = sc.nextDouble();

        System.out.println("Escolha uma operação matematica:");
        System.out.println("Somar");
        System.out.println("Subtrair");
        System.out.println("Dividir");
        System.out.println("Multiplicar");
        op = sc.next();

        if (op.contains("Somar")){
            tot = v1 + v2;
            System.out.println(v1 + " + " + v2 + " = " + tot);
        }else if (op.contains("Subtrair")){
            tot = v1 - v2;
            System.out.println(v1 + " - " + v2 + " = " + tot);
        }else if (op.contains("Dividir")){
            tot = v1 / v2;
            System.out.println(v1 + " / " + v2 + " = " + tot);
        }else if (op.contains("Multiplicar")){
            tot = v1 * v2;
            System.out.println(v1 + " * " + v2 + " = " + tot);
        }else {
            System.out.println("Opção não reconhecida!");
        }
    }
}
