package edu.marcelo.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String description){
        Tarefa newTarefa = new Tarefa(description);
        this.tarefaList.add(newTarefa);
    }

    public void removerTarefa(String description){
        List<Tarefa> tarefasParaRemover= new ArrayList<>();
        for (Tarefa t :tarefaList) {
            if(t.getDescription().equalsIgnoreCase(description)){
                tarefasParaRemover.add(t);
            }
        }
        this.tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return this.tarefaList.size();
    }

    public List<String> obterDescricoesTarefas(){
        List<String> descriptions = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            descriptions.add(t.getDescription());
        }
        return descriptions;
    }

    
}
