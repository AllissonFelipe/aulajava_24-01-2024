package view;
import controller.*;
import java.util.*;

public class PaginaInicial {
    
    public static void inicial() {
        Scanner scnResp = new Scanner(System.in);
        String resp;

        System.out.println("Bem vindo a padoka!");
        System.out.println("Para ver o nossas opções digite [1] ou digite [2] para sair");
        resp = scnResp.nextLine();
        RespostaTelaInicial.menu(resp);
        scnResp.close();
    }
    
    public static void mostrarCardapio(String resp) {
        System.out.println(resp);
        System.out.println(InterfacePadoka.respIndisponivel);
        opcoes();
    }
    
    public static void saindo(String resp) {
        System.out.println(resp);
    }
    
    public static void opcoes() { 
        Scanner scnOpcoes = new Scanner(System.in);

        System.out.println("[1] - Fazer Login.\n[2] - Cadastro.\n[3] - Ver nosso Cardapio.\n[4] - Voltar.");
        String strOpcoes = scnOpcoes.nextLine();
        RespostaTelaInicial.escolhaMenu(strOpcoes);

    }
    
    public static void login() {
        Scanner scnLogin = new Scanner(System.in);
        Scanner scnSenha = new Scanner(System.in);
        
        System.out.println("Digite seu ID: ");
        String strId = scnLogin.nextLine();
        System.out.println("Digite sua Senha: ");
        String strSenha = scnSenha.nextLine();


    }
    
    public static void cadastro() {
        Scanner scnId = new Scanner(System.in);
        Scanner scnSenha = new Scanner(System.in);

    }
}
