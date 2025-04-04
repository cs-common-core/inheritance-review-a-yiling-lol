package TechCompany;
import java.util.ArrayList;

public class CompanyDemo {

    public static void main(String[] args) {
        ArrayList<String> bobsProjects = new ArrayList<String>();
        bobsProjects.add("Nintendo Direct");
        bobsProjects.add("Pokemon Sword");
        // bobsProjects.add("Tears of the Kingdom");
        Employee emp1 = new Developer("Alice", "Developer", "Java");
        Employee emp2 = new Manager("Bob", "Manager", bobsProjects);
        Employee emp3 = new Employee("Martin", "Employee");
        Employee[] staff = { emp1, emp2, emp3 };
        for (Employee e : staff) {
            e.work();   // dynamic binding: runs Developer.work() for Alice, Manager.work() for Bob
            System.out.println(e);
        }
    }
}
