package com.kodilla.patterns.strategy.social;

public class FacebookPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "[Facebook publisher] Share the posts on Facebook";
    }
}