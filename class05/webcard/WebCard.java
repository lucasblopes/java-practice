
public abstract class WebCard {

    protected String recipient;

    public WebCard(String recipient) {
        this.setRecipient(recipient);
    }

    public String getRecipient() {
        return this.recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public abstract String returnMsg(String sender);
}
