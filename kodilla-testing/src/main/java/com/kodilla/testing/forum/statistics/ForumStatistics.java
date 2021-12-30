package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double avgNumberOfPostsPerUser;
    private double avgNumberOfCommentsPerUser;
    private double avgNumberOfCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.userNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCounts();
        avgNumberOfPostsPerUser = numberOfPosts / (double) numberOfUsers;
        avgNumberOfCommentsPerUser = numberOfComments / (double) numberOfUsers;
        if(numberOfPosts != 0) {
            avgNumberOfCommentsPerPost = numberOfComments / (double)numberOfPosts;
        } else {
            avgNumberOfCommentsPerPost = 0;
        }
        if(numberOfUsers != 0) {
            avgNumberOfPostsPerUser = numberOfPosts / (double) numberOfUsers;
            avgNumberOfCommentsPerUser = numberOfComments / (double) numberOfUsers;
        } else {
            avgNumberOfPostsPerUser = 0;
            avgNumberOfCommentsPerUser =0;
        }
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAvgNumberOfPostsPerUser() {
        return avgNumberOfPostsPerUser;
    }

    public double getAvgNumberOfCommentsPerUser() {
        return avgNumberOfCommentsPerUser;
    }

    public double getAvgNumberOfCommentsPerPost() {
        return avgNumberOfCommentsPerPost;
    }
}
