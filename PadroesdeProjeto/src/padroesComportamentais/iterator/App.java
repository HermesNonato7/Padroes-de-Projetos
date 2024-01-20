package padroesComportamentais.iterator;

public class App {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.searchAvaiableChannels();
        for(Integer channel: tv) {
            System.out.println(String.format("Percorrendo os canais disponíveis #%d", channel));
        }
    }
}