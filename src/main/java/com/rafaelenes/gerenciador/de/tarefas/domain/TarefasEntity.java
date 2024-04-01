package com.rafaelenes.gerenciador.de.tarefas.domain;

import com.rafaelenes.gerenciador.de.tarefas.utils.enums.PrioridadeTarefa;
import jakarta.persistence.*;
import lombok.*;

import javax.validation.constraints.NotNull;

@Entity(name = "tb_tarefas")
@Table(name = "tb_tarefas")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "idTarefa")
@NoArgsConstructor
@ToString
public class TarefasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTarefa;
    @NotNull
    private String nome;
    @NotNull
    private String descricao;
    private PrioridadeTarefa prioridade;
}


