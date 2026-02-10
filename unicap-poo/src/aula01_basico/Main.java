package aula01_basico;

public class Main {
    public static void main(String[] args) {
        Retangulo r = new Retangulo();
        Retangulo r2 = new Retangulo();

        r2.altura = 20;
        r2.base = 10;

        System.out.println(r2.area());
        System.out.println(r.area());
    }
}