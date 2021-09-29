package br.com.zup;

public class Ingrediente {
    private String nomeIngr;

    public Ingrediente(String nomeIngr) {
        this.nomeIngr = nomeIngr;
    }

    public String getNomeIngr() {
        return nomeIngr;
    }

    public void setNomeIngr(String nomeIngr) {
        this.nomeIngr = nomeIngr;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\nIngrediente: \t"+nomeIngr);
        return retorno.toString();
    }
}
