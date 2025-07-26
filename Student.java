import java.util.*;
public class Student {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String dob;
    private float cgpa;
    private String department;
    private String section;
    private float attendance;
    private int skillrackScore;
    private int leetcodeScore;
    private boolean hasStandingArrears;
    private int totalArrears;
    private boolean higherStudies;
    private boolean entrepreneurship;

    //tracking company wise placement status
    private Map<String,List<String>> companyPerformances;

    public Student(int id, String name, String email, String phone, String dob, float cgpa, String department,
                   String section, float attendance, int skillrackScore, int leetcodeScore,
                   boolean hasStandingArrears, int totalArrears, boolean higherStudies, boolean entrepreneurship) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
        this.cgpa = cgpa;
        this.department = department;
        this.section = section;
        this.attendance = attendance;
        this.skillrackScore = skillrackScore;
        this.leetcodeScore = leetcodeScore;
        this.hasStandingArrears = hasStandingArrears;
        this.totalArrears = totalArrears;
        this.higherStudies = higherStudies;
        this.entrepreneurship = entrepreneurship;
        this.companyPerformances= new HashMap<>();
    }
    // Getters and Setters for all fields
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public float getCgpa() {
        return cgpa;
    }
    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getSection() {
        return section;
    }
    public void setSection(String section) {
        this.section = section;
    }
    public float getAttendance() {
        return attendance;
    }
    public void setAttendance(float attendance) {
        this.attendance = attendance;
    }
    public int getSkillrackScore() {
        return skillrackScore;
    }
    public void setSkillrackScore(int skillrackScore) {
        this.skillrackScore = skillrackScore;
    }
    public int getLeetcodeScore() {
        return leetcodeScore;
    }
    public void setLeetcodeScore(int leetcodeScore) {
        this.leetcodeScore = leetcodeScore;
    }
    public boolean isHasStandingArrears() {
        return hasStandingArrears;
    }
    public void setHasStandingArrears(boolean hasStandingArrears) {
        this.hasStandingArrears = hasStandingArrears;
    }

    public int getTotalArrears() {
        return totalArrears;
    }
    public void setTotalArrears(int totalArrears) {
        this.totalArrears = totalArrears;
    }
    public boolean isHigherStudies() {
        return higherStudies;
    }
    public void setHigherStudies(boolean higherStudies) {
        this.higherStudies = higherStudies;
    }
    public boolean isEntrepreneurship() {
        return entrepreneurship;
    }
    public void setEntrepreneurship(boolean entrepreneurship) {
        this.entrepreneurship = entrepreneurship;
    }
    public Map<String, List<String>> getCompanyPerformances() {
        return companyPerformances;
    }
    public void setCompanyPerformances(Map<String, List<String>> companyPerformances) {
        this.companyPerformances = companyPerformances;
    }
    public void addCompanyPerformance(String companyName, String performance) {
        this.companyPerformances.putIfAbsent(companyName, new ArrayList<>());
        this.companyPerformances.get(companyName).add(performance);
    }
    @Override
   
    public String toString() {
    return "----- Student Report -----\n"
         + "ID: " + id + "\n"
         + "Name: " + name + "\n"
         + "Email: " + email + "\n"
         + "Phone: " + phone + "\n"
         + "DOB: " + dob + "\n"
         + "CGPA: " + cgpa + "\n"
         + "Attendance: " + attendance + "%\n"
         + "Skillrack Score: " + skillrackScore + "\n"
         + "LeetCode Score: " + leetcodeScore + "\n"
         + "Standing Arrears: " + (hasStandingArrears ? "Yes" : "No") + "\n"
         + "Total Arrears: " + totalArrears + "\n"
         + "Higher Studies: " + (higherStudies ? "Yes" : "No") + "\n"
         + "Entrepreneurship: " + (entrepreneurship ? "Yes" : "No") + "\n"
         + "Company Performances: " + formatCompanyPerformances();
}
    private String formatCompanyPerformances() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<String>> entry : companyPerformances.entrySet()) {
            sb.append("\n").append(entry.getKey()).append(": ");
            sb.append(String.join(", ", entry.getValue()));
        }
        return sb.toString();
    }
}
