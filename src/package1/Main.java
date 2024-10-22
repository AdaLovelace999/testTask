package package1;

public class Main {
    public static void main(String[] args) {
        Word word = new Word();
        Game game = new Game(word);

        while (game.getLives()>=0){
            game.printStatus();
            System.out.println("\nВведите букву");
            char usrInp = game.getUserInput();
            game.checkResult(word, usrInp);
            if (game.checkWin()){
                System.out.println("Вы выиграли!");
                break;
            }
        }
    }
}
