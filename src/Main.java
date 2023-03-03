import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String input;

        Scanner usrIn = new Scanner(System.in);

        new AudioHandler();

        System.out.println("Ask Aurora:");
        input = usrIn.nextLine();

        switch (input) {
            case "Test the Aurora system." -> AudioHandler.auroraClip("narration.wav");
            case "two" -> AudioHandler.auroraClip("test.wav");
            default -> System.out.println("\nI'm not sure I understand.");
        }

    }

}
