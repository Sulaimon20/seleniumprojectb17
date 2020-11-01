package test.ChooseButton;

import java.util.ArrayList;

public class testLoopNested {
    public static void main(String[] args) {

//        for (int i = 0; i <5 ; i++) {
//            System.out.println("");
//            System.out.println("Outer loop: i = " + i);
//            for (int j = 0; j <3 ; j++) {
//
//                System.out.println("j = " + j);
//
//            }

        String str = "javai123sgreat#@$%&*(&";
        char[] ch = str.toCharArray();
        int sum = 0;
        ArrayList<Character> digit = new ArrayList<>();
        ArrayList<Character> letter = new ArrayList<>();
        ArrayList<Character> spec = new ArrayList<>();

        for (Character each : ch) {

            if (Character.isDigit(each)) {

                digit.add(each);



            }
            if (Character.isAlphabetic(each)) {
                letter.add(each);
            }
            if (!Character.isAlphabetic(each) && !Character.isDigit(each)) {
                spec.add(each);
            }
        }

        System.out.println("spec = " + digit);
        System.out.println("spec = " + letter);
        System.out.println("spec = " + spec);
        System.out.println("sum = " + sum);


    }


}

