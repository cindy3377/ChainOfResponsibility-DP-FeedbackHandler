public class GeneralFeedbackHandler extends FeedbackHandler {
    @Override
    protected boolean canHandle(Message message) {
        return message.getMessageType() == MessageType.GENERAL_FEEDBACK;
    }

    @Override
    protected String process(Message message) {
        return "[General Feedback] Thanked " + message.getSenderEmail() +
                " for feedback: '" + message.getContent() + "'";
    }
}
