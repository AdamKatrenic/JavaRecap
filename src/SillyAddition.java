class SillyAdditon {

    public static int add(int num1, int num2) {
        StringBuilder result = new StringBuilder();

        String s1 = Integer.toString(num1);
        String s2 = Integer.toString(num2);

        int i = s1.length() - 1;
        int j = s2.length() - 1;

        while (i >= 0 || j >= 0) {
            int cislo1 = (i >= 0) ? s1.charAt(i--) - '0' : 0;
            int cislo2 = (j >= 0) ? s2.charAt(j--) - '0' : 0;

            int sum = cislo1 + cislo2;

            result.insert(0, sum);
        }

        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {
        System.out.println(add(16, 18));    
        System.out.println(add(122, 81));   
    }
}