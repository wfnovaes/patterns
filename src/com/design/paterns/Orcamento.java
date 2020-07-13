package com.design.paterns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

    private final double valor;
    private final List<Item> itens;

    public Orcamento(double value) {
        this.valor = value;
        this.itens = new ArrayList<Item>();
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public void adicionarItem(Item item) {
        this.itens.add(item);
    }

    public double getValue() {
        return valor;
    }

    

}