package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    @Test
    public void testCalculateAdvStatistics1() {
        //Given
        //Liczba urzytkowników 100
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<String>();
        for (int i = 0;i< 100;i++) {
            usersList.add("User");
        }
        StatisticsCalculate1 calculate = new StatisticsCalculate1();

        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.commentsCount()).thenReturn(50);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        //When
        int comentsCount = statisticsMock.commentsCount();
        int postsCount = statisticsMock.postsCount();
        int usersCount = statisticsMock.usersNames().size();
        double advPostsCountForUser = calculate.getAdvPostsCountForUser();

        //StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        //Then
        Assert.assertEquals(50, comentsCount);
        Assert.assertEquals(10, postsCount);
        Assert.assertEquals(100, usersCount);
        Assert.assertEquals(15.00, advPostsCountForUser,0);

    }
    /*
    public void testCalculateAdvStatistics2() {
        //Given
        //Liczba urzytkowników 0
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<String>();

        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.commentsCount()).thenReturn(50);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        //When
        int comentsCount = statisticsMock.commentsCount();
        int postsCount = statisticsMock.postsCount();
        int usersCount = statisticsMock.usersNames().size();
        double advPostsCountForUser = postsCount/usersCount;

        //StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        //Then
        Assert.assertEquals(50, comentsCount);
        Assert.assertEquals(10, postsCount);
        Assert.assertEquals(100, usersCount);
        Assert.assertEquals(1000, usersCount);
        Assert.assertEquals(1000.00, advPostsCountForUser);

    }
    //private Statistics mock(Class<Statistics> statisticsClass) {
    //}
    /*
gdy liczba postów = 0,
gdy liczba postów = 1000,
gdy liczba komentarzy = 0,
gdy liczba komentarzy < liczba postów,
gdy liczba komentarzy > liczba postów,
gdy liczba użytkowników = 0,
gdy liczba użytkowników = 100.
     */
}
