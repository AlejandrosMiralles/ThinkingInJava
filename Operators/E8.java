class E8{
    public static void main(String[] args) {
        long hex = 0x10;
        long oct = 010;
       
        System.out.println("Hexagesimal: "+hex+"\nHexagesimal to binary: "+Long.toBinaryString(hex));
        System.out.println("Octal: "+oct+"\nOctal to binary: "+Long.toBinaryString(oct));
    }
}