package Aula22_Operacoes.Polimorfismo;

public class Teste {
    public static void main(String[] args) {
        Operacoes op = new Operacoes();

        System.out.println("Somando dois números: "+op.soma(5,2));
        System.out.println("Somando três números: "+op.soma(5, 3));
        System.out.println("Somando duas Strings: "+op.soma("Programação" , "Java"));
    }
}