package ac2_banco;
import java.util.Scanner;
public class AC2_Banco {
     @SuppressWarnings("fallthrough")
     public static void main(String[] args){

        String cpf = "123.456.789-00", cpfteste, senha;
        int menu, tentativas = 3, sair =1;
        float deposito, saque, saldo = 1000;
        Scanner ler = new Scanner (System.in);
        
        System.out.println("==========================================");
        System.out.println("============== BEM-VINDO =================");
        System.out.println("==========================================");

        System.out.print("Digite seu CPF: ");
        cpfteste = ler.nextLine();
        if (cpf.equals(cpfteste)) {
            do {
                System.out.print("Digite sua senha: ");
                senha = ler.nextLine();
                if (!"01020304".equals(senha)) {
                    System.out.println("Senha INCORRETA!");
                   tentativas--;
                    System.out.println("Tentativas restantes: "+tentativas);
                   
                } if (tentativas == 0) {
                    System.out.println("Tentativas esgotadas");
                    System.exit(0);
                }

            }while (!"01020304".equals(senha) && tentativas != 0);
            while (sair != 0) {
            System.out.println("Menu de opções");
            System.out.println("Digite 1 para ver SALDO;"
                    + " \nDigite 2 para fazer DEPÓSITO;"
                    + " \nDigite 3 para fazer SAQUE"
                    + " \nDigite 0 para SAIR: ");
                menu = ler.nextInt();
                
                switch (menu){
                    case (1):
                        System.out.println("Seu SALDO  atual é de $" +saldo);
                        break;
                    case (2):
                        System.out.println("Digite o valor do DEPÓSITO");
                        deposito = ler.nextFloat();
                        saldo = deposito + saldo;
                        System.out.println("Seu novo saldo atual é de $" + saldo);
                        break;
                    case (3):
                        System.out.println("Digite o valor do SAQUE: ");
                        saque =ler.nextFloat();
                        saldo = saldo - saque;
                        System.out.println("Seu saldo atual é de $" +saldo);
                        break;
                    case (0):
                        System.out.println("OBRIGADO, VOLTE SEMPRE!!");
                        sair = -1;
                        System.exit(0);
                        break;
                }
            }
            
        } else {
            System.out.println("CPF incorreto");
            System.exit(0);
        }
    }
}
