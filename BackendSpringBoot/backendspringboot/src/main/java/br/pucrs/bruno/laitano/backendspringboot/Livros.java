package br.pucrs.bruno.laitano.backendspringboot;

public class Livros {
    private int id;
    private String titulo;
    private String autor;
    private int ano;

    public Livros(int id, String titulo, String autor, int ano){
        this.id=id;
        this.titulo=titulo;
        this.autor=autor;
        this.ano=ano;
    }
}