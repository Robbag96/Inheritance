public class Devops extends Developer{

    private int salary;
    private String knowledgeOfAnyLanguage;


    public Devops(String name) {
        super(name);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getKnowledgeOfAnyLanguage() {
        return knowledgeOfAnyLanguage;
    }

    public void setKnowledgeOfAnyLanguage(String knowledgeOfAnyLanguage) {
        this.knowledgeOfAnyLanguage = knowledgeOfAnyLanguage;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Salary: "+ salary);
        System.out.println("Knowledge of language: "+knowledgeOfAnyLanguage);
    }

}
