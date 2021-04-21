package viacep;

public class Endereco {
    public String logradouro; //Ele amarra no json da classe ServicoDeCep por conta da lib Gson, a observacao é que seja exatamente igual ao Json de retorno
    public String bairro;
    public String localidade;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
}
