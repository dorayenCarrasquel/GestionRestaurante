package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    private static Scanner capturarDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menu(){
        System.out.println("\n===================================");
        System.out.println("\n\t\tM E N U");
        System.out.println("\n===================================");
        System.out.println("[1] Cadastrar Prato");
        System.out.println("[2] Exibir Cardapio");
        System.out.println("[3] Sair");
    }
    public static Prato cadastrarPrato(){
        String nome = capturarDados("Digite o nome do prato: ").nextLine();
        double valor = capturarDados("Digite o valor do prato: ").nextDouble();
        Prato prato = new Prato(nome,valor);
        return prato;
    }
    public static Ingrediente cadastrarIngredientes(){
       String nome = capturarDados("Digite um Ingrediente: ").nextLine();
       Ingrediente ingredientes = new Ingrediente(nome);

       return ingredientes;

    }


    public static void ListandoOsIngrediente(){
        int cantIngredientes = capturarDados("Digite cantidad de Ingredientes a adicionar: ").nextInt();

        for (int i = 0; i < cantIngredientes; i++) {
        cadastrarIngredientes();
        }

    }
    public static void executar(){

        Cardapio cardapio = new Cardapio("Primavera");

       boolean opcaoMenu =true;

        while (opcaoMenu){
            menu();
            int opcao = capturarDados("Digite uma opcão: ").nextInt();
            if (opcao ==1){
                Prato prato = cadastrarPrato();
                cardapio.adicionarPrato(prato);
                prato.adicionarIngrediente(cadastrarIngredientes());
            }
            else if (opcao == 2){
                System.out.println(cardapio);

            }else if (opcao==3){
                opcaoMenu=false;
                System.out.println("Comio mucho é!!!");
            }
            else
                System.out.println("Marque uma opção valida...");
        }





    }




}
