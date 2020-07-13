package com.design.paterns.investimentos;

import com.design.paterns.Conta;

public class RealizadorInvestimento {
    
    public void investir(Conta conta, Investimento investimento) {
        double resultado = investimento.calcula(conta);
        double valorDoImpostoDescontado = 0.75;
        conta.deposita( resultado * valorDoImpostoDescontado );
        System.out.println ( "Novo saldo: " + conta.getSaldo());
    }
  }