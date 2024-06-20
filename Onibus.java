package model;

public class Onibus {
    private int idOnibus;
    private String marcaOnibus;
    private String modeloOnibus;
    private String placaOnibus;

    // Construtor padrão
    public Onibus() {}

    // Construtor com parâmetros
    public Onibus(int idOnibus, String marcaOnibus, String modeloOnibus, String placaOnibus) {
        this.idOnibus = idOnibus;
        this.marcaOnibus = marcaOnibus;
        this.modeloOnibus = modeloOnibus;
        this.placaOnibus = placaOnibus;
    }

    // Getters e Setters
    public int getIdOnibus() {
        return idOnibus;
    }

    public void setIdOnibus(int idOnibus) {
        this.idOnibus = idOnibus;
    }

    public String getMarcaOnibus() {
        return marcaOnibus;
    }

    public void setMarcaOnibus(String marcaOnibus) {
        this.marcaOnibus = marcaOnibus;
    }

    public String getModeloOnibus() {
        return modeloOnibus;
    }

    public void setModeloOnibus(String modeloOnibus) {
        this.modeloOnibus = modeloOnibus;
    }

    public String getPlacaOnibus() {
        return placaOnibus;
    }

    public void setPlacaOnibus(String placaOnibus) {
        this.placaOnibus = placaOnibus;
    }
}
