import java.util.Scanner;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("NAMA LENGKAP : SEFINA AYUDIA SYAUQI");
        System.out.println("NIM : 245150701111023");
        System.out.println("=============================================");
        
        // Torus (Donat dengan lubang)
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius : ");
        double majorRadius = sc.nextDouble();
        System.out.print("Isikan radius : ");
        double minorRadius = sc.nextDouble();
        
        Torus torus = new Torus(majorRadius, minorRadius);
        torus.printInfo();
        
        // Sphere (Donat tanpa lubang)
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius : ");
        double radius = sc.nextDouble();
        
        Sphere sphere = new Sphere(radius);
        sphere.printInfo();
        
        sc.close();
    }
}
