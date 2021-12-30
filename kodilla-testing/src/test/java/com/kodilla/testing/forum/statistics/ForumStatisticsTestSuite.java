package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.startsWith;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayName("TDD: Forum Statistics Test Suite")
public class ForumStatisticsTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Mock
    private Statistics statisticsMock;

    private List<String> generateUsersList(int usersQuantity) {
        List<String> usersList = new ArrayList<>();
        for (int n = 1; n <= usersQuantity; n++) {
            usersList.add("User" + n);
        }
        return usersList;
    }

    @DisplayName("Test for: number of posts = 0")
    @Test
    void zeroPosts() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCounts()).thenReturn(50);
        List<String> resultListOf4Users = generateUsersList(4);
        when(statisticsMock.userNames()).thenReturn(resultListOf4Users);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(4, forumStatistics.getNumberOfUsers());
        assertEquals(0, forumStatistics.getNumberOfPosts());
        assertEquals(50, forumStatistics.getNumberOfComments());
        assertEquals(0, forumStatistics.getAvgNumberOfPostsPerUser());
        assertEquals(12.5, forumStatistics.getAvgNumberOfCommentsPerUser());
        assertEquals(0, forumStatistics.getAvgNumberOfCommentsPerPost());
    }

    @DisplayName("Test for: number of post = 1000")
    @Test
    void thousandPosts() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCounts()).thenReturn(50);
        List<String> resultListOf5Users = generateUsersList(5);
        when(statisticsMock.userNames()).thenReturn(resultListOf5Users);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(5, forumStatistics.getNumberOfUsers());
        assertEquals(1000, forumStatistics.getNumberOfPosts());
        assertEquals(50, forumStatistics.getNumberOfComments());
        assertEquals(200, forumStatistics.getAvgNumberOfPostsPerUser());
        assertEquals(10, forumStatistics.getAvgNumberOfCommentsPerUser());
        assertEquals(0.05, forumStatistics.getAvgNumberOfCommentsPerPost());
    }

    @DisplayName("Test for: number of comments = 0")
    @Test
    void zeroComments() {
        //Given
        when(statisticsMock.commentsCounts()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(50);
        List<String> resultListOf5Users = generateUsersList(5);
        when(statisticsMock.userNames()).thenReturn(resultListOf5Users);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(5, forumStatistics.getNumberOfUsers());
        assertEquals(50, forumStatistics.getNumberOfPosts());
        assertEquals(0, forumStatistics.getNumberOfComments());
        assertEquals(10, forumStatistics.getAvgNumberOfPostsPerUser());
        assertEquals(0, forumStatistics.getAvgNumberOfCommentsPerUser());
        assertEquals(0, forumStatistics.getAvgNumberOfCommentsPerPost());
    }

    @DisplayName("Test for: posts number greater then comments number")
    @Test
    void morePostsThanComments() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCounts()).thenReturn(50);
        List<String> resultListOf5Users = generateUsersList(5);
        when(statisticsMock.userNames()).thenReturn(resultListOf5Users);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(5, forumStatistics.getNumberOfUsers());
        assertEquals(100, forumStatistics.getNumberOfPosts());
        assertEquals(50, forumStatistics.getNumberOfComments());
        assertEquals(20, forumStatistics.getAvgNumberOfPostsPerUser());
        assertEquals(10, forumStatistics.getAvgNumberOfCommentsPerUser());
        assertEquals(0.5,forumStatistics.getAvgNumberOfCommentsPerPost());
    }

    @DisplayName("Test for: comments number greater than posts number")
    @Test
    void moreCommentsThanPosts() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCounts()).thenReturn(100);
        List<String> resultListOf5Users = generateUsersList(5);
        when(statisticsMock.userNames()).thenReturn(resultListOf5Users);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(5,forumStatistics.getNumberOfUsers());
        assertEquals(50, forumStatistics.getNumberOfPosts());
        assertEquals(100, forumStatistics.getNumberOfComments());
        assertEquals(10, forumStatistics.getAvgNumberOfPostsPerUser());
        assertEquals(20, forumStatistics.getAvgNumberOfCommentsPerUser());
        assertEquals(2, forumStatistics.getAvgNumberOfCommentsPerPost());
    }

    @DisplayName("Test for: number of users = 0")
    @Test
    void zeroUsers() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCounts()).thenReturn(200);
        List<String> users = new ArrayList<>();
        when(statisticsMock.userNames()).thenReturn(users);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getNumberOfUsers());
        assertEquals(10, forumStatistics.getNumberOfPosts());
        assertEquals(200, forumStatistics.getNumberOfComments());
        assertEquals(0, forumStatistics.getAvgNumberOfPostsPerUser());
        assertEquals(0, forumStatistics.getAvgNumberOfCommentsPerUser());
        assertEquals(20, forumStatistics.getAvgNumberOfCommentsPerPost());
    }

    @DisplayName("Test for: number of users = 100")
    @Test
    void hundredUsers() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCounts()).thenReturn(200);
        List<String> resultListOf100Users = generateUsersList(100);
        when(statisticsMock.userNames()).thenReturn(resultListOf100Users);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, forumStatistics.getNumberOfUsers());
        assertEquals(10, forumStatistics.getNumberOfPosts());
        assertEquals(200, forumStatistics.getNumberOfComments());
        assertEquals(0.1, forumStatistics.getAvgNumberOfPostsPerUser());
        assertEquals(2, forumStatistics.getAvgNumberOfCommentsPerUser());
        assertEquals(20, forumStatistics.getAvgNumberOfCommentsPerPost());
    }
}
