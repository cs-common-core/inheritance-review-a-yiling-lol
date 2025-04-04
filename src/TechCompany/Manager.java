package TechCompany;
import java.util.ArrayList;

public class Manager extends Employee{
    private ArrayList<String> projects;

    Manager(String name, String title, ArrayList<String> projects){
        super(name, title);
        this.projects = projects;

    }

    public void work(){
        System.out.print(getName() + " is working as a " + getTitle() + " on the following project(s): ");
        if(projects.size() ==1){
            System.out.println(projects.get(0));
        } else if(projects.size() ==2){
            System.out.println(projects.get(0) + " and " + projects.get(1));
        }
        else{
            for(int i=0; i<projects.size()-1; i++){
                System.out.print(projects.get(i) + ", ");
            }
            System.out.println("and " + projects.get(projects.size()-1));
        } 
    }

    public String toString(){
        return super.toString() + "| Manager of " + projects;
    }
}
