public class Principal{
    public static void main(String[] args){
        Fila<String> fila = new Fila<String>("Nomes");

        fila.enfileirar("Patricia");
        fila.enfileirar("João");
        fila.enfileirar("Julia");
        
        fila.desenfileirar();
        fila.enfileirar("Francis");
        fila.enfileirar("Helio");


        fila.imprimeFila();
    }
}