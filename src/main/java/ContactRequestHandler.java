public class ContactRequestHandler extends FeedbackHandler {
    @Override
    protected boolean canHandle(Message message) {
        return message.getMessageType() == MessageType.CONTACT_REQUEST;
    }

    @Override
    protected String process(Message message) {
        return "[Contact Request] Forwarded request from " + message.getSenderEmail() +
                " to Customer Service: '" + message.getContent() + "'";
    }
}
