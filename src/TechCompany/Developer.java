package TechCompany;

public class Developer extends Employee{
    private String language;

    Developer(String name, String title, String language){
        super(name, title);
        this.language = language;
    }

    public void work(){
        System.out.println(getName() + " is working as a " + getTitle() + " in " + language);
    }

    public String toString(){
        return super.toString() + "| Working in " + language;
    }
}
