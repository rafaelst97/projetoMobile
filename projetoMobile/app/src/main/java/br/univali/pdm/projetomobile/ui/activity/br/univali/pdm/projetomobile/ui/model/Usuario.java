package br.univali.pdm.projetomobile.ui.activity.br.univali.pdm.projetomobile.ui.model;

public class Usuario {

    private static String email = new String();
    private static String senha = new String();

    public Usuario(String email, String senha) {

        this.email = email;
        this.senha = senha;

    }

    public static boolean validaSenha(String senha, String confirmacaoSenha){

        if (senha == confirmacaoSenha){
            return true;
        }else{
            return false;
        }
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Usuario.email = email;
    }

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String senha) {
        Usuario.senha = senha;
    }
}
