public class PasswordSecurity {
    public static int minFlips(String pwd) {
        int flipCount = 0;
        int count = 1;

        for (int i = 1; i < pwd.length(); i++) {
            if (pwd.charAt(i) != pwd.charAt(i - 1)) {
                if (count % 2 != 0) {
                    flipCount++;
                    count = 2;
                } else {
                    count = 1;
                }
            } else {
                count++;
            }
        }

        return flipCount;
    }

    public static void main(String[] args) {
        String pwd = "110001";
        int minFlipsRequired = minFlips(pwd);
        System.out.println("Minimum number of flips required: " + minFlipsRequired);
    }
}
