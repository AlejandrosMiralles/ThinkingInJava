package Polymorphism;

public class Exercise16 {
    public static void main(String[] args) {
        Starship ship = new Starship();

        ship.alertComing();
        ship.dangerComing();
        ship.toBeSafe();
    }
}

class Starship{
    AlertStatus status;

    void dangerComing(){ status = new Danger();}
    void alertComing(){ status = new Alert();}
    void toBeSafe(){ status = new Safe();}
}

abstract class AlertStatus{}

class Danger extends AlertStatus{
    Danger(){ System.out.println("WE ARE IN DANGER");}
}

class Safe extends AlertStatus{
    Safe(){ System.out.println("We are safe");}
}

class Alert extends AlertStatus{
    Alert(){ System.out.println("We should proceed cautiously");}
}