package ProjetoChecklistDeTarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckList2 {
    static void main(String[] args) {

        //

        ArrayList<String> tarefas = new ArrayList<>();
        Scanner fc = new Scanner(System.in);

        System.out.println("==== LISTA DE VERIFICAÇÃO ==== \n 1- Adicionar Tarefas \n 2- Listar tarefas \n 3- Sair ");

        System.out.print("Digite uma opção: ");
        int opcao = fc.nextInt();

        while (true) {

            switch (opcao){
                case 1:
                    System.out.println("Digite nome da tarefa: ");
                    String adicionandoTarefa = fc.nextLine();
                    break;

                case 2:
                    System.out.println("blz lek sistema fechado");

            }


            //if (opcao == 1)
              //  System.out.println("Digite nome da tarefa: ");
            //    String adicionandoTarefa = fc.nextLine();

           // else if (opcao == 2)
                   // break;

        }

    }
}