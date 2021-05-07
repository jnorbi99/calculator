package org.example;

public class Exchange {

    public static String binToDec(String num) {
        int eredmeny = 0;
        double k = 0.0;
        for(int i = num.length(); i > 0 ; i--) {
            int szam = Character.getNumericValue(num.charAt(i-1));
            eredmeny += szam * (int)Math.pow(2.0, k);
            k++;
        }
        return String.valueOf(eredmeny);
    }

    public static String decToBin(String num) {
        int szam = Integer.parseInt(num);
        int i;
        int[] eredmeny = new int[40];

        for (i = 0; szam > 0; i++) {
            eredmeny[i] = szam % 2;
            szam = szam / 2;
        }

        StringBuilder eredmeny2 = new StringBuilder();
        for (; i >= 0; i--) {
            eredmeny2.append(eredmeny[i]);
        }
        String rep = eredmeny2.toString().replaceFirst("0", " ");
        return rep.trim();
    }

    public static String decToOkt(String num) {
        int szam = Integer.parseInt(num);
        int i;
        int[] eredmeny = new int[40];

        for (i = 0; szam > 0; i++) {
            eredmeny[i] = szam % 8;
            szam = szam / 8;
        }

        StringBuilder eredmeny2 = new StringBuilder();
        for (; i >= 0; i--) {
            eredmeny2.append(eredmeny[i]);
        }
        String rep = eredmeny2.toString().replaceFirst("0", " ");
        return rep.trim();
    }

    public static String decToHex(String num) {
        int szam = Integer.parseInt(num);
        int i;
        int[] eredmeny = new int[40];

        for (i = 0; szam > 0; i++) {
            eredmeny[i] = szam % 16;
            szam = szam / 16;
        }

        StringBuilder eredmeny2 = new StringBuilder();
        for (; i >= 0; i--) {
            if (eredmeny[i] == 10) {
                eredmeny2.append("A");
            } else if(eredmeny[i] == 11) {
                eredmeny2.append("B");
            } else if(eredmeny[i] == 12) {
                eredmeny2.append("C");
            } else if(eredmeny[i] == 13) {
                eredmeny2.append("D");
            } else if(eredmeny[i] == 14) {
                eredmeny2.append("E");
            } else if(eredmeny[i] == 15) {
                eredmeny2.append("F");
            } else {
                eredmeny2.append(eredmeny[i]);
            }
        }
        String rep = eredmeny2.toString().replaceFirst("0", " ");
        return rep.trim();
    }

    public static String oktToDec(String num) {
        int eredmeny = 0;
        double k = 0.0;
        for(int i = num.length(); i > 0 ; i--) {
            int szam = Character.getNumericValue(num.charAt(i-1));
            eredmeny += szam * (int)Math.pow(8.0, k);
            k++;
        }
        return String.valueOf(eredmeny);
    }

    public static String hexToDec(String num) {
        int eredmeny = 0;
        double k = 0.0;
        for(int i = num.length(); i > 0 ; i--) {
            if(num.charAt(i-1) == 'A') {
                eredmeny += 10 * (int)Math.pow(16.0, k);
            } else if(num.charAt(i-1) == 'B') {
                eredmeny += 11 * (int)Math.pow(16.0, k);
            } else if(num.charAt(i-1) == 'C') {
                eredmeny += 12 * (int)Math.pow(16.0, k);
            } else if(num.charAt(i-1) == 'D') {
                eredmeny += 13 * (int)Math.pow(16.0, k);
            } else if(num.charAt(i-1) == 'E') {
                eredmeny += 14 * (int)Math.pow(16.0, k);
            } else if(num.charAt(i-1) == 'F') {
                eredmeny += 15 * (int)Math.pow(16.0, k);
            } else {
                eredmeny += Character.getNumericValue(num.charAt(i-1)) * (int)Math.pow(16, k);
            }
            k++;
        }
        return String.valueOf(eredmeny);
    }
}


