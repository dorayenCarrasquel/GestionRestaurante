package br.com.zup;

import java.util.Scanner;

public class Sistema {
    private static Scanner capturarDados(String mensagem){
        System.out.println(memsagem);
        return new Scanner(System.in);
    }

    public static void menu(){
        System.out.println("\n===================================");
        System.out.println("\n\t\tM E N U");
        System.out.println("\n===================================");
        System.out.println("[1] Cadastrar Prato");
        System.out.println("[2] cadastrar Cardapio");
        System.out.println("[3] Exibir Cardapio");
        System.out.println("[4] Sair");
    }
    public static Ingrediente cadastrarIngredientes(){
       String nome = capturarDados("Digite um Ingrediente").nextLine();
       Ingrediente ingredientes = new Ingrediente(nome);
       return ingredientes;

    }
    public static void
    public static void executar(){
        menu();


    }




}
