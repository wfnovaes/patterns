package com.design.paterns.investimentos;

import com.design.paterns.Conta;

public class Conservador implements Investimento {
    
    @Override
    public double calcula(final Conta conta) {
        final double RENDIMENTO = 0.008;
        return conta.getSaldo() * RENDIMENTO;
    }
}