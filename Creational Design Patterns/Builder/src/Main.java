import java.util.List;

public class Main {
    public static void main(String[] args) {

        MessageNotification messageNotification = new MessengerNotificationBuilder()
                .setContent("Hello World!")
                .setSender("Admin")
                .setRecipient("User")
                .setTimesTamp("2025-06-15 09:00")
                .setTheme("Dark")
                .setAttachments(List.of("file1.png", "file2.pdf"))
                .build();

        System.out.println("Notification created successfully!");
        System.out.println(messageNotification);
    }
}
