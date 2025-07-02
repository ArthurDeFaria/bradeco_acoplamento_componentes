package io.github.arthurdefaria.adpter;

import io.github.arthurdefaria.taxacambio.provided.TaxaCambioConcreteInterfacePort;
import io.github.arthurdefaria.taxacambio.provided.TaxaCambioConcreteInterface;
import io.github.arthurdefaria.conversormoeda.required.interfaces.TaxaCambioRequiredInterface;
import io.github.arthurdefaria.taxacambio.provided.interfaces.TaxaCambioProvidedInterface;

public class TaxaCambioAdapter implements TaxaCambioRequiredInterface {

    private final TaxaCambioProvidedInterface taxaCambio;

    public TaxaCambioAdapter() {
        TaxaCambioConcreteInterface concreteInterface = new TaxaCambioConcreteInterfacePort();
        this.taxaCambio = concreteInterface;
    }

    @Override
    public double obterTaxaCambio(String moedaOrigem, String moedaDestino) {
        return taxaCambio.obterTaxaCambio(moedaOrigem, moedaDestino);
    }
}