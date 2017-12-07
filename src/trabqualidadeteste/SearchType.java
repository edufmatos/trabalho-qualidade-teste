/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabqualidadeteste;

/**
 *
 * @author Eduardo
 */
public enum SearchType {
    LessThan(1, "Menor"),
    LessThanEquals(2, "Menor ou Igual"),
    Equals(3, "Igual"),
    GreaterThanEquals(4, "Maior ou Igual"),
    GreaterThan(5, "Maior");

    private int valor;
    private String tipo;

    SearchType(int valor, String tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    public int getValor() {
        return this.valor;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "SearchType" + "\n   Tipo: (" + valor + ") " + tipo;
    }

}
