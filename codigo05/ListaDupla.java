public class ListaDupla<T> {
    private String nomeLista;
    private int tamanho;
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    

    public ListaDupla(){
        this("Lista Dupla");
    }

    public ListaDupla(String nomeLista){
        this.nomeLista = nomeLista;
        this.tamanho = 0;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    
    public void addInicio(T dado){
        NoDuplo<T> novoNo = NoDuplo<T>(dado);
        if(primeiroNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        }else{
            novoNo.setProximoNo(primeiroNo);
            primeiroNo.setAnteriorNo(novoNo);
            primeiroNo = novoNo;
        }
        atualizaIndice();
        tamanho++;
    }
     public void atualizaIndice(){
        NoDuplo<T> aux = primeiroNo;
        if(primeiroNo == null){
            System.out.println("Lista vazia!");
        } else{
            System.out.println("Dados da Lista " + getNomeLista());
            No<T> aux = primeiroNo;
            int indice = 0;
            while (atual != null) {
                atual.setIndice(indice)
                atual = atual.getProximoNo();
                indice ++;
            }
        }
    }
}