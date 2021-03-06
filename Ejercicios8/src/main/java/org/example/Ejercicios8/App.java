package org.example.Ejercicios8;

import org.example.Ejercicios8.cajero.*;
import org.example.Ejercicios8.cajero.config.Config;
import org.example.Ejercicios8.cajero.util.Bombo;

public class App {
    private final Banco[] bancos;
    private final Proxy proxy;
    private final Empresa[] empresas;
    private final Cajero cajero;

    public App() {
        Bombo bombo = new Bombo(999999, 1);
        bancos = new Banco[Config.CANTIDAD_BANCOS];
        for(int i = 1; i <= bancos.length; i++) {
            bancos[i-1] = new Banco(String.format("%05d", i),
                    "Banco " + i, bombo);
        }
        empresas = new Empresa[Config.CANTIDAD_EMPRESAS];
        for(int i = 1; i <= empresas.length; i++) {
            empresas[i - 1] = new Empresa((char)(i + 47),
                    "Empresa " + i, bancos);
        }
        proxy = new Proxy(empresas);
        cajero = new Cajero(proxy);
    }
}
