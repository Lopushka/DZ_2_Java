package EX_4;
import java.util.*;
import java.util.logging.Logger;
public class EX_4 {
    private static final Logger LOGGER = Logger.getGlobal();
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Первое число: ");
        double numder1 = iScanner.nextDouble();
        System.out.print("Введите действие (+,-,*,/): ");
        char oper = iScanner.next().charAt(0);
        System.out.print("Второе число: ");
        double numder2 = iScanner.nextDouble();
        double ans;
        switch (oper) {
            case '+':
                ans = numder1 + numder2;
                break;
            case '-':
                ans = numder1 - numder2;
                break;
            case '*':
                ans = numder1 * numder2;
                break;
            case '/':
                ans = numder1 / numder2;
                break;

            default:
                System.out.println("Ведите правильно действие(+,-,*,/)");
                iScanner.close();
                LOGGER.info("Err: 69");
                return;
                

        }
        System.out.println("Ответ: " + numder1 + " " + oper + " " + numder2 + "=" + ans);
        iScanner.close();
    }
}

