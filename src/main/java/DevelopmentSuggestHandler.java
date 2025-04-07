public class DevelopmentSuggestHandler extends FeedbackHandler {
    @Override
    protected boolean canHandle(Message message) {
        return message.getMessageType() == MessageType.DEVELOPMENT_SUGGESTION;
    }

    @Override
    protected String process(Message message) {
        return "[Development Suggestion] Logged suggestion from " + message.getSenderEmail() +
                ": '" + message.getContent() + "' - Priority pending";
    }
}
