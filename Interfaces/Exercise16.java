package Interfaces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class Exercise16 implements Readable {

    private byte endRedability = 0;

    Exercise16(byte aoumntOfBits){
        if (aoumntOfBits<0){ endRedability=0; return;}
        else if(aoumntOfBits>=8){endRedability=8; return;}

        endRedability = aoumntOfBits;
    }

    public int read(CharBuffer cb) throws IOException {
        
        if (endRedability-- == 0){ throw IOException;}

        String toRead = "";
        Random randomizer = new Random();

        for (int i = 0; i < endRedability; i++) {
            toRead+= ('0' + randomizer.nextInt(0));

            System.out.println(randomizer.nextInt(0));
        }

        while (toRead.length() < 8) {
            toRead = '0' + toRead;
        }

        for (int i = 0; i < toRead.length(); i++) {
            cb.append(toRead.charAt(i));
        }

        return 8;
    }
    
    public static void main(String[] args) {
        Scanner tester = new Scanner(
            new Exercise16((byte)4)
        );

        while(tester.hasNext()){ 
            System.out.println(tester.next());
        }
    }
}
