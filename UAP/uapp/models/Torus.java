
public class Torus extends Shape implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator {

    private double majorRadius;
    private double minorRadius;

    public Torus(){
        this.majorRadius = 0;
        this.minorRadius = 0;
        setName("Donat dengan lubang");
    }

    public Torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
        setName("Donat dengan lubang");
    }
    
    @Override
    public double getVolume() {
        return ( PI * minorRadius * minorRadius )* (2 * PI *majorRadius);
    }
    
    @Override
    public double getSurfaceArea() {
        return (2 * PI * minorRadius) * (2 * PI * majorRadius);
    }
    
    @Override
    public double getMass() {
        return getSurfaceArea() * THICKNESS * DENSITY;
    }
    
    @Override
    public void printInfo() {
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
    public double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }
    
    @Override
    public double calculateCost() {
        double kg = gramToKilogram();
        return Math.ceil(kg) * PRICE_PER_KG;
    }

}

