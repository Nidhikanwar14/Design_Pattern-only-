package InsuranceFactoryMethod;

public class LongTermHealthInterface implements HealthInsuranceInterface {
    @Override
    public void getInsurance() {
        System.out.println("LongTerm Health ..");
    }
}
