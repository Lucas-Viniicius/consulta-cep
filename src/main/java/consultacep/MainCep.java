package consultacep;

import java.io.IOException;

public class MainCep {
    
    public static void main(String[] args) throws IOException, InterruptedException {
        
        //Teste
        ApiCep cep = new ApiCep();
        Endereco endereco = cep.buscarCep("01001000");

        System.out.println(endereco);
    }
}
