package model;

import java.time.LocalDateTime;

public class Viagem {
    private int idViagem;
    private int idMotorista;
    private int idOnibus;
    private int idCidadeOrigem;
    private int idCidadeDestino;
    private LocalDateTime horaDePartida;
    private LocalDateTime horaDeChegada;

    // Construtor padrão
    public Viagem() {}

    // Construtor com parâmetros
    public Viagem(int idViagem, int idMotorista, int idOnibus, int idCidadeOrigem, int idCidadeDestino, LocalDateTime horaDePartida, LocalDateTime horaDeChegada) {
        this.idViagem = idViagem;
        this.idMotorista = idMotorista;
        this.idOnibus = idOnibus;
        this.idCidadeOrigem = idCidadeOrigem;
        this.idCidadeDestino = idCidadeDestino;
        this.horaDePartida = horaDePartida;
        this.horaDeChegada = horaDeChegada;
    }

    // Getters e Setters
    public int getIdViagem() {
        return idViagem;
    }

    public void setIdViagem(int idViagem) {
        this.idViagem = idViagem;
    }

    public int getIdMotorista() {
        return idMotorista;
    }

    public void setIdMotorista(int idMotorista) {
        this.idMotorista = idMotorista;
    }

    public int getIdOnibus() {
        return idOnibus;
    }

    public void setIdOnibus(int idOnibus) {
        this.idOnibus = idOnibus;
    }

    public int getIdCidadeOrigem() {
        return idCidadeOrigem;
    }

    public void setIdCidadeOrigem(int idCidadeOrigem) {
        this.idCidadeOrigem = idCidadeOrigem;
    }

    public int getIdCidadeDestino() {
        return idCidadeDestino;
    }

    public void setIdCidadeDestino(int idCidadeDestino) {
        this.idCidadeDestino = idCidadeDestino;
    }

    public LocalDateTime getHoraDePartida() {
        return horaDePartida;
    }

    public void setHoraDePartida(LocalDateTime horaDePartida) {
        this.horaDePartida = horaDePartida;
    }

    public LocalDateTime getHoraDeChegada() {
        return horaDeChegada;
    }

    public void setHoraDeChegada(LocalDateTime horaDeChegada) {
        this.horaDeChegada = horaDeChegada;
    }
}
