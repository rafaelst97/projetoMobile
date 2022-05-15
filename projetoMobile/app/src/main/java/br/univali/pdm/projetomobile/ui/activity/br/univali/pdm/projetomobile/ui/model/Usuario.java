package br.univali.pdm.projetomobile.ui.activity.br.univali.pdm.projetomobile.ui.model;

public class Usuario {

    private static String nome = new String();
    private static String sobrenome = new String();
    private static String email = new String();
    private static String cpf = new String();
    private static String matricula = new String();
    private static String senha = new String();

    public Usuario() {
    }

    public static String getNome() {
        return nome;
    }

    public static String getSobrenome() {
        return sobrenome;
    }

    public static String getCpf() {
        return cpf;
    }

    public static String getMatricula() {
        return matricula;
    }

    public static String getEmail() {
        return email;
    }

    public static String getSenha() {
        return senha;
    }

    public Usuario(String email, String senha, String nome, String sobrenome, String cpf, String matricula) {

        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.matricula = matricula;

    }
}
