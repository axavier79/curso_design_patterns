package main;

import builder_alura.TesteDaNotaFiscal;
import builder_exercicio.TesteDoItemDaNota;
import chain_of_responsibility_alura.TesteDeDescontos;
import chain_of_responsibility_exercicio.TesteContaBancaria;
import decorator_alura.TesteDeImpostosComplexos;
import decorator_exercicio.TesteDeMaisImpostosComplexos;
import observer_alura.TesteDeAcoes;
import observer_exercicio.TesteDoMultiplicador;
import state_alura.TesteDoDescontoExtra;
import state_exercicio.TesteSaqueEDeposito;
import strategy_alura.TesteDeImpostos;
import strategy_exercicio.TesteDeInvestimento;
import template_method_alura.TesteDeImpostoCondicional;
import template_method_exercicio.TesteRelatorios;

public class Main {
	public static void main(String[] args) {
		System.out.println("Exemplos de padrões de Projeto:\n");
		
		System.out.println("---PADRÃO STRATEGY---");
		System.out.println("1 - Strategy Alura");
		TesteDeImpostos testeDeImpostos = new TesteDeImpostos();
		testeDeImpostos.executarTesteDeImpostos();
		System.out.println("\n1 - Strategy Exercício");
		TesteDeInvestimento testeDeInvestimentos = new TesteDeInvestimento();
		testeDeInvestimentos.executarTesteDeInvestimento();
		
		System.out.println("\n---PADRÃO CHAIN OF RESPONSIBILITY---");
		System.out.println("2 - Chain Alura");
		TesteDeDescontos testeDeDescontos = new TesteDeDescontos();
		testeDeDescontos.executarTesteDeDescontos();
		System.out.println("2 - Chain Exercício");
		TesteContaBancaria testeContaBancaria = new TesteContaBancaria();
		testeContaBancaria.executarTesteContaBancaria();
		
		System.out.println("\n---PADRÃO TEMPLATE METHOD---");
		System.out.println("3 - Template Alura");
		TesteDeImpostoCondicional testeDeImpostoCondicional = new TesteDeImpostoCondicional();
		testeDeImpostoCondicional.executarTesteDeImpostoCondicional();
		System.out.println("3 - Template Exercício");
		TesteRelatorios testeRelatorios = new TesteRelatorios();
		testeRelatorios.executarTesteRelatorios();
		
		System.out.println("\n---PADRÃO DECORATOR---");
		System.out.println("4 - Decorator Alura");
		TesteDeImpostosComplexos testeDeImpostosComplexos = new TesteDeImpostosComplexos();
		testeDeImpostosComplexos.executarTesteDeImpososComplexos();
		System.out.println("4 - Decorator Exercício");
		TesteDeMaisImpostosComplexos testeDeMaisImpostosComplexos = new TesteDeMaisImpostosComplexos();
		testeDeMaisImpostosComplexos.executarTesteDeMaisImpososComplexos();
		
		System.out.println("\n---PADRÃO STATE---");
		System.out.println("5 - State Alura");
		TesteDoDescontoExtra testeDoDescontoExtra = new TesteDoDescontoExtra();
		testeDoDescontoExtra.executarTesteDoDescontoExtra();
		System.out.println("5 - State Exercício");
		TesteSaqueEDeposito testeSaqueEDeposito = new TesteSaqueEDeposito();
		testeSaqueEDeposito.executarTesteSaqueEDeposito();
		
		System.out.println("\n---PADRÃO BUILDER---");
		System.out.println("6 - Builder Alura");
		TesteDaNotaFiscal testeDaNotaFiscal = new TesteDaNotaFiscal();
		testeDaNotaFiscal.executarTesteDaNotaFiscal();
		System.out.println("6 - Builder Exercício");
		TesteDoItemDaNota testeDoItemDaNota = new TesteDoItemDaNota();
		testeDoItemDaNota.executarTesteDoItemDaNota();
		
		System.out.println("\n---PADRÃO OBSERVER---");
		System.out.println("7 - Observer Alura");
		TesteDeAcoes testeDeAcoes = new TesteDeAcoes();
		testeDeAcoes.executarTesteDeAcoes();;
		System.out.println("7 - Observer Exercício");
		TesteDoMultiplicador testeDoMultiplicador = new TesteDoMultiplicador();
		testeDoMultiplicador.executarTesteDoMultiplicador();;
		
	}

}
