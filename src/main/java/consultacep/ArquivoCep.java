package consultacep;

import java.io.FileWriter;
import java.io.IOException;

public class ArquivoCep {
    
    public void arquivo(Endereco endereco){

        String caminho = System.getProperty("user.home")
            +"/Documents/Projetos_Back/cepProject/src/main/java/consultacep/arquivosCep/"
            +endereco.getCep()
            +".txt";

        try {

            FileWriter escrita = new FileWriter(caminho);
            escrita.write(endereco.toString());
            escrita.close();
            System.out.println("Arquivo salvo com sucesso!");

        } catch(IOException e){
            System.out.println("Erro ao salvar o arquivo "+e.getMessage());
        }
    }
}
