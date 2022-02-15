package com.kodilla.good.patterns.challenges;

public class EmailService implements InformationService {

    private void sendEmail(User user){
    }

    @Override
    public void inform(User user) {
        EmailService emailService = new EmailService();
        emailService.sendEmail(user);
    }
}
