package InsuranceFactoryMethod;

public class InsuranceMain {
    public static void main(String[] args) {
        Insurance obj = InsuranceFactory.getInsuranceByType(InsuranceType.HEALTH_INSURANCE);
        HealthInsuranceInterface ob = obj.gethealthIns(Term.lONG_TERM);
        ob.getInsurance();
    }
}
