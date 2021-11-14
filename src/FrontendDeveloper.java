public class FrontendDeveloper extends Developer{

    private int NumberOfProjects;
    private boolean KnowledgeOfJavascript;


    public FrontendDeveloper(String name) {
        super(name);
    }

    public int getNumberOfProjects() {
        return NumberOfProjects;
    }

    public void setNumberOfProjects(int numberOfProjects) {
        NumberOfProjects = numberOfProjects;
    }

    public boolean isKnowledgeOfJavascript() {
        return KnowledgeOfJavascript;
    }

    public void setKnowledgeOfJavascript(boolean knowledgeOfJavascript) {
        KnowledgeOfJavascript = knowledgeOfJavascript;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("NumberOfProjects: "+ NumberOfProjects);
        System.out.println("KnowledgeOfJavascript: " + KnowledgeOfJavascript);
    }
}
