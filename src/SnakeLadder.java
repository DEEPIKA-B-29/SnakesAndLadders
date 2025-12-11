public class SnakeLadder {
    static int startPosition=0;

    static void display() {

            int dice=(int) (Math.random()*6)+1;
            System.out.println("Dice: "+dice);

            int option = (int) (Math.random() * 3) + 1;
            System.out.println("Option: " + option);

            if (option == 1) {
            }
            else if (option == 2) {
                startPosition += dice;
            }
            else if (option == 3) {
                    startPosition -= dice;
            }
            System.out.println("Position: "+startPosition);

    }
}
