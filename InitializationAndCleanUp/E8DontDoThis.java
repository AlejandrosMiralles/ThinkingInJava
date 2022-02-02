package InitializationAndCleanUp;

class E8DontDoThis{
    void action(){
        action2();
        this.action2();
    }

    static int count = 0;
    void action2(){ ++count;}

    public static void main(String[] args) {
        new E8DontDoThis().action();

        System.out.println(count);
    }
}