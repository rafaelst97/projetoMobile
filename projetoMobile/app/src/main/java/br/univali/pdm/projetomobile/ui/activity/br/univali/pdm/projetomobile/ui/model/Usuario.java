package br.univali.pdm.projetomobile.ui.activity.br.univali.pdm.projetomobile.ui.model;

public class Usuario {

    private static String email = new String();
    private static String senha = new String();

    public Usuario() {
    }

    public Usuario(String email, String senha) {

        this.email = email;
        this.senha = senha;

    }

    public static String getEmail() {
        return email;
    }

    public static String getSenha() {
        return senha;
    }
}
