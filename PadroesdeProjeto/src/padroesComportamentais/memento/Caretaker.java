package padroesComportamentais.memento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Padrão Memento: Utilize o padrão Memento quando você quiser produzir retratos do estado de um objeto
                para ser capaz de restaurar um estado anterior do objeto.

O padrão Memento permite que seja feita cópias completas do estado de um objeto, incluindo campos privados
e armazená-los separadamente do objeto.
*/
public class Caretaker {
    private List<Memento> mementos = new ArrayList<Memento>();

    public List<Memento> getHistoryList() {
        return Collections.unmodifiableList(mementos);
    }

    public void add(Memento memento) {
        mementos.add(memento);
    }

    public Memento get(int index) {
        if(mementos.size() == 0){
            return null;
        }
        return mementos.get(index);
    }
}
