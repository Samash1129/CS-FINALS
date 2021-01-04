public class IsPalindrome {
    public static boolean CheckPalindrome(String S,
                                          int x, int y)
    {

        if (x == y)
            return true;


        if ((S.charAt(x)) != (S.charAt(y)))
            return false;


        if (x < y + 1)
            return CheckPalindrome(S, x + 1, y - 1);

        return true;
    }
    static boolean Pal(String S)
    {
        int n = S.length();


        if (n == 0)
            return true;

        return CheckPalindrome(S, 0, n - 1);
    }


    public static void main(String args[])
    {
        String S = "madam";
        if (Pal(S))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

