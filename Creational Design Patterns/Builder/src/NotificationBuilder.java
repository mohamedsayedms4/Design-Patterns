public interface NotificationBuilder {

    NotificationBuilder setContent(String content);
    NotificationBuilder setSender(String sender);
    NotificationBuilder setRecipient(String recipient);
    NotificationBuilder setTimesTamp(String timesTamp);

}
