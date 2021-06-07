import java.util.*;

public class atividade2 {
    public static void main(String[] args) {
        
        int v1, v2, v3;
        Scanner resp = new Scanner(System.in);

        System.out.println("Digite um valor:");
        v1 = resp.nextInt();

        System.out.println("Digite outro valor:");
        v2 = resp.nextInt();

        System.out.println("Digite outro valor:");
        v3 = resp.nextInt();

        if(v1 > v2 && v1 > v3) {
            System.out.println(v1 + " é o maior numero");
        }else if(v2 > v1 && v2 > v3) {
            System.out.println(v2 + " é o maior numero");
        }else{
            System.out.println(v3 + " é o maior numero");
        }
    }
}
