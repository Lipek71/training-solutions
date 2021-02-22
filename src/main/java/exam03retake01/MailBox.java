package exam03retake01;

import java.util.ArrayList;
import java.util.List;

public class MailBox {

    private List<Mail> mails = new ArrayList<>();

    public void addMail(Mail mail) {
        mails.add(mail);
    }

    public List<Mail> getMails() {
        return mails;
    }

    public List<Mail> findByCriteria(String criteria) {
        List<Mail> foundMails = new ArrayList<>();
        if (criteria.split(":")[0].equals("from")) {
            findByFrom(criteria, foundMails);
        }
        if (criteria.split(":")[0].equals("to")) {
            findByTo(criteria, foundMails);
        } else {
            findByOther(criteria, foundMails);
        }
        return foundMails;
    }

    private void findByFrom(String criteria, List<Mail> foundMails) {
        for (Mail mail : mails) {
            if (mail.getFrom().getEmail().equals(criteria.split(":")[1]) || mail.getFrom().getName().equals(criteria.split(":")[1])) {
                foundMails.add(mail);
            }
        }
    }

    private void findByTo(String criteria, List<Mail> foundMails) {
        for (Mail mail : mails) {
            for(Contact contact: mail.getTo()){
                if (contact.getName().equals(criteria.split(":")[1]) || contact.getEmail().equals(criteria.split(":")[1])) {
                    foundMails.add(mail);
                }
            }
        }
    }

    private void findByOther(String criteria, List<Mail> foundMails) {
        for (Mail mail : mails) {
            if (mail.getSubject().contains(criteria) || mail.getMessage().contains(criteria)) {
                foundMails.add(mail);
            }
        }
    }
}

