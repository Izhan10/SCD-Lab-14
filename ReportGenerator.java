public class ReportGenerator {
    public void generate(String category) {
        if (category.equalsIgnoreCase("Reference")) {
            System.out.println("Reference book usage has been report generated.");
        } else {
            System.out.println("General book usage report generated.");
        }
    }
}
