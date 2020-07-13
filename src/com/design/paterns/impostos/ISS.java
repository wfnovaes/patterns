package com.design.paterns.impostos;

import com.design.paterns.Orcamento;

public class ISS implements Imposto {

    private final double aliquota;

    public ISS() {
        this.aliquota = 0.7;
    }

    @Override
    public double calcularImposto(Orcamento orcamento) {
        return orcamento.getValue() * aliquota;
    }
    
}