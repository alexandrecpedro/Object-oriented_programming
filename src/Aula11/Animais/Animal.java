package Aula11.Animais;

public abstract class Animal {

//    Attributes
    private String nome;
    private int idade;

//    Constructor
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

//    Methods
    public abstract void emitirSom();
}
