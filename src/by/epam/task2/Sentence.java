package by.epam.task2;

import java.util.ArrayList;

public class Sentence implements TextItem,Comparable {
    public ArrayList<Word> words;
    public String text;
    public final static String DELIMITERS = "\u2026.!?";

    public Sentence(String sentence) {
        this.text = sentence;
        this.words  = new ArrayList<Word>();
        String[] words = sentence.split("[ ]+");

        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals("")) {
                if (DELIMITERS.indexOf(words[i].charAt(words[i].length() - 1)) > -1) {
                    this.words .add(new Word(words[i].substring(0, words[i].length() - 1)));
                    this.words .add(new Word("" + words[i].charAt(words[i].length() - 1)));
                } else {
                    this.words .add(new Word(words[i]));
                }

            }
        }
        System.out.println("\n");
    }



    @Override
    public int compareTo(Object obj) {
        Sentence tmp = (Sentence) obj;
        if (this.words.size() < tmp.words.size()) {
            return -1;
        } else if (this.words.size() > tmp.words.size()) {
            return 1;
        }
        return 0;    }

    @Override
    public String toString() {
        return text.toString() + "\n";
    }
}
