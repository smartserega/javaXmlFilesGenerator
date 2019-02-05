package ru.fors.pages;

public class Page {


    public static String arryToSting(int[] secondNumberPart) {
        StringBuilder builder = new StringBuilder();
        for (int c : secondNumberPart) {
            builder.append(c);
        }
        String text = builder.toString();
        return text;
    }


    public static int[] intToArry(long idNumber) {
        String str = Long.toString(idNumber);
        String[] numb = str.split("");
        int numArr[] = new int[numb.length];
        for (int i = 0; i < numb.length; i++) {
            numArr[i] = Integer.parseInt(numb[i]);

        }

        int secondNumberPart[] = (new int[]{numArr[0], numArr[1], numArr[2], numArr[3], numArr[4], numArr[5], numArr[6]});
        return secondNumberPart;
    }

    public static int[] intToArry2(long idNumber) {
        String str = Long.toString(idNumber);
        String[] numb = str.split("");
        int numArr[] = new int[numb.length];
        for (int i = 0; i < numb.length; i++) {
            numArr[i] = Integer.parseInt(numb[i]);

        }

        int thirdNumberPart[] = (new int[]{numArr[7], numArr[8], numArr[9]});
        return thirdNumberPart;
    }
}
