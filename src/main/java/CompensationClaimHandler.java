public class CompensationClaimHandler extends FeedbackHandler {
    @Override
    protected boolean canHandle(Message message) {
        return message.getMessageType() == MessageType.COMPENSATION_CLAIM;
    }

    @Override
    protected String process(Message message) {
        return "[Compensation Claim] Reviewed claim from " + message.getSenderEmail() +
                ": '" + message.getContent() + "' - Status: Under Review";
    }
}
