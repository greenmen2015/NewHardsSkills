public class h4 {
    public static void main (String [] args) {
     if (13 < 12) {
         System.out.println("true");
     }else {
         System.out.println("false");
     }

     if (12 <= 12) {
            System.out.println("true");
     }else {
            System.out.println("false");
     }

     int i = 5;
     int b = 6;
     if (i > b) {
         System.out.println("i > b");
     }else if (i < b){
         System.out.println("i < b");
     }else {
         System.out.println("i == b");
     }

        int mount1 = 10;
        int mount2 = 10;
        if (mount1 > mount2) {
            System.out.println("mount1 > mount2");
        } else if (mount1 < mount2) {
            System.out.println("mount1 < mount2");
        } else {
            System.out.println("mount1 == mount2");
        }

        int i2 = 19;
        int b2 = 8;
        if (i2 > b2 && i2 > 5) {
            System.out.println("true");
        }

        int i1 = 3;
        int b1 = 1;
        if (i1 > b1 || b1 > 3) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        int i3 = 5;
        int b3 = 7;
        if (i3 > b3 && i3 <b3) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        int i4 = 5;
        int b4 = 7;
        if (i4 > b4 || i4 <b4) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        int month = 13;
        if (month  ==1){
            System.out.println("January");
        }else if (month == 2) {
            System.out.println("February");
        }else if (month == 3) {
            System.out.println("March");
        }else if (month == 4) {
            System.out.println("April");
        }else if (month == 5) {
            System.out.println("May");
        }else if (month == 6) {
            System.out.println("June");
        }else if (month == 7) {
            System.out.println("July");
        }else if (month == 8) {
            System.out.println("August");
        }else if (month == 9) {
            System.out.println("September");
        }else if (month == 10) {
            System.out.println("October");
        }else if (month == 11) {
            System.out.println("November");
        }else if (month == 12) {
            System.out.println("December");
        }else {
            System.out.println ("no such month");
        }

        int month1 = 2 ;
        switch (month1) {
            case 1:
                System.out.println("January");
            break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("no such month");
        }

        int x2 = 15;
        int f2 = 5;
        int c2 = x2 > f2 ? 20 : 30 ;
        System.out.println(c2);

        int x3 = 15;
        int f4 = 5;
        int c5 = x3 < f4 ? 20 : 30 ;
        System.out.println(c2);


    }
}
