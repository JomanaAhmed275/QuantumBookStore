package Mail;

public class Mail {
    public static void sendEmail(String email, String title, String fileType) {
        System.out.println("Sending " + title + " to " + email + " as " + fileType + " file.");
    }
}

