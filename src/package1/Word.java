package package1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Word {
    ArrayList<String> words = new ArrayList<>(List.of("один",
            "два", "три", "кошка", "собака", "дельфин", "космос",
            "слово", "ложка", "вилка", "школа", "символ", "заяц",
            "ёлка", "дерево", "жираф", "динозавр", "метрополитен"));

    private final String word;
    private final int length;

    public String getWord() {
        return word;
    }

    public int getLength() {
        return length;
    }

    public Word(){
        this.word=chooseRandomWord();
        this.length=word.length();
        System.out.println(this.word);
    }

    public String chooseRandomWord(){
        Random random = new Random();
        int randomNumber = random.nextInt(words.size());
        return words.get(randomNumber);
    }
}
