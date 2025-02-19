package com.example.AS.Model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Data
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String nome;

    @Column
    private double preco;


    public Produto(int id, String nome, double preco) {


        this.id = id;


        this.nome = nome;


        this.preco = preco;


    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {

        return preco;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    @Override
    public String toString() {
        return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
    }

}
