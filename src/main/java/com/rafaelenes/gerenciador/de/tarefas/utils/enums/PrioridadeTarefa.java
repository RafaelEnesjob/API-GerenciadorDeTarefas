package com.rafaelenes.gerenciador.de.tarefas.utils.enums;

public enum PrioridadeTarefa {
    ALTA("Alta"),
    MEDIA("Média"),
    BAIXA("Baixa");

    private final String descricao;

    PrioridadeTarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}