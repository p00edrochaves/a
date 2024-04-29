package br.com.ado.adopi.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="alunos")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long RA;
    private String nome;
    private String cep;
    private int numero;
    private String complemento;
    private double notaAdoUm;
    private double notaPi;

    public long getRA() {
        return RA;
    }
    public void setRA(long rA) {
        RA = rA;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public double getNotaAdoUm() {
        return notaAdoUm;
    }
    public void setNotaAdoUm(double notaAdoUm) {
        this.notaAdoUm = notaAdoUm;
    }
    public double getNotaPi() {
        return notaPi;
    }
    public void setNotaPi(double notaPi) {
        this.notaPi = notaPi;
    }

}
