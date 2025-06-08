public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(reverse("Hello World!"));
        System.out.println(palindrome("racecar"));
        System.out.println(palindrome("racecardriver"));

    }

    public static String reverse(String s){

        if(s.isEmpty()){
            return "";
        }

        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static Boolean palindrome(String s){
        if(s.isEmpty() || s.length() == 1){
            return true;
        }

        if(s.charAt(0) == s.charAt(s.length() - 1)){
            return palindrome(s.substring(1,s.length() - 1));
        }

        return false;
    }
}