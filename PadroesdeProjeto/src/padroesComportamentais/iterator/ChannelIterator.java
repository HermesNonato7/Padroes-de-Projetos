package padroesComportamentais.iterator;

import java.util.Iterator;
/*
  Padrão Iterator: Prover uma maneira de acessar os elementos de um objeto agregado sequencialmente sem expor
  a sua representação interna.

  O padrão Iterator também é responsável por toda a tarefa de iteração, eliminando assim a responsabilidade adicional,
  simplificando a sua aplicação e deixando a responsabilidade onde deveria estar.
*/
public class ChannelIterator implements Iterator<Integer> {
    private Integer[] channels;
    private int index;

    public ChannelIterator(Integer[] channels) {
        this.channels = channels;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (channels == null) return false;
        return channels[index] != null;
    }

    @Override
    public Integer next() {
        return channels[index++];
    }
}
