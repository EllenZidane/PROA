import java.util.*;
public class atividade3 {
    public static void main(String[] args) {

        int v1, v2, v3, tot;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor:");
        v1 = sc.nextInt();

        System.out.println("Digite outro valor:");
        v2 = sc.nextInt();

        System.out.println("Digite outro valor:");
        v3 = sc.nextInt();

        if(v1 > v2 && v2 > v3) {
            tot = v1 + v2;
            System.out.println(tot);
        }else if(v2 > v1 && v3 > v1) {
            tot = v3 + v2;
            System.out.println(tot);
        }else {
            tot = v1 + v3;
            System.out.println(tot);
        }

    }
}
