import java.util.*;
public class Company{
    private String name;
    private String location;
    private String role;
    private double ctc;
    //Eligibility criteria
    private float minCGPA;
    private boolean arrearsAllowed;
    List<String>rounds;
    public Company(String name, String location, String role, double ctc, float minCGPA, boolean arrearsAllowed, List<String> rounds) {
        this.name = name;
        this.location = location;
        this.role = role;
        this.ctc = ctc;
        this.minCGPA = minCGPA;
        this.arrearsAllowed = arrearsAllowed;
        this.rounds = rounds;
    }
    // Getters and Setters for all fields
    public String getName() {   
        return name;
    }       
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public double getCtc() {
        return ctc;
    }
    public void setCtc(double ctc) {
        this.ctc = ctc;
    }
    public float getMinCGPA() {
        return minCGPA;
    }
    public void setMinCGPA(float minCGPA) {
        this.minCGPA = minCGPA;
    }
    public boolean isArrearsAllowed() {
        return arrearsAllowed;
    }
    public void setArrearsAllowed(boolean arrearsAllowed) {
        this.arrearsAllowed = arrearsAllowed;
    }
    public List<String> getRounds() {
        return rounds;
    }
    public void setRounds(List<String> rounds) {
        this.rounds = rounds;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", role='" + role + '\'' +
                ", CTC=" + ctc +
                ", minCGPA=" + minCGPA +
                ", arrearsAllowed=" + arrearsAllowed +
                ", rounds=" + rounds +
                '}';
    }


}

