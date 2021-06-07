import java.util.*;

public class atividade {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero qualquer");
       int resp = sc.nextInt();

        if (resp < 0){
            System.out.println(resp + " é negativo");
        }else if(resp > 0){
            System.out.println(resp + " é positivo");
        }else {
            System.out.println(resp + "é valor nulo");
        }













    }
}
