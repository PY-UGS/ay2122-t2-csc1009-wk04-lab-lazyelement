public class BMI {
    protected double weightP;
    protected double heightI;

    public BMI(double weightP, double heightI) {
        this.weightP = weightP;
        this.heightI = heightI;
    }

    public double getWeightP() {
        return weightP;
    }

    public void setWeightP(double weightP) {
        this.weightP = weightP;
    }

    public double getHeightI() {
        return heightI;
    }

    public void setHeightI(double heightI) {
        this.heightI = heightI;
    }

    public double calculateBMI() {
        double weightKg = this.weightP * 0.45359237;
        double heightM = this.heightI * 0.0254;

        double bMI = weightKg / (Math.pow(heightM, 2));
        return bMI;
    }

    public void bmiInterpretation() {
        System.out.println("BMI is " + calculateBMI());
        if (calculateBMI() < 18.5) {
            System.out.println("Underweight");
        } else if (calculateBMI() >= 18.5 && calculateBMI() < 25) {
            System.out.println("Normal");
        } else if (calculateBMI() >= 25.0 && calculateBMI() < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

    }

}
