import java.util.Random;

public class MonopolyDice {
    public static void main(String[] arg){
        Random rand = new Random();
        int roll1;
        int roll2;
        int count=0;
        while (true){
            int sum = 0;
            roll1 = 1 + rand.nextInt(6);
            roll2 = 1 + rand.nextInt(6);
            System.out.println("User rolls ...");
            System.out.println("Roll 1: " + roll1);
            System.out.println("Roll 2: " + roll2);

            sum += (roll1+roll2);
            if (count == 2 && roll1==roll2){
                System.out.println("Doubles!!!!");
                System.out.println("Yikes 3 doubles ... you going to jail.");
                break;
            }
            if (roll1 == roll2) {
                System.out.println("Doubles!!!!");
                System.out.println("Please move " + sum + " and roll again!");
                count ++;
            } else {
                System.out.println("Please move " + sum + " and stop.");
                break;
            }
        }
    }
}
