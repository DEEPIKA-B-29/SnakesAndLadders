public class SnakeLadder {

    int startPosition = 0;
    int numberOfDiceRoll = 0;

    boolean display() {

        int dice = (int) (Math.random() * 6) + 1;
        numberOfDiceRoll++;
        System.out.println("Dice: " + dice);

        int option = (int) (Math.random() * 3) + 1;
        System.out.println("Option: " + option);

        if (option==1) {
            System.out.println("Position: " + startPosition);
            return false;
        }

        else if (option==2) {
            startPosition+=dice;
            if (startPosition>100) {
                startPosition-=dice;
            }
            System.out.println("Position: " + startPosition);
            return true;
        }
        else if (option==3) {
            if (startPosition > dice) {
                startPosition -= dice;
            } else {
                startPosition = 0;
            }
        }
        System.out.println("Position: " + startPosition);
        System.out.println("Number of dice rolls: "+numberOfDiceRoll);
        return false;
    }
}