public class SnakeLadder {
    static int startPosition=0;
    static int numberOfDiceRoll=0;
    static void display() {

        while (startPosition>=0 && startPosition<100) {

            int dice=(int) (Math.random()*6)+1;
            numberOfDiceRoll+=1;
            System.out.println("Dice: "+dice);

            int option = (int) (Math.random() * 3) + 1;
            System.out.println("Option: " + option);

            if (option == 1) {
                System.out.println("Position: "+startPosition);
                continue;
            }

            else if (option == 2)
            {
                startPosition += dice;
                if (startPosition>100){
                    startPosition-=dice;
                }
            }

            else if (option == 3) {
                if (startPosition > dice) {
                    startPosition -= dice;
                } else {
                    startPosition = 0;
                }
            }
            System.out.println("Position: "+startPosition);

        }
        System.out.println("Number of dice rolls: "+numberOfDiceRoll);
    }
}
