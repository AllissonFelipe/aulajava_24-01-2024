package controller;
import model.*;
import view.*;

public class RespostaTelaInicial {
    
    public static void menu(String resp) {
        switch (resp) {
            case "1":
                PaginaInicial.opcoes();
                break;
            case "2":
                PaginaInicial.saindo(InterfacePadoka.respSaindo);  
                break;
            default:
                break;
        }
    }
    
    public static void escolhaMenu(String resp) {
        switch (resp) {
            case "1":
                PaginaInicial.login();
                break;
            case "2":
                PaginaInicial.cadastro();
                break;
            case "3":
                InterfacePadoka.resp = Cardapio.exibirCardapio();
                PaginaInicial.mostrarCardapio(InterfacePadoka.resp);
                break;
            case "4":
                InterfacePadoka.resp = "Saindo...";
                PaginaInicial.saindo(InterfacePadoka.resp);
                break;
            default:
                break;
        }
        
        
        
        /*if (resp.equals("1")) {
            InterfacePadoka.resp = Cardapio.exibirCardapio();
            PaginaInicial.mostrarCardapio(InterfacePadoka.resp);
        } else {
            InterfacePadoka.resp = "Saindo...";
            PaginaInicial.saindo(InterfacePadoka.resp);
        }*/
    }
}
