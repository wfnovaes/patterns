package com.design.paterns.descontos;

import com.design.paterns.Orcamento;

public class DescontoMaiorQuinhentosReais implements Desconto {

    private Desconto proximoDesconto;

    @Override   
    public double desconta(Orcamento orcamento) {
        if (orcamento.getValue() > 500) {
            return orcamento.getValue() * 0.07;
        } else {
            return proximoDesconto.desconta(orcamento);
        }
    }

    @Override
    public void setProximo(Desconto desconto) {
        this.proximoDesconto = desconto;
    }

    
    
}