package Operators;

import java.util.Date;

class E7 {
    public static void main(String[] args) {
        Date object = new Date();

        System.out.println(object.hashCode());
        if (object.hashCode()%2==0){
            System.out.println("Cara");
        }else{
            System.out.println("Cruz");
        }
    }
}