package com.example.meusgastos2.domain.Enum;

public enum ETipoTitulo {
    ARECEBER("A Receber"),
    APAGAR("A Pagar");
    private String valor;

    private ETipoTitulo(String valor){
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
    
}
