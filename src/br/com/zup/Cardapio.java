package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private String temporada;
    private List<Prato> pratoDoDia = new ArrayList<>();

    public Cardapio() {

    }

    public Cardapio(String temporada){
        this.temporada = temporada;

    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public List<Prato> getPratoDoDia() {
        return pratoDoDia;
    }

    public void setPratoDoDia(List<Prato> pratoDoDia) {
        this.pratoDoDia = pratoDoDia;
    }

    public void adicionarPrato(Prato novoPrato){
        pratoDoDia.add(novoPrato);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\nTemporada do Menú: \t"+temporada);
        retorno.append("\nOs Pratos do día são: \t"+pratoDoDia);
        return retorno.toString();
    }
}
