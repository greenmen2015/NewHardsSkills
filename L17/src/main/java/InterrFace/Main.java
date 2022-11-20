package InterrFace;

import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {

        Fly plane = new Plane("Boing747",12,3050);
        Fly bea = new Bea(3);

        Fly[] maslet = {plane, bea};
        for (Fly object : maslet){
            object.fly();
        }
    }
}
/*
Порядок иницилизации переменных и вызов конструктора
     Иницилизация статических переменных класса - родителя
     Иницилизация статических переменных класса  - потомков
     Иницилизация нестатических переменных класса - родителя
     вызывается конструктор класса - родителя
     Иницилизация нестатических переменных класса  - потомков
     вызывается конструктор класса - потомка

*/

