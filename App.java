import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();
        String nomes;

        do{
            System.out.println("digite o nome do aluno(digite 'stop' para encerrar): ");
            nomes = in.next();
            if(!nomes.equals("stop")){
            lista.add(nomes);
            }
        }while(!nomes.equals("stop"));
        System.out.println("Foram inseridos "+lista.size()+" nomes: ");
        System.out.println(" Os nomes dos alunos são: ");
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }
        lista.clear();
        System.out.println("Lista Vazia: ");
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }
        in.close();
    }
}
