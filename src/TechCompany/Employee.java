package TechCompany;

public class Employee {
    private String name;
    private String title;

    public Employee(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public void work() {
        System.out.println(name + " is working as a " + title);
    }

    public String toString(){
        return name + " | " + title + " ";
    }

    public String getName(){
        return name;
    }

    public String getTitle(){
        return title;
    }
}
