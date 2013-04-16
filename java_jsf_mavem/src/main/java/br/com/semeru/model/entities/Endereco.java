
package br.com.semeru.model.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="endereco")
public class Endereco implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    @Column(name="IdEndereco",nullable=false)
    private Integer idEndereco;
    @Column(name="Bairro", length=80)
    private String bairro;
    @Column(name="NomeLogradouro", length=100)
    private String nomeLogradouro;
    @Column(name="CEP", length=9)//26261-220
    private String cep;
    @Column(name="Numero")
    private Integer Numero;
    @Column(name="Complemento", length=100)
    private String complemento;
    
    
}
