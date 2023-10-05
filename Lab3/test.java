import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class House {
    private int numberOfBedrooms;
    private int numberOfBathrooms;
    private double area;
    private double numberOfFloors;

    private House(int numberOfBedrooms, int numberOfBathrooms, double area, double numberOfFloors) {
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.area = area;
        this.numberOfFloors = numberOfFloors;
    }

    public static House createFromText(String text) {
        int numberOfBedrooms = 0;
        int numberOfBathrooms = 0;
        double area = 0.0;
        double numberOfFloors = 1.0; // Default value is 1.0

        // Define regular expressions to match patterns in the text
        Pattern bedroomPattern = Pattern.compile("(\\d+)\\s*bedroom");
        Pattern bathroomPattern = Pattern.compile("(\\d+)\\s*bathroom");
        Pattern areaPattern = Pattern.compile("(\\d+(?:,\\d{3})*(?:\\.\\d+)?)\\s*sq\\.\\s*ft\\.");
        Pattern floorPattern = Pattern.compile("(\\d+(?:\\.\\d+)?)\\s*story|stories");

        Matcher bedroomMatcher = bedroomPattern.matcher(text);
        Matcher bathroomMatcher = bathroomPattern.matcher(text);
        Matcher areaMatcher = areaPattern.matcher(text);
        Matcher floorMatcher = floorPattern.matcher(text);

        // Find matches and extract information
        if (bedroomMatcher.find()) {
            numberOfBedrooms = Integer.parseInt(bedroomMatcher.group(1));
        }
        if (bathroomMatcher.find()) {
            numberOfBathrooms = Integer.parseInt(bathroomMatcher.group(1));
        }
        if (areaMatcher.find()) {
            // Remove commas and convert to a double
            String areaStr = areaMatcher.group(1).replaceAll(",", "");
            area = Double.parseDouble(areaStr);
        }
        if (floorMatcher.find()) {
            numberOfFloors = Double.parseDouble(floorMatcher.group(1));
        }

        return new House(numberOfBedrooms, numberOfBathrooms, area, numberOfFloors);
    }

    @Override
    public String toString() {
        return "House{numberOfBedrooms=" + numberOfBedrooms +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", area=" + area +
                ", numberOfFloors=" + numberOfFloors + '}';
    }
}

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String text = sc.nextLine();
        System.out.println(House.createFromText(text));
    }
}
