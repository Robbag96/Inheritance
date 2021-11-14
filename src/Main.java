public class Main {
    public static void main(String[] args) {
//        Student student = new Student("Vazgen");
//        student.setName("Hayk");
//        student.setLastname("Gevorgyan");
//        student.setYear(12);
//        student.setStudentId(1256);
//        student.setFaculty("Economics");
//
//
//        Teacher teacher = new Teacher("Ani");
//        teacher.setName("Vigen");
//        teacher.setLastname("Grigoryan");
//        teacher.setYear(32);
//        teacher.setExperience(2);
//        teacher.setSalary(1000);
//
//        student.printInfo();
//        System.out.println();
//        teacher.printInfo();

        BackendDeveloper backendDeveloper = new BackendDeveloper("Robert");
        backendDeveloper.setName("Robert");
        backendDeveloper.setLastName("Baghdasaryan");
        backendDeveloper.setYear(26);
        backendDeveloper.setWorkingExperience(1);
        backendDeveloper.setKnowledgeOfJava(true);

        FrontendDeveloper frontendDeveloper = new FrontendDeveloper("David");
        frontendDeveloper.setName("David");
        frontendDeveloper.setLastName("Sargsyan");
        frontendDeveloper.setYear(30);
        frontendDeveloper.setNumberOfProjects(5);
        frontendDeveloper.setKnowledgeOfJavascript(true);

        Devops devops = new Devops("Anna");
        devops.setName("Anna");
        devops.setLastName("Avetisyan");
        devops.setYear(29);
        devops.setSalary(1000000);
        devops.setKnowledgeOfAnyLanguage("Java");

        backendDeveloper.printInfo();
        System.out.println();
        frontendDeveloper.printInfo();
        System.out.println();
        devops.printInfo();

    }
}
