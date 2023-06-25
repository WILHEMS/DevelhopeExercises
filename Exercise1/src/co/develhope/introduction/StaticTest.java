package co.develhope.introduction;

public class StaticTest {
        public static int count = 0;
        public int id;

        public void StaticTest() {
            count++;
            id = count;
        }

        public static void printCount() {
            System.out.println("Number of instances: " + count);
        }

        public void printId() {
            System.out.println("Instance ID: " + id);
        }
        public static void main(String[] args) {
            Integer testInt = 12;
            //Modifier static not allowed here
            //static Integer hey = 11;
            StaticTest e1 = new StaticTest();
            StaticTest e2 = new StaticTest();
            StaticTest e3 = new StaticTest();

            e1.printId();
            e2.printId();
            e3.printId();

            Integer two = e2.id = 10;
            System.out.println(two);

            //You can call a static method without creating a class object
            StaticTest.printCount();
        }

}
