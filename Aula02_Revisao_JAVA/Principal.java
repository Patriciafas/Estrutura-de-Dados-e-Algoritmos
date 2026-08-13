import java.util.Scanner;
import java.util.ArrayList;

public class Principal{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        ArrayList<Pessoa> listaP = new ArrayList<Pessoa>();

        Pessoa obj1 = new Pessoa();
        Pessoa obj2 = new Pessoa("Rafael", 35);
        Pessoa obj3 = new Pessoa();

        System.out.print("Digite o nome: ");
        obj3.setNome(input.nextLine());
        //String nome = input.nextLine();
        System.out.print("Digite a idade: ");
        //int idade = input.nextInt();
        obj3.setIdade(input.nextInt());

        //obj3.setNome(nome);
        //obj3.setIdade(idade);

        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());

        listaP.add(obj1);
        listaP.add(obj2);
        listaP.add(obj3);
        /*LAÇO DE REPETIÇÃO AUXP (FOR IT) QUE RECEBE O ENDEREÇO DA PRIMEIRA POSIÇÃO NO FOR, É COMO SE FOSSE O MODO SOMA ONDE E REFERENCIADO A PRIMEIRA CELULA PARA QUE SEJA FEITA A SOMA EM PLANILHAS*/
        for(Pessoa auxP : listaP){
            System.out.println(auxP.toString());
        }
        /*METODO PARA MOSTRAR OS ELEMENTOS NA LISTA E O SET ALTERA OS VALORES DE NOME E IDADE DO OBJ1 POREM SE CASO A LISTA FOR EXCLUIDA ESTE OBJ1 E SEUS NOVOS VALORES NAO SERAO EXCLUIDOS, POIS A LISTA APENAS NOS MOSTRA A REFERENCIA DO OBJ E NÃO O EXCLUI. ENTRETANTO COM ESTA REFERENCIA EXCLUIDA VOCE NAO TERA O ACESSO A ESTE OBJ MAIS PORQUE FICARA DIFICIL DE ENCONTRA LO */
        listaP.get(0).setNome("Joaquim");
        listaP.get(0).setIdade(1);
        System.out.println(listaP.get(0).toString());
        System.out.println(obj1.toString());

        input.close();
    }
}