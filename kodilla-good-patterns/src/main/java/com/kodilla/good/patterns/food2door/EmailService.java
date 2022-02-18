package com.kodilla.good.patterns.food2door;

public class EmailService implements InformationService {

    public void sendEmail(String userEmail) {
    }

    @Override
    public void inform(User user) {
        EmailService emailService = new EmailService();
        emailService.sendEmail(user.getUserEmail());
    }
}
