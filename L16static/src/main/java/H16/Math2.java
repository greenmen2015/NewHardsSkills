package H16;

public class Math2   {

    private int dp;
    static int counter1 = 1;


    Math2(){
        dp = counter1++;
    }




    public void displayId(){
        System.out.printf("Id: %d \n", dp);
    }
}


