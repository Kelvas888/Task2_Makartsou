package by.epam.task2;

public class Main {

    public static void main(String[] args) throws Exception {
        Parser parser = new Parser();
        parser.parse();
        System.out.println(parser.getSentencesIncreasingCountOfWordsTask2());
    }
}
