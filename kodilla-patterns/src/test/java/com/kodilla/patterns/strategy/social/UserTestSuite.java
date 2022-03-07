package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User mike = new YGeneration("Michael Watford");
        User julie = new ZGeneration("Julie Zogg");
        User tyler = new Millenials("Tyler Perry");

        //When
        String mikeShouldPublish = mike.publish();
        System.out.println("Michael should: " + mikeShouldPublish);
        String julieShouldPublish = julie.publish();
        System.out.println("Julie should: " + julieShouldPublish);
        String tylerShouldPublish = tyler.publish();
        System.out.println("Tyler should: " + tylerShouldPublish);

        //Then
        assertEquals("[Facebook publisher] Share the posts on Facebook", mikeShouldPublish);
        assertEquals("[Twitter publisher] Share the twits on Twitter", julieShouldPublish);
        assertEquals("[Snapchat publisher] Share the stories on Snapchat", tylerShouldPublish);
    }

    @Test
    void testIndividualSharingStrategies() {
        //Given
        User mike = new YGeneration("Michael Watford");

        //When
        String mikeShouldPublish = mike.publish();
        System.out.println("Micheal should: " +mikeShouldPublish);
        mike.setSocialPublisher(new TwitterPublisher());
        mikeShouldPublish = mike.publish();
        System.out.println("Michael now should: " + mikeShouldPublish);

        //Then
        assertEquals("[Twitter publisher] Share the twits on Twitter", mikeShouldPublish);
    }
}