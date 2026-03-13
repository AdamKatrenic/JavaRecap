public class YouOnlyNeedOne {
    public static boolean check(Object[] a, Object x) {
        for (Object element : a) {
            if (element.equals(x)) {
                return true;
            }
        }
        return false;
    }
}
