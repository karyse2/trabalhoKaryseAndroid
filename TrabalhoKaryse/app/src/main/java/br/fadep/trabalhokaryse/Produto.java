package br.fadep.trabalhokaryse;

/**
 * Created by karyse on 07/04/17.
 */

public class Produto {

    private String Codigo;
    private String NomeProduto;
    private String Embalagem;
    private String Marca;
    private String PrecoCusto;
    private String PrecoVenda;
    private String Obs;

    public String getCodigo() {
        return Codigo;
    }

    public String getNomeProduto() {
        return NomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        NomeProduto = nomeProduto;
    }

    public String getEmbalagem() {
        return Embalagem;
    }

    public void setEmbalagem(String embalagem) {
        Embalagem = embalagem;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getPrecoCusto() {
        return PrecoCusto;
    }

    public void setPrecoCusto(String precoCusto) {
        PrecoCusto = precoCusto;
    }

    public String getPrecoVenda() {
        return PrecoVenda;
    }

    public void setPrecoVenda(String precoVenda) {
        PrecoVenda = precoVenda;
    }

    public String getObs() {
        return Obs;
    }

    public void setObs(String obs) {
        Obs = obs;
    }

}
