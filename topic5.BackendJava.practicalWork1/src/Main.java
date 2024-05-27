public class Main {
    public static void main(String[] args) {System.out.println ("Hello World");
    short sh = 128;
    byte by = (byte) sh;

    System.out.println(by);

    float fl = 3.14f;
    double doub = fl;
    System.out.println(doub);

    char ch = 'z';
    int i = ch;
    System.out.println(i);

    long l = 12345678;
    i = (int)l;
    System.out.println(i);

    i = 12345678;
    doub = i;
    System.out.println(doub);

    doub = 1.65;
    i = (int)Math.round(doub);
        System.out.println(i);
    }
}