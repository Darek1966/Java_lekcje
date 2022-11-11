package zadania;

public class Palindrom {

    // palindrom - np. KAJAK

    public static void main(String[] args) {
        System.out.println(isPalindrom("kajak"));
    }

    public static boolean isPalindrom(String word) {
        int n = word.length();  // ile znaków ma słowo

        for(int i=0; i<(n/2); i++) {
            if(word.charAt(i) != word.charAt(n-i-1)) {  // czy pierwszy znak jest różny od ostatniego
                return false;
            }
        }
        return true;    // jeżeli if się nie wykona, to jest palindrom
    }
}
