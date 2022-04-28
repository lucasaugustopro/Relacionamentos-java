package Entidades;

import lombok.*;

@Getter
@Setter
public class Pessoa {

    // Atributos da classe Pessoa
    private String nome;
    private int idade;
    private char sexo;
    private Endereco endereco;
    private Cnh cnh;
    /* 
    Método construtor ->  public Pessoa()
    O método construtor determina que ações devem ser executadas 
    quando da criação de um objeto. Em Java, o construtor é definido como 
    um método cujo nome deve ser o mesmo nome da classe e sem indicação do 
    tipo de retorno -- nem mesmo void. Toda classe tem pelo menos um 
    construtor.
   */      
    public Pessoa() {
        /*
        Quando for instanciado um objeto da classe Pessoa, imediantamente 
        será criado um objeto da classe cnh. Relacionamento Composição.
        */
        this.cnh = new Cnh();

         /*
        Quando for instanciado um objeto da classe Pessoa, imediantamente 
        será criado um objeto da classe Endereço. Relacionamento Agregação.
        */
        this.endereco = new Endereco();
    }
}
