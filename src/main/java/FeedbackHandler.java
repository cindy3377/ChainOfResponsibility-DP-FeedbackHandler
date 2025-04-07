public abstract class FeedbackHandler {
    protected FeedbackHandler nextHandler;

    public FeedbackHandler setNext(FeedbackHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public String handle(Message message) {
        if (canHandle(message)) {
            return process(message);
        } else if (nextHandler != null) {
            return nextHandler.handle(message);
        } else {
            return "No handler found for message type: " + message.getMessageType();
        }
    }

    protected abstract boolean canHandle(Message message);
    protected abstract String process(Message message);
}
