
public class crewMember {
    private String id;
    private String name;
    private String role;
    private String rank;
    private int experienceYears;
    private boolean onDuty;

    public crewMember(String id, String name, String role, String rank, int experienceYears, boolean onDuty) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.rank = rank;
        this.experienceYears = experienceYears;
        this.onDuty = onDuty;
    }

    // Getters & Setters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getRole() { return role; }
    public String getRank() { return rank; }
    public int getExperienceYears() { return experienceYears; }
    public boolean isOnDuty() { return onDuty; }

    public void setName(String name) { this.name = name; }
    public void setRole(String role) { this.role = role; }
    public void setRank(String rank) { this.rank = rank; }
    public void setExperienceYears(int experienceYears) { this.experienceYears = experienceYears; }
    public void setOnDuty(boolean onDuty) { this.onDuty = onDuty; }

    @Override
    public String toString() {
        return "CrewMember :" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", rank='" + rank + '\'' +
                ", experienceYears=" + experienceYears +
                ", onDuty=" + onDuty +
                ':';
    }
}
