package com.design.paterns.impostos;

import com.design.paterns.Orcamento;

public class ICMS implements Imposto {

    private final double aliquota;

    public ICMS() {
        this.aliquota = 0.1;
    }
    
    @Override
    public double calcularImposto(final Orcamento orcamento) {
        return orcamento.getValue() * aliquota;
    }

  
    
}