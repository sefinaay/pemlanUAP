package uap.models;

import uap.bases.*;
import uap.interfaces.*;

public class Sphere extends Shape implements PiRequired, ThreeDimensional, MassCalculable, ShippingCostCalculator, MassConverter {

    private double radius;

    public Sphere(){
        this.radius = 0;
        setName("Donat tanpa lubang");
    }

    public Sphere(double radius){
        this.radius = radius;
        setName("Donat tanpa lubang");
    }

    @Override
    public double getVolume(){
        return (4.0/3.0)* PI * radius * radius * radius;
    }

    @Override
    public double getSurfaceArea(){
        return 4 * PI * radius * radius;
    }

    @Override
    public double getMass(){
        return getSurfaceArea() * THICKNESS * DENSITY;
    }

    @Override
    public void printInfo(){
         System.out.println("=============================================");
        System.out.println(getName());
        System.out.println("=============================================");
        System.out.printf("Volume : %.2f\n", getVolume());
        System.out.printf("Luas permukaan : %.2f\n", getSurfaceArea());
        System.out.printf("Massa : %.2f\n", getMass());
        System.out.printf("Massa dalam kg : %.2f\n", gramToKilogram());
        System.out.printf("Biaya kirim : Rp%.0f\n", calculateCost());
        System.out.println("=============================================");
    }

    @Override
    public double gramToKilogram(){
        return getMass() / DENOMINATOR;
    }

    @Override
    public double calculateCost(){
        double kg = gramToKilogram();
        return Math.ceil(kg) * PRICE_PER_KG;
    }
}
