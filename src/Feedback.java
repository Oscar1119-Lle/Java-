public class Feedback {
    private String firstName;
    private String lastName;
    private String email;
    private String completeFeedback;
    private String reviewID;
    private boolean longFeedback;

    public Feedback(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }

    private String feedbackUsingConcatenation(String sent1, String sent2, String sent3, String sent4, String sent5) {
        String concatenatedFeedback = sent1+ " " + sent2 + " " + sent3 + " " + sent4 + " " + sent5;
        return concatenatedFeedback;
    }

    private StringBuilder feedbackUsingStringBuilder(String sent1, String sent2, String sent3, String sent4, String sent5) {
        StringBuilder sb = new StringBuilder();
        sb.append(sent1).append(" ");sb.append(sent2).append(" ");sb.append(sent3).append(" ");sb.append(sent4).append(" ");sb.append(sent5).append(" ");
        return sb;
    }

    private boolean checkFeedbackLength(String completeFeedback) {
        longFeedback = completeFeedback.length() > 500;
        return longFeedback;
    }

    private void createReviewID(String firstName, String lastName, String completeFeedback) {
        reviewID= (firstName + lastName).substring(2, 6).toUpperCase();
        reviewID+= completeFeedback.substring(10, 15).toLowerCase();
        reviewID+= completeFeedback.length();
        reviewID+="_";
        reviewID+= System.currentTimeMillis();
        reviewID =reviewID.replace(" ", "");
    }

    public void analyseFeedback(boolean isConcatenation, String sent1, String sent2, String sent3, String sent4, String sent5) {
        if (isConcatenation) {
            completeFeedback = feedbackUsingConcatenation(sent1, sent2, sent3, sent4, sent5);
            checkFeedbackLength(completeFeedback);
            createReviewID(firstName, lastName, completeFeedback);
        } else {
            completeFeedback = feedbackUsingStringBuilder(sent1, sent2, sent3, sent4, sent5).toString();
            checkFeedbackLength(completeFeedback);
            createReviewID(firstName, lastName, completeFeedback);
        }
    }

    @Override
    public String toString() {
        return "Feedback{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", email='" + email + '\'' + ", completeFeedback='" + completeFeedback + '\'' + ", longFeedback=" + longFeedback + ", reviewID='" + reviewID + '\'' + '}';
    }
}
