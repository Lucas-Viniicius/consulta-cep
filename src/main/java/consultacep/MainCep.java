package consultacep;

import java.io.IOException;
import java.util.Scanner;

public class MainCep {
    
    public static void main(String[] args) throws IOException, InterruptedException {
        
        Scanner input = new Scanner(System.in);
        ArquivoCep arquivo = new ArquivoCep();
        ApiCep requisicaoCep = new ApiCep();

        String opcao = "";

        while (!opcao.equalsIgnoreCase("nao")){

            System.out.print("\nInforme o CEP: ");
            String cep = input.nextLine();
            
            cep = cep.trim(); // Remove os espaços em branco

            validandoCep(cep);

            Endereco endereco = requisicaoCep.buscarCep(cep);

            System.out.println("\n*************************");
            System.out.println(" Dados do CEP: "+cep);
            System.out.println("*************************");
            System.out.println(endereco);

            arquivo.arquivo(endereco);

            System.out.print("\nDeseja buscar outro CEP ? (sim/não) ");
            opcao = input.nextLine();
            opcao = opcao.trim();

        }
        input.close();
    }

    public static void validandoCep(String cep){

        if (!cep.matches("\\d{8}")) {
            throw new IllegalArgumentException("CEP inválido! Digite apenas 8 números.");
        }
    }
}
