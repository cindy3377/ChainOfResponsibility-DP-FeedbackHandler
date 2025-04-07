public class Main {
    public static void main(String[] args) {
        // Create handlers
        FeedbackHandler compensation = new CompensationClaimHandler();
        FeedbackHandler contact = new ContactRequestHandler();
        FeedbackHandler development = new DevelopmentSuggestHandler();
        FeedbackHandler general = new GeneralFeedbackHandler();

        // Build chain
        compensation.setNext(contact).setNext(development).setNext(general);

        // Sample messages
        Message[] messages = {
                new Message(MessageType.COMPENSATION_CLAIM, "Refund request for faulty item.", "a@gmail.com"),
                new Message(MessageType.CONTACT_REQUEST, "Need help with my account.", "b@gmail.com"),
                new Message(MessageType.DEVELOPMENT_SUGGESTION, "Can you add offline support?", "c@gmail.com"),
                new Message(MessageType.GENERAL_FEEDBACK, "Love your service!", "d@gmail.com")
        };

        // Process messages
        for (Message message : messages) {
            String result = compensation.handle(message);
            System.out.println(result);
        }
    }
}
