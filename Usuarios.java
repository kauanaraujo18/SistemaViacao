package model;

public class Usuarios {
    private int idUsuario;
    private String email;
    private String senha;

    // Construtor padrão
    public Usuarios() {}

    // Construtor com parâmetros
    public Usuarios(int idUsuario, String email, String senha) {
        this.idUsuario = idUsuario;
        this.email = email;
        this.senha = senha;
    }

    // Getters e Setters
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // Método para validar o formato do email
    public boolean isEmailValid() {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailRegex);
    }

    // Método para validar a força da senha
    public boolean isSenhaStrong() {
        // Exemplo de regra: senha deve ter pelo menos 8 caracteres, uma letra maiúscula, uma letra minúscula, um dígito e um caractere especial
        String senhaRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";
        return senha.matches(senhaRegex);
    }
}
