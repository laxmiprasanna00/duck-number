package Ladderiftask;

public class InsurancePolicy {

    public String calculatePremium(int age, int experience) {

        if (age > 50 && experience >= 10) {
            return "Lowest Premium";
        } 
        else if (age >= 30 && age <= 50 && experience >= 5) {
            return "Moderate Premium";
        } 
        else if (age >= 18 && age < 30 && experience < 5) {
            return "Highest Premium";
        } 
        else {
            return "Not Eligible for Insurance";
        }
    }

    public static void main(String[] args) {
        InsurancePolicy policy = new InsurancePolicy();

        System.out.println(policy.calculatePremium(55, 12));
        System.out.println(policy.calculatePremium(40, 6));
        System.out.println(policy.calculatePremium(25, 2));
        System.out.println(policy.calculatePremium(16, 1));
    }
}

