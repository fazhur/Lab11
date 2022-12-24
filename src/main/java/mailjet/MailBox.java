package mailjet;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import lombok.Getter;

import java.util.List;

public class MailBox {
    private final MailSender sender = new MailSender();
    @Getter
    private List<MailCode> informations;

    public void addMailinfo(MailCode info){
        informations.add(info);
    }
    public void sendAll() throws MailjetSocketTimeoutException, MailjetException {
        for (MailCode information: informations) {
            sender.sendMail(information);
        }
    }
}