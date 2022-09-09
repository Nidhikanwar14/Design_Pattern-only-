package InsuranceFactoryMethod;

public class ShortTermHealthInterface implements HealthInsuranceInterface {
    @Override
    public void getInsurance() {
        System.out.println("Short Term Health..");
    }
}
