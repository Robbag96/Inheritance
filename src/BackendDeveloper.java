public class BackendDeveloper extends Developer{

    private int workingExperience;
    private boolean knowledgeOfJava;

    public BackendDeveloper(String name) {
        super(name);
    }

    public int getWorkingExperience() {
        return workingExperience;
    }

    public void setWorkingExperience(int workingExperience) {
        this.workingExperience = workingExperience;
    }

    public boolean isKnowledgeOfJava() {
        return knowledgeOfJava;
    }

    public void setKnowledgeOfJava(boolean knowledgeOfJava) {
        this.knowledgeOfJava = knowledgeOfJava;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Working experience: " +workingExperience);
        System.out.println("Knowledge of Java: "+knowledgeOfJava);
    }
}
