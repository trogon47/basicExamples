public class BitwiseTests {

    static public void main(String[] args) {
        // binary literal
        int myBin = 0B010;
        System.out.println("myBin = " + myBin);

        // Octal literal
        int myOct = 027;
        System.out.println("myOct = " + myOct);

        // Hex literal
        long myHex = 0X080;
        System.out.println("myhex = " + myHex);

        int negativeHex = 0x80000000;
        System.out.println("negative hex = " + negativeHex);
        System.out.println("shift to left result is " + (negativeHex << 1));
        System.out.println(8 >> 1);

        int num = 0b100;
        System.out.println("unshifted number is " + num);
        System.out.println("shifted number is " + (num >> 34));

        int num2 = 1;
        int num3 = num2 << 31;
        System.out.println(num3);
        int num4 = num3 >>> 31;
        System.out.println(num4);

        int x = 5;

        System.out.println("Bits flipped = " + (~x));
    }
}
