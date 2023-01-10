import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Número para iniciar o intervalo: ");
        int n1 = user.nextInt();

        System.out.println("Número para finalizar o intervalo: ");
        int n2 = user.nextInt();

        for(int i = n1; i <= n2; i++){
            
            String numbers = "";

            for(int j = n1; j <= i; j++){
                numbers += i;
            }
            
            System.out.println(numbers);
        }
    }
}
