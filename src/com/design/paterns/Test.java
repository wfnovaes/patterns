package com.design.paterns;

import com.design.paterns.descontos.CalculaDesconto;
import com.design.paterns.impostos.CalculadorImposto;
import com.design.paterns.impostos.ICMS;
import com.design.paterns.impostos.ISS;
import com.design.paterns.investimentos.Arrojado;
import com.design.paterns.investimentos.Conservador;
import com.design.paterns.investimentos.Moderado;
import com.design.paterns.investimentos.RealizadorInvestimento;

public class Test {
    
    public static void main(String[] args) {
        testeImposto();
        testeInvestimento();
        testeDesconto();
    }

    private static void testeImposto() {
        Orcamento orcamento = new Orcamento(500);
        ICMS icms = new ICMS();
        ISS iss = new ISS();

        CalculadorImposto calculadorImposto = new CalculadorImposto();

        calculadorImposto.calculaImposto(orcamento, icms);
        calculadorImposto.calculaImposto(orcamento, iss);
    }

    private static void testeInvestimento() {
        double valorDepositado = 200.00;
        Conta conta = new Conta();
        conta.deposita(valorDepositado);

        Conservador conservador = new Conservador();
        Moderado moderado = new Moderado();
        Arrojado arrojado = new Arrojado();

        RealizadorInvestimento realizadorInvestimento = new RealizadorInvestimento();
        realizadorInvestimento.investir(conta, conservador);
        realizadorInvestimento.investir(conta, moderado);
        realizadorInvestimento.investir(conta, arrojado);
    }

    private static void testeDesconto() {
        Orcamento orcamento = new Orcamento(501.0);
        orcamento.adicionarItem(new Item("caneta", 251));
        orcamento.adicionarItem(new Item("lapis", 250));
    
        CalculaDesconto calculaDesconto = new CalculaDesconto();
        double desconto = calculaDesconto.calculaDesconto(orcamento);

        System.out.println(desconto);
    }
}