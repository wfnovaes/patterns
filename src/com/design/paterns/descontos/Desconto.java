package com.design.paterns.descontos;

import com.design.paterns.Orcamento;

public interface Desconto {
    
    double desconta(Orcamento orcamento);
    void setProximo(Desconto desconto);
}