package com.api.atendimento.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Atendimento {


    private Long id;

    private LocalDateTime data;

    private Long idPaciente;

    private Long idVacina;


}
