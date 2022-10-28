public class Tablica {

    public static void main(String[] args) {

        String[] imiona = new String[3];   // 3 - ile elementów będzie zawierała tablica
        imiona[0] = "Bartek";
        imiona[1] = "Basia";
        imiona[2] = "Michał";

//        System.out.println(imiona[0]);
//        System.out.println(imiona[1]);
//        System.out.println(imiona[2]);

//        int[] lottoNumbers = new int[]{1, 2, 3, 4, 5, 6};
//        System.out.println(lottoNumbers[1]);
//        System.out.println(lottoNumbers[3]);
//        System.out.println(lottoNumbers[5]);

//        System.out.println(lottoNumbers.length);    // długość tablicy

        for (int i = 0; i < imiona.length; i++ ){
            System.out.println(imiona[i]);
        }
    }
}
