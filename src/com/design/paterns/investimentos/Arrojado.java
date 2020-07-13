package com.design.paterns.investimentos;

import java.util.Random;

import com.design.paterns.Conta;

public class Arrojado implements Investimento {

    private Random random;

    public Arrojado() {
        this.random = new Random();
    }

    @Override
    public double calcula(final Conta conta) {
        int chute = chutaNumeroDeZeroADez();
        double saldoNaConta = conta.getSaldo(); 
        if(temVintePorcentoDeChance(chute)) {
            return rendimentoCincoPorCento(saldoNaConta);
        } else if (temTrintaPorcentoDeChance(chute)) {
            return rendimentoTresPorCento(saldoNaConta);
        } else return rendimentoZeroPontoSeisPorCento(saldoNaConta);
    }

    private boolean temTrintaPorcentoDeChance(int chute) {
        return chute >= 2 && chute <= 4;
    }

    private boolean temVintePorcentoDeChance(int chute) {
        return chute >= 0 && chute <= 1;
    }

    private int chutaNumeroDeZeroADez() {
        return random.nextInt(10);
    }

    private double rendimentoCincoPorCento(double saldoNaConta) {
        return saldoNaConta * 0.05;
    }
    
    private double rendimentoTresPorCento(double saldoNaConta) {
        return saldoNaConta * 0.03;
    }
    
    private double rendimentoZeroPontoSeisPorCento(double saldoNaConta) {
        return saldoNaConta * 0.006;
    }
}