package priv.潮圆信寂.JavaSE.ProgramControlStructure;

/**
 * @author 潮圆信寂
 * @date 2022/7/30
 */
public class BreakDemo1 {
    public static void main(String[] args) {
/*
        int number;
        int numberOfTimes = 0;
        do {
            number = (int)(Math.random()*100);
            numberOfTimes++;
            System.out.print(number+"\t");
        }while (number != 97);
        System.out.println();
        System.out.println(numberOfTimes);
*/
        int number;
        int numberOfTimes = 0;
        while (true) {
            number = (int) (Math.random() * 100);
            numberOfTimes++;
            System.out.print(number + "\t");
            if (number == 97) {
                System.out.println("\n" + numberOfTimes);
                break;
            }
        }
    }
}
