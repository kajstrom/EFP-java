package EFP.E03;

import EFP.Console;

public class E03 {
    public static void main(String [] args) {
        Console console = new Console();
        QuoteAndAuthor qoa = new QuoteAndAuthor(console);

        qoa.start();
    }
}
