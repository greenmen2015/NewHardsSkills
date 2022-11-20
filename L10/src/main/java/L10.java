public class L10 {
        String name;
        int age;

        void displayInfo(){
            System.out.printf("Name: %s \t Age %d \n" , name, age);
        }

        L10(){
            this("undefined", 18);
        }

        /*
        L10(){
           name = "undefined";
           age = 18;
        }
         */

        L10(String name){
        this("name", 18);
        }

        /*
        L10(String n){
           name = n;
           age = 18;
        }
         */

        L10(String name, int age){
         this.name = name;
         this.age = age;
        }
        /*
        L10(String n, int a){
           name = n;
           age = a;
        }
         */
}
