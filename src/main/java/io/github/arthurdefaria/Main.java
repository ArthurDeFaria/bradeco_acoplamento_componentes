package io.github.arthurdefaria;

import io.github.arthurdefaria.adpter.TaxaCambioAdapter;
import io.github.arthurdefaria.conversormoeda.provided.ConversorMoedaConcreteInterfacePort;
import io.github.arthurdefaria.conversormoeda.provided.ConversorMoedaConcreteInterface;

public class Main {
    public static void main(String[] args) {
        TaxaCambioAdapter taxaCambioAdapter = new TaxaCambioAdapter();

        ConversorMoedaConcreteInterface conversor = new ConversorMoedaConcreteInterfacePort(taxaCambioAdapter);

        double valorConvertido = conversor.converter("USD", "EUR", 100);
        System.out.println("Valor convertido de USD para EUR: " + valorConvertido);
    }
}