package com.design.paterns.descontos;

import com.design.paterns.Orcamento;

public class SemDesconto implements Desconto {

    @Override
    public double desconta(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void setProximo(Desconto desconto) {
        // Não tem proximo.
    }
    
}