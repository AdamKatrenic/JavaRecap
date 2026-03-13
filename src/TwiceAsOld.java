public class TwiceAsOld {

    public static void main(String[] args) {
        System.out.println(twiceAsOld(65,48));
        System.out.println(twiceAsOld(35,15));

    }

    public static int twiceAsOld(int dadYears, int sonYears) {
        int syn = sonYears * 2;
        int result = dadYears - syn;
        if (result<0) {
            return -result;
        }
        return result;
    }

}