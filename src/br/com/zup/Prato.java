package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Prato {
    private String nomePrato;
    private double valorDoPrato;
    private List<Ingrediente> ingredientes = new ArrayList<>();

    public Prato() {

    }

    public Prato(String nomePrato, double valorDoPrato) {
        this.nomePrato = nomePrato;
        this.valorDoPrato = valorDoPrato;
    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public double getValorDoPrato() {
        return valorDoPrato;
    }

    public void setValorDoPrato(double valorDoPrato) {
        this.valorDoPrato = valorDoPrato;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void adicionarIngrediente(Ingrediente novoIngrediente){
    ingredientes.add(novoIngrediente);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nome do Prato: "+nomePrato);
        retorno.append("Valor do Prato: "+valorDoPrato);
        retorno.append("Os Ingredientes são: "+ingredientes);
        return retorno.toString();
    }
}
