package informahorario;
import java.util.Scanner;
public class InformaHorario 
{
    public static void main(String[] args)
    {
        int exit = 1;
        while(exit != 0)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("informe seu horário de entrada de 0h a 24h: ");
            int entrada = sc.nextInt();
            
            if (entrada > 24) System.out.println("valor inválido!");
            else
            {
                int saida = entrada + 6;
                if (saida < 25)
                    System.out.println("O seu horário de saída é as: "+saida+"h");
                else
                {
                    int valor = (24 - saida) * (-1);
                    System.out.println("O seu horário de saída é as: "+valor+"h do dia seguinte");
                }
            }
            System.out.println("sair? digite 0: ");
            exit = sc.nextInt();
        }
    }
    
}
