package ProjetoChecklistDeTarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckList {
    static void main(String[] args) {

        //
        ArrayList<String> tarefas = new ArrayList<>();
        //String[] itens = new String[5]; // -> Array vazia para preencher.
        // ArrayList<String> cores = new ArrayList<>();

        Scanner fc = new Scanner(System.in);

        System.out.println("==== LISTA DE VERIFICAÇÃO ==== \n 1- Adicionar Tarefas \n 2- Listar tarefas \n 3- Sair ");

        for (;;) {
            System.out.print("Digite uma opção: ");

            int opcao = fc.nextInt();
            fc.nextLine(); // limpa o Enter

            switch (opcao){
                case 1:
                    System.out.println("Digite nome da tarefa: ");
                    String adicionandoTarefa = fc.nextLine();
                    tarefas.add(adicionandoTarefa);
                    break;

                case 2:
                    System.out.println("Listando tarefas:");




        }

    }
}}
