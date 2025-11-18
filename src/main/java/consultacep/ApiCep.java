package consultacep;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;


public class ApiCep {
    
    public Endereco buscarCep(String cep) throws IOException, InterruptedException {

        URI endereco = URI.create("https://viacep.com.br/ws/"+cep+"/json/");

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
            .uri(endereco)
            .GET()
            .build();

        HttpResponse<String> resposta = client.send(request, HttpResponse.BodyHandlers.ofString());

        String informacoesCep = resposta.body();

        Gson gson = new Gson();

        Endereco informacoesEndereco = gson.fromJson(informacoesCep, Endereco.class);

        return informacoesEndereco;
    }
}
