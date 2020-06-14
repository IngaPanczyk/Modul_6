package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static jdk.nashorn.internal.objects.Global.Infinity;
import static jdk.nashorn.internal.objects.Global.NaN;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {
    //Przypadek 1: Liczba użytkowników = 100
    @Test
    public void testCalculateAdvStatistics1() {
        //Given
        //Liczba użytkowników 100
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersList.add("User" + i);
        }
        StatisticsCalculate1 calculate = new StatisticsCalculate1();
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(50);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        //When
        calculate.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(50, calculate.getCommentsCount(), 0);
        Assert.assertEquals(10, calculate.getPostsCount(), 0);
        Assert.assertEquals(100, calculate.getUserCountNumber(), 0);
        Assert.assertEquals(5.0, calculate.getAdvCommentsCountForPostsCount(), 0);
        Assert.assertEquals(0.1, calculate.getAdvPostsCountForUser(), 0);
        Assert.assertEquals(5.0, calculate.getAdvCommentsCountForPostsCount(), 0);
    }

    //Przypadek 2: Liczba użytkowników = 0
    @Test
    public void testCalculateAdvStatistics2() {
        //Given

        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<String>();

        StatisticsCalculate1 calculate = new StatisticsCalculate1();

        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(50);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        //When
        calculate.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(50, calculate.getCommentsCount(), 0);
        Assert.assertEquals(10, calculate.getPostsCount(), 0);
        Assert.assertEquals(0, calculate.getUserCountNumber(), 0);
        Assert.assertEquals(5, calculate.getAdvCommentsCountForPostsCount(), 0);
        Assert.assertEquals(0, calculate.getAdvPostsCountForUser(), 0);
        Assert.assertEquals(0, calculate.getAdvCommentsCountForUser(), 0);
    }

    //Przypadek 3: gdy liczba komentarzy = 0,
    @Test
    public void testCalculateAdvStatistics3() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersList.add("User" + i);
        }
        StatisticsCalculate1 calculate = new StatisticsCalculate1();

        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        //When
        calculate.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, calculate.getCommentsCount(), 0);
        Assert.assertEquals(10, calculate.getPostsCount(), 0);
        Assert.assertEquals(100, calculate.getUserCountNumber(), 0);
        Assert.assertEquals(0, calculate.getAdvCommentsCountForPostsCount(), 0);
        Assert.assertEquals(0.1, calculate.getAdvPostsCountForUser(), 0);
        Assert.assertEquals(0, calculate.getAdvCommentsCountForUser(), 0);
    }

    //Przypadek 4: gdy liczba komentarzy < liczba postów,,
    @Test
    public void testCalculateAdvStatistics4() {
        //Given
        //Liczba użytkowników 100
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersList.add("User" + i);
        }
        StatisticsCalculate1 calculate = new StatisticsCalculate1();

        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        //When
        calculate.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(10, calculate.getCommentsCount(), 0);
        Assert.assertEquals(100, calculate.getPostsCount(), 0);
        Assert.assertEquals(100, calculate.getUserCountNumber(), 0);
        Assert.assertEquals(0.1, calculate.getAdvCommentsCountForPostsCount(), 0);
        Assert.assertEquals(1.0, calculate.getAdvPostsCountForUser(), 0);
        Assert.assertEquals(0.1, calculate.getAdvCommentsCountForUser(), 0);
    }

    //Przypadek 5: gdy liczba komentarzy > liczba postów,,
    @Test
    public void testCalculateAdvStatistics5() {
        //Given
        //Liczba użytkowników 100
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersList.add("User" + i);
        }
        StatisticsCalculate1 calculate = new StatisticsCalculate1();

        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(10000);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        //When
        calculate.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(10000, calculate.getCommentsCount(), 0);
        Assert.assertEquals(100, calculate.getPostsCount(), 0);
        Assert.assertEquals(100, calculate.getUserCountNumber(), 0);
        Assert.assertEquals(100.0, calculate.getAdvCommentsCountForPostsCount(), 0);
        Assert.assertEquals(1.0, calculate.getAdvPostsCountForUser(), 0);
        Assert.assertEquals(100.0, calculate.getAdvCommentsCountForUser(), 0);
    }

    //Przypadek 6: gdy liczba postów = 0
    @Test
    public void testCalculateAdvStatistics6() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersList.add("User" + i);
        }
        StatisticsCalculate1 calculate = new StatisticsCalculate1();

        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10000);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        //When
        calculate.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(10000, calculate.getCommentsCount(), 0);
        Assert.assertEquals(0, calculate.getPostsCount(), 0);
        Assert.assertEquals(100, calculate.getUserCountNumber(), 0);
        Assert.assertEquals(0, calculate.getAdvCommentsCountForPostsCount(), 0);
        Assert.assertEquals(0, calculate.getAdvPostsCountForUser(), 0);
        Assert.assertEquals(100.0, calculate.getAdvCommentsCountForUser(), 0);
    }

    //Przypadek 7: gdy liczba postów = 1000
    @Test
    public void testCalculateAdvStatistics7() {
        //Given
        //Liczba użytkowników 100
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersList.add("User" + i);
        }
        StatisticsCalculate1 calculate = new StatisticsCalculate1();

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        //When
        calculate.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(1000, calculate.getCommentsCount(), 0);
        Assert.assertEquals(1000, calculate.getPostsCount(), 0);
        Assert.assertEquals(100, calculate.getUserCountNumber(), 0);
        Assert.assertEquals(1, calculate.getAdvCommentsCountForPostsCount(), 0);
        Assert.assertEquals(10, calculate.getAdvPostsCountForUser(), 0);
        Assert.assertEquals(10, calculate.getAdvCommentsCountForUser(), 0);
    }

}
