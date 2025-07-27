import java.util.*;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<Student> students = new ArrayList<>();
    static List<Company> companies = new ArrayList<>();
    public static void main(String[] args) {
        // Example usage of the Student class
         int choice;
        do {
            System.out.println("\n===== STUDENT PLACEMENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Add Company");
            System.out.println("3. View Student Profile Report");
            System.out.println("4. View Company Profile Report");
            System.out.println("5. Company-wise Student Performance Report");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    addCompany();
                    break;
                case 3:
                    viewStudentProfiles();
                    break;
                case 4:
                    viewCompanyProfiles();
                    break;
                case 5:
                   generateCompanyWiseStudentReport();
                    break;
                case 6:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);
    }
    private static void addStudent() {
    System.out.println("\n-- Add Student --");

    try {
        System.out.print("ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Phone: ");
        String phone = scanner.nextLine();

        System.out.print("Date of Birth (dd-mm-yyyy): ");
        String dob = scanner.nextLine();

        System.out.print("CGPA: ");
        float cgpa = Float.parseFloat(scanner.nextLine());

        System.out.print("Department: ");
        String department = scanner.nextLine();

        System.out.print("Attendance (%): ");
        String attendance = scanner.nextLine();

        System.out.print("SkillRack Score: ");
        int skillrackScore = Integer.parseInt(scanner.nextLine());

        System.out.print("LeetCode Score: ");
        int leetcodeScore = Integer.parseInt(scanner.nextLine());

        System.out.print("Has Standing Arrears? (true/false): ");
        boolean hasStandingArrears = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("Total Arrears: ");
        int totalArrears = Integer.parseInt(scanner.nextLine());

        System.out.print("Interested in Higher Studies? (true/false): ");
        boolean higherStudies = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("Interested in Entrepreneurship? (true/false): ");
        boolean entrepreneurship = Boolean.parseBoolean(scanner.nextLine());

        Student student = new Student(
            id, name, email, phone, dob, cgpa, department,
            attendance, skillrackScore, leetcodeScore,
            totalArrears, hasStandingArrears, totalArrears, higherStudies, entrepreneurship
        );

        students.add(student);
        System.out.println("✅ Student added successfully!");

    } catch (Exception e) {
        System.out.println("❌ Error: Invalid input. Try again.");
    }
}
private static void viewStudentProfiles() {
    System.out.println("\n-- Student Profile Report --");

    if (students.isEmpty()) {
        System.out.println("No student data available.");
        return;
    }

    for (Student s : students) {
        System.out.println("--------------------------------");
        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
        System.out.println("Email: " + s.getEmail());
        System.out.println("Phone: " + s.getPhone());
        System.out.println("DOB: " + s.getDob());
        System.out.println("CGPA: " + s.getCgpa());
        System.out.println("Department: " + s.getDepartment());
        System.out.println("Attendance: " + s.getAttendance());
        System.out.println("SkillRack Score: " + s.getSkillrackScore());
        System.out.println("LeetCode Score: " + s.getLeetcodeScore());
        System.out.println("Standing Arrears: " + s.isHasStandingArrears());
        System.out.println("Total Arrears: " + s.getTotalArrears());
        System.out.println("Higher Studies: " + s.isHigherStudies());
        System.out.println("Entrepreneurship: " + s.isEntrepreneurship());
    }
}
private static void addCompany() {
    System.out.println("\n-- Add Company --");

    try {
        System.out.print("Company Name: ");
        String name = scanner.nextLine();

        System.out.print("Location: ");
        String location = scanner.nextLine();

        System.out.print("Role Offered: ");
        String role = scanner.nextLine();

        System.out.print("CTC (in LPA): ");
        double ctc = Double.parseDouble(scanner.nextLine());

        System.out.print("Minimum CGPA Required: ");
        float minCGPA = Float.parseFloat(scanner.nextLine());

        System.out.print("Are Arrears Allowed? (true/false): ");
        boolean arrearsAllowed = Boolean.parseBoolean(scanner.nextLine());

        List<String> rounds = new ArrayList<>();
        System.out.print("Enter number of rounds: ");
        int numRounds = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numRounds; i++) {
            System.out.print("Round " + (i + 1) + " name: ");
            String roundName = scanner.nextLine();
            rounds.add(roundName);
        }

        Company company = new Company(name, location, role, ctc, minCGPA, arrearsAllowed, rounds);
        companies.add(company);

        System.out.println("✅ Company added successfully!");

    } catch (Exception e) {
        System.out.println("❌ Error: Invalid input. Try again.");
    }
}
private static void viewCompanyProfiles() {
    System.out.println("\n-- Company Profile Report --");

    if (companies.isEmpty()) {
        System.out.println("No company data available.");
        return;
    }

    for (Company c : companies) {
        System.out.println("--------------------------------");
        System.out.println("Name: " + c.getName());
        System.out.println("Location: " + c.getLocation());
        System.out.println("Role: " + c.getRole());
        System.out.println("CTC: " + c.getCtc() + " LPA");
        System.out.println("Minimum CGPA: " + c.getMinCGPA());
        System.out.println("Arrears Allowed: " + c.isArrearsAllowed());
        System.out.println("Rounds: " + String.join(", ", c.getRounds()));
    }
}
private static void generateCompanyWiseStudentReport() {
    System.out.println("\n-- Company-Wise Student Eligibility Report --");

    if (companies.isEmpty() || students.isEmpty()) {
        System.out.println("❌ Please ensure both companies and students are added.");
        return;
    }

    for (Company company : companies) {
        System.out.println("\n========================================");
        System.out.println("Company: " + company.getName());
        System.out.println("Role: " + company.getRole());
        System.out.println("CTC: " + company.getCtc() + " LPA");
        System.out.println("Eligibility: CGPA >= " + company.getMinCGPA() +
                           ", Arrears Allowed: " + company.isArrearsAllowed());
        System.out.println("Rounds: " + String.join(", ", company.getRounds()));
        System.out.println("----------------------------------------");
        System.out.println("Eligible Students:");

        boolean anyEligible = false;

        for (Student student : students) {
            boolean isEligible = student.getCgpa() >= company.getMinCGPA()
                    && (company.isArrearsAllowed() || !student.isHasStandingArrears());

            if (isEligible) {
                anyEligible = true;
                System.out.println("ID: " + student.getId() + " | Name: " + student.getName() +
                        " | CGPA: " + student.getCgpa() +
                        " | Arrears: " + (student.isHasStandingArrears() ? "Yes" : "No"));
            }
        }

        if (!anyEligible) {
            System.out.println("No eligible students found for this company.");
        }
    }
}

        
}
