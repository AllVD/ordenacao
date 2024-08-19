/*
** Version: 1.0
** Date: 16/08/2024
** Author: AlvD
*/
import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    // Atributos da classe Pessoa
    private String nome;
    private int idade;
    private double altura;
    // Construtor da classe Pessoa
    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;       // Atribui o valor do parâmetro nome ao atributo nome
        this.idade = idade;     // Atribui o valor do parâmetro idade ao atributo idade
        this.altura = altura;   // Atribui o valor do parâmetro altura ao atributo altura
    }

    @Override
    public int compareTo(Pessoa p){
        return Integer.compare(this.idade, p.getIdade());
    }
    // Getter para o atributo nome
    public String getNome(){
        return nome;
    }
    // Getter para o atributo idade
    public int getIdade(){
        return idade;
    }
    // Getter para o atributo altura
    public double getAltura(){
        return altura;
    }
    // Método toString sobrescrito
    @Override
    public String toString(){
        return "Pessoa{"+
        "nome='" + nome + '\'' +  // Concatena o nome da pessoa
        ", idade=" + idade +      // Concatena a idade da pessoa
        ", altura" + altura +     // Concatena a altura da pessoa
        '}';                      // Fecha a representação da pessoa
    }
}

class ComparatorPorAltura implements Comparator<Pessoa> {
    
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }

    pulbic static void main (String[] args){
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 20, 1.56);

        System.out.println(ordenacaoPesoa.ordenarPorIdade());
        System.out.println(rodenacaoPessoa.ordenarPorAltura());
    }
}
