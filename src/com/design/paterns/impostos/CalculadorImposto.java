package com.design.paterns.impostos;

import com.design.paterns.Orcamento;

public class CalculadorImposto {
    
    public void calculaImposto(Orcamento orcamento, Imposto imposto) {
        double valorImposto = imposto.calcularImposto(orcamento);
        System.out.println(valorImposto);
    }
}