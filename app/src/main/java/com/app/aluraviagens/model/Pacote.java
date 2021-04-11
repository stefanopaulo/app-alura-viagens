package com.app.aluraviagens.model;

import java.math.BigDecimal;

public class Pacote {
    private final String imagem;
    private final String local;
    private final int dias;
    private final BigDecimal preco;

    public Pacote(String imagem, String local, int dias, BigDecimal preco) {
        this.imagem = imagem;
        this.local = local;
        this.dias = dias;
        this.preco = preco;
    }

    public String getImagem() {
        return imagem;
    }

    public String getLocal() {
        return local;
    }

    public int getDias() {
        return dias;
    }

    public BigDecimal getPreco() {
        return preco;
    }
}
