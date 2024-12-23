import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class TextProcessor {
    public static String convertAgeToBuddhistEra(int age) {
        int currentYear = 2024; 
        return String.valueOf((currentYear - age) + 543);
    }

    public static String convertGradeToRank(String grade) {
        Map<String, String> gradeToRank = new HashMap<>();
        gradeToRank.put("A", "High Distinction");
        gradeToRank.put("B+", "Distinction");
        gradeToRank.put("B", "Distinction");
        gradeToRank.put("C+", "Good");
        gradeToRank.put("C", "Good");
        gradeToRank.put("D+", "Normal");
        gradeToRank.put("D", "Normal");
        gradeToRank.put("F", "Failed");
        
        return gradeToRank.getOrDefault(grade, "Unknown");
    }

    public static String processFile(String filePath) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(filePath)));
        String[] lines = content.split("\\r?\\n");
        String name = lines[0].split(":")[1].trim();
        int age = Integer.parseInt(lines[1].split(":")[1].trim());
        String grade = lines[2].split(":")[1].trim();

        String buddhistEra = convertAgeToBuddhistEra(age);
        String rank = convertGradeToRank(grade);

        return "Name: " + name + "\n" +
               "Buddhist Era: " + buddhistEra + "\n" +
               "Software Testing Rank: " + rank;
    }


    public static void main(String[] args) {
        String filePath = "C:/Output/Textfile.txt";
        try {
            String result = processFile(filePath);
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
