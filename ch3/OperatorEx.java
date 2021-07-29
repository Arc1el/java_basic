class OperatorEx{
    public static void main(String[] argas){
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.printf("%b\n", "abc" == "abc");
        System.out.printf("%b\n", str1 == "abc");
        System.out.printf("%b\n", str2 == "abc");

        System.out.printf("%b\n", str1.equals("abc"));
        System.out.printf("%b\n", str2.equals("abc"));
        System.out.printf("%b\n", str2.equalsIgnoreCase("abc"));

        int x, y, z;
        int abs_x, abs_y, abs_z;
        char sign_x, sign_y, sign_z;

        x = 10; y = -5; z = 0;

        abs_x = x >= 0 ? x : -x;
        abs_y = y >= 0 ? y : -y;
        abs_z = z >= 0 ? z : -z;

        sign_x = x > 0 ? '+' : (x == 0 ? ' ' : '-');
        sign_y = y > 0 ? '+' : (y == 0 ? ' ' : '-');
        sign_z = z > 0 ? '+' : (z == 0 ? ' ' : '-');

        System.out.printf("x = %c%d\n", sign_x, abs_x);
        System.out.printf("y = %c%d\n", sign_y, abs_y);
        System.out.printf("z = %c%d\n", sign_z, abs_z);
    }
}