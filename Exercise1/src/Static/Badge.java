package Static;

import java.nio.charset.Charset;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber() {
        totalNumberOfEmployees++;
    }
    private String generateBadgeIdCode(Employee employee){

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 6;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();

        String badgeIdCode = generatedString.substring(0,2)+employee.name+employee.surname+generatedString.substring(3,5);

        return badgeIdCode;
    }
    public void showBadgeDetails(){
        System.out.println("Hey");
        System.out.println("The total number of employees tracked by the badges : "+ totalNumberOfEmployees);
        System.out.println("The details of the employee: Name "+employee.name+" Surname "+employee.surname+" address "+employee.address);
        System.out.println("The badge Id Code "+ badgeIdCode);
    }

    public Badge(Employee employeeThatNeedsBadge ) {
        this.employee = employeeThatNeedsBadge ;
        keepTrackOfEmployeesNumber();
        this.badgeIdCode = generateBadgeIdCode(employee);
    }
}
