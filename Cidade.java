package model;

public class Cidade {
    private int idCidade;
    private String nomeCidade;

    // Construtor padrão
    public Cidade() {}

    // Construtor com parâmetros
    public Cidade(int idCidade, String nomeCidade) {
        this.idCidade = idCidade;
        this.nomeCidade = nomeCidade;
    }

    // Getters e Setters
    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }
}
