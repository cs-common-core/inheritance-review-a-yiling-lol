package TechCompany;
import java.util.ArrayList;

public class Manager extends Employee{
    private ArrayList<String> projects;

    Manager(String name, String title, ArrayList<String> projects){
        super(name, title);
        this.projects = projects;

    }

    public void work(){
        System.out.print(getName() + " is working as a " + getTitle() + " on the projects ");
        for(int i=0; i<projects.size()-1; i++){
            System.out.print(projects.get(i) + ", ");
        }
        System.out.println("and " + projects.get(projects.size()-1));
    }

    public String toString(){
        return super.toString() + ", manager of " + projects;
    }
}
