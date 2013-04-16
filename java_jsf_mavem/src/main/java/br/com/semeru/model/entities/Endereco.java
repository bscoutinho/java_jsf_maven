
package br.com.semeru.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.ForeignKey;

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
    
    @OneToOne(optional=true, fetch=FetchType.LAZY)
    @ForeignKey(name="EnderecoPessoa")
    @JoinColumn(name="IdPessoa", referencedColumnName="IdPessoa")
    private Pessoa pessoa;
    
    @ManyToOne(optional=false, fetch=FetchType.LAZY)
    @ForeignKey(name="EnderecoTipoLogradouro")
    @JoinColumn(name="IdTipoLogradouro", referencedColumnName="IdTipoLogradouro")
    private TipoLogradouro tipoLogradouro;
    
    @ManyToOne(optional=false, fetch=FetchType.LAZY)
    @ForeignKey(name="EnderecoCidade")
    @JoinColumn(name="IdCidade", referencedColumnName="IdCidade")
    private Cidade cidade;
    
    @ManyToOne(optional=false, fetch=FetchType.LAZY)
    @ForeignKey(name="EnderecoEstado")
    @JoinColumn(name="IdEstado", referencedColumnName="IdEstado")
    private Estado estado;
    
    @ManyToOne(optional=false, fetch=FetchType.LAZY)
    @ForeignKey(name="EnderecoTipoEndereco")
    @JoinColumn(name="IdTipoEndereco", referencedColumnName="IdTipoEndereco")
    private TipoEndereco tipoEndereco;

    public Endereco() {
        this.cidade = new Cidade();
        this.estado = new Estado();
        this.tipoLogradouro = new TipoLogradouro();
        this.tipoEndereco = new TipoEndereco();
        this.pessoa = new Pessoa();
    }

   

    public Integer getNumero() {
        return Numero;
    }

    public void setNumero(Integer Numero) {
        this.Numero = Numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Integer getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Integer idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getNomeLogradouro() {
        return nomeLogradouro;
    }

    public void setNomeLogradouro(String nomeLogradouro) {
        this.nomeLogradouro = nomeLogradouro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public TipoEndereco getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(TipoEndereco tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Endereco other = (Endereco) obj;
        if (this.idEndereco != other.idEndereco && (this.idEndereco == null || !this.idEndereco.equals(other.idEndereco))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + (this.idEndereco != null ? this.idEndereco.hashCode() : 0);
        return hash;
    }
    
    
}
