package br.com.semeru.model.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.annotations.ForeignKey;

@Entity
@Table (name="pessoa")
public class Pessoa implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    @Column(name="IdPessoa", nullable=false)
    private Integer idpessoa;
    @Column(name="Name", nullable =false, length=80)
    private String nome;
    @Column(name="Email", nullable =false, length=80)
    private String email;
    @Column(name="Telefone", nullable =false, length=15)//(021)-8888-8888
    private String telefone;
    @Column(name="CPF", nullable =false, length=14)//502.541.446-67
    private String cpf;
    @Column(name="DataDenascimento", nullable =false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataDeNascimento;
    @Column(name="DataDeCadastro", nullable =false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataDeCadastro;
    
    @ManyToOne(optional=false)
    @ForeignKey(name="PessoaSexo")
    private Pessoa pessoa;

    public Pessoa() {
    }

    public String getCpf() {
        return cpf;
    }

    public Date getDataDeCadastro() {
        return dataDeCadastro;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String getEmail() {
        return email;
    }

    public Integer getIdpessoa() {
        return idpessoa;
    }

    public String getNome() {
        return nome;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataDeCadastro(Date dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdpessoa(Integer idpessoa) {
        this.idpessoa = idpessoa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (this.idpessoa != other.idpessoa && (this.idpessoa == null || !this.idpessoa.equals(other.idpessoa))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.idpessoa != null ? this.idpessoa.hashCode() : 0);
        return hash;
    }
    
    
    
}
