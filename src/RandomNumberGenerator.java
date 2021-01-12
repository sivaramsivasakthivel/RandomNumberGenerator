
import java.text.SimpleDateFormat;
import java.util.Date;

public class RandomNumberGenerator {
    public static void main(String[] args) throws Exception {
        int random = getRandomNumber();
        System.out.println("Random number genrated: " + random);
    }

    public static Integer getRandomNumber() {
        SimpleDateFormat format = new SimpleDateFormat("ms");
        Date date = new Date();
        String orgDate = format.format(date);
        if (orgDate.startsWith("0")) {
            orgDate = removeZero(orgDate);
            if (orgDate.startsWith("0")) {
                orgDate = removeZero(orgDate);
            }
        }

        int randomNumber = Integer.parseInt(orgDate);
        return randomNumber;
    }

    public static String removeZero(String s) {
        s.substring(1);
        return s;
    }
}
