import java.util.Scanner;

public class App {
    public static void main(String[] args){
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        int nota4 = 0;
        int media = 0;
        String nome= "";
        
        Scanner getData = new Scanner(System.in);
        
        System.out.println("Inform o nome do aluno: ");
        nome = getData.next();
        
        System.out.println("Digite o primeiro valor: ");
        nota1 = getData.nextInt();
        
        System.out.println("Digite o segundo valor: ");
        nota2 = getData.nextInt();
        
        System.out.println("Digite o segundo valor: ");
        nota3 = getData.nextInt();
        
        System.out.println("Digite o segundo valor: ");
        nota4 = getData.nextInt();
        
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.printf("A média do aluno %s é: %d", nome, media);
    }
}
