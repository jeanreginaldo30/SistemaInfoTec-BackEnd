package br.com.infotec.service;

public class CalculadoraVendas {
    public double calcularDesconto(double valor, double porcentagem) {
        return valor - (valor * (porcentagem / 100));
    }
}