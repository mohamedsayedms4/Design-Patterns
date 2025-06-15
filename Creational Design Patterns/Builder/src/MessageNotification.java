import java.util.List;

public class MessageNotification {

    private String content;
    private String sender;
    private String recipient;
    private String timeTamp;

    private List<String> attachments;
    private String theme ;


     MessageNotification(MessengerNotificationBuilder builder) {
        this.content = builder.getContent();
        this.sender = builder.getSender();
        this.recipient = builder.getRecipient();
        this.timeTamp = builder.getTimeTamp();
        this.attachments = builder.getAttachments();
        this.theme = builder.getTheme();
    }

    @Override
    public String toString() {
        return "MessageNotification{" +
                "content='" + content + '\'' +
                ", sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", timeTamp='" + timeTamp + '\'' +
                ", attachments=" + attachments +
                ", theme='" + theme + '\'' +
                '}';
    }
}
