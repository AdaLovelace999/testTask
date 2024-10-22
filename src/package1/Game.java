package package1;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public ArrayList<Character> goodLetters = new ArrayList<>();
    public ArrayList<Character> badLetters = new ArrayList<>();

    private int lives;
    private int guessedLettersCount;

    public int getLives() {
        return lives;
    }

    public Game(Word w){
        for (int i = 0; i < w.getLength(); i++){
            goodLetters.add('_');
        }
        this.lives = 10;
        this.guessedLettersCount = 0;
    }
    public void printStatus(){
        for(Object o : goodLetters){
            System.out.print(o + " ");
        }
        System.out.println("\nНеверно угаданные символы:");
        for(Object o : badLetters){
            if (!badLetters.isEmpty()){
                System.out.print(o + ",");
            }
        }
        System.out.println("\nКоличество жизней: " + this.getLives());
    }

    public char getUserInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }

    public void checkResult(Word w, char usrInp){
        boolean notInWord = true;
        for (int i = 0; i < w.getLength(); i++){
            if(w.getWord().charAt(i) == usrInp){
                notInWord = false;
                if (goodLetters.get(i) != usrInp){
                    goodLetters.set(i, usrInp);
                    guessedLettersCount++;
                }
            }
        }
        if(notInWord){
            badLetters.add(usrInp);
            lives--;
            if (lives == 0){
                System.out.println("Вы проиграли!");
                System.out.println("Вы не угадали слово \"" + w.getWord() + "\"");
                System.exit(0);
            }
        }
    }

    public boolean checkWin(){
        return guessedLettersCount == goodLetters.size();
    }
}
