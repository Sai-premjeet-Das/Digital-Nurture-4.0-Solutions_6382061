import java.util.*;
public class FinancialForecasting {
    public static double forecastValue(int year, double initialValue, double growthRate) {
        if (year == 0){
            return initialValue;
        } 
        return forecastValue(year - 1, initialValue, growthRate) * (1 + growthRate);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial value: ");
        double initialValue = sc.nextDouble();
        System.out.println("Enter the growth rate(in percentage): ");
        double growthRate = sc.nextDouble();
        System.out.println("Enter the number of years: ");
        int years = sc.nextInt();;
        double result = forecastValue(years, initialValue, growthRate/100);
        System.out.printf("Forecasted value after %d years: %.2f\n", years, result);
        sc.close();
    }
}