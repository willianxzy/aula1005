package com.itilh.aula.aula1005.model;

import java.math.BigInteger;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ModelTeste {
    private BigInteger id;
    private String nome;
}
