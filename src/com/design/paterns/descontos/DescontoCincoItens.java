package com.design.paterns.descontos;

import com.design.paterns.Orcamento;

public class DescontoCincoItens implements Desconto {
    
    private Desconto proximoDesconto;

    @Override
    public double desconta(Orcamento orcamento){
        if (orcamento.getItens().size() > 5) {
            return orcamento.getValue() * 0.1;
        } else {
            return proximoDesconto.desconta(orcamento);
        }
    }

    @Override
    public void setProximo(Desconto desconto) {
        this.proximoDesconto = desconto;
    }
}