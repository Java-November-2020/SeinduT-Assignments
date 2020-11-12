public class ProjectsTest {
    public static void main(String[] args) {
        Projects p = new Projects();

        String project = p.project();
        String projectName = p.project("OOP Java");
        // String projectDescription = p.project("First project");
        String nameWithDes = p.elevatorPitch("OOP Java", "First project");
        System.out.println(project);
        System.out.println(projectName);
        // System.out.println(projectDescription);
        System.out.println(nameWithDes);
    }
}