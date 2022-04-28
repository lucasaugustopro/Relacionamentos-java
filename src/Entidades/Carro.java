package Entidades;

import lombok.*;

@Getter
@Setter
public class Carro {

    private String placa;
    private String modelo;
    private String fabricante;
    private String chassi;
    /*
    Atributo (condutor) que condiciona o 
    relacionamento entre Carro e Pessoa.
    Associação.
    */  
    private Pessoa condutor;
    
}
