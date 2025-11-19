package consultacep;

import com.google.gson.annotations.SerializedName;

public class Endereco {
        
    private String cep;
    private String regiao;
    private String estado;
    @SerializedName("localidade")
    private String cidade;
    private String bairro;
    @SerializedName("logradouro")
    private String local;
    private String uf;
    private int ddd;


    public Endereco(String cep, String regiao, String estado, String cidade, String bairro, String local, String uf, int ddd){
        this.cep = cep;
        this.regiao = regiao;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.local = local;
        this.uf = uf;
        this.ddd = ddd;
    }

    @Override 
    public String toString(){
        return 
        "\nCEP: "+this.cep+
        "\nRegião: "+this.regiao+
        "\nEstado: "+this.estado+
        "\nCidade: "+this.cidade+
        "\nBairro: "+this.bairro+
        "\nLocal: "+this.local+
        "\nUf: "+this.uf+
        "\nDDD: "+this.ddd+"\n";
    }
}
