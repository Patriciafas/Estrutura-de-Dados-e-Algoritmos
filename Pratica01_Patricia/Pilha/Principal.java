import Pilha;

package Pilha;
public class Principal{
    public static void main(String[] args){
        Pilha<String> pilha = new Pilha<String>("Linguagens");

        pilha.push("Phyton");
        pilha.push("Java");
        pilha.push("C#");
    
        //pilha.imprimePilha();

        System.out.println("Linguagen removida" + pilha.pop());

       pilha.push("SQL");
        pilha.push("C++");

        pilha.imprimePilha();
        
    }
}