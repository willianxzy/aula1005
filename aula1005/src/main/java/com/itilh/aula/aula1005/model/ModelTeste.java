package com.itilh.aula.aula1005.model;

import java.math.BigInteger;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode
@NoArgsConstructor
public class ModelTeste {
    private BigInteger id;
    private String nome;
}
