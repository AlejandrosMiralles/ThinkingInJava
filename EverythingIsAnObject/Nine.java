package EverythingIsAnObject;

class Nine{
    int entero;
    boolean boleano;
    float flotador;
    short corto;
    byte mordisco;
    char cha;
    long largo;
    double doble;
    Integer enterO;
    Boolean boleanO;
    Float flotadoR;
    Short cortO;
    Byte mordiscO;
    Character chA;
    Long largO;
    Double doblE;

    public static void main(String[] args) {
        Nine tester = new Nine();
        
        System.out.println(tester.toString());
    }

    @Override
    public String toString() {
        return "Nine [boleanO=" + boleanO + ", boleano=" + boleano + ", chA=" + chA + ", cha=" + cha + ", cortO="
                + cortO + ", corto=" + corto + ", doblE=" + doblE + ", doble=" + doble + ", enterO=" + enterO
                + ", entero=" + entero + ", flotadoR=" + flotadoR + ", flotador=" + flotador + ", largO=" + largO
                + ", largo=" + largo + ", mordiscO=" + mordiscO + ", mordisco=" + mordisco + "]";
    }
}