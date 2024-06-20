package model;

public class Motorista {
    private int idMotorista;
    private String nomeMotorista;
    private String numCPF;

    // Construtor padrão
    public Motorista() {}

    // Construtor com parâmetros
    public Motorista(int idMotorista, String nomeMotorista, String numCPF) {
        this.idMotorista = idMotorista;
        this.nomeMotorista = nomeMotorista;
        this.numCPF = numCPF;
    }

    // Getters e Setters
    public int getIdMotorista() {
        return idMotorista;
    }

    public void setIdMotorista(int idMotorista) {
        this.idMotorista = idMotorista;
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    public String getNumCPF() {
        return numCPF;
    }

    public void setNumCPF(String numCPF) {
        this.numCPF = numCPF;
    }
}
