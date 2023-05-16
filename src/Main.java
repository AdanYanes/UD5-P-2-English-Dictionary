import net.salesianos.lib.Dictionary;

public class Main{
    public static void main(String[] args) {
        
        Dictionary dictionary = new Dictionary();

        dictionary.showInitials();

        dictionary.addWord();
        dictionary.addWord();
        dictionary.addWord();
        dictionary.addWord();

        dictionary.searchWord();

        dictionary.removeWord();

        dictionary.searchWord();

        dictionary.showInitials();

        dictionary.showWordsByInitials();
    }
}