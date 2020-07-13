package com.design.paterns.investimentos;

import java.util.Random;
import com.design.paterns.Conta;

public class Moderado implements Investimento {

    private final Random random;

    public Moderado() {
        this.random = new Random();
    }

    @Override
    public double calcula(Conta conta) {
        if (calculaChanceCinquentaPorCento()) {
            return rendimentoDoisPontoCinco(conta.getSaldo());
        } else {
            return rendimentoZeroPontoSete(conta.getSaldo());
        }
    }

    private boolean calculaChanceCinquentaPorCento() {
        return random.nextInt(2) == 0;
    }

    private double rendimentoDoisPontoCinco(double saldo) {
        return saldo * 0.025;
    }

    private double rendimentoZeroPontoSete(double saldo) {
        return saldo * 0.007;
    }
}