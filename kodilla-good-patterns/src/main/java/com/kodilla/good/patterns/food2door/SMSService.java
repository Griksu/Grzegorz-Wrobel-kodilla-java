package com.kodilla.good.patterns.food2door;

public class SMSService implements InformationService{

    public void sendSMS(String userPhoneNumber){
    }

    @Override
    public void inform(User user) {
        SMSService smsService = new SMSService();
        smsService.sendSMS(user.getUserPhoneNumber());
    }
}
