public class Projects {
    public String name;
    public String description;

    public String project(){
        return sayGreeting("Hello");
    }
    public String project(String name) {
        this.name = name;
        return "Project name: " + name;
    }

    // public String project(String description) {
    //     return "Description: " + description;
    // }
    public String elevatorPitch(String name, String description) {
        this.name = name;
        this.description = description;
        return name + " : " + description;
    }
    private String sayGreeting(String giveAll) {
        return giveAll + " and welcome";
    }
}