package com.design.paterns.descontos;

import com.design.paterns.Orcamento;

public class CalculaDesconto {
    
    public double calculaDesconto(Orcamento orcamento) {
        DescontoCincoItens descontoCincoItens = new DescontoCincoItens();
        DescontoMaiorQuinhentosReais descontoMaiorQuinhentosReais = new DescontoMaiorQuinhentosReais();
        SemDesconto semDesconto = new SemDesconto();

        descontoCincoItens.setProximo(descontoMaiorQuinhentosReais);
        descontoMaiorQuinhentosReais.setProximo(semDesconto);
        
        return descontoCincoItens.desconta(orcamento);
    }
}