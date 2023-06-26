package Static;

public class Tester {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Kogada","Bolton","Kisumu");
        Employee employee2 = new Employee("Derick","Wilhems", "Nairobi");
        //employee1
        Badge newBadge = new Badge(employee1);
        Badge newBadge2 = new Badge(employee2);
        newBadge.showBadgeDetails();
        newBadge2.showBadgeDetails();
        System.out.println(employee2.getEmployeeDetails());
    }
}
