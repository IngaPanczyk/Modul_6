package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class StatisticsCalculate(Statistics statistics){

    int void calculateAdvStatistics(Statistics statistics){//Jaki typ powinien być tej metody?

        List<String> usersNames = new ArrayList<String>();
        //Liczenie ilości urzytkowników
        int userCountNumber = usersNames.size();

        //Liczenie ilości postów
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        int postsCount = statisticsCalculate.postsCount();

        //Liczenie ilości komentarzy
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        int commentsCount = statisticsCalculate.commentsCount();

        //Liczenie średniej liczby postów na użytkownika
        double advPostsCountForUser = postsCount/userCountNumber;

        //Liczenie średniej liczby komentarzy na użytkownika
        double advCommentsCountForUser = commentsCount/userCountNumber;

        //Liczenie średniej liczby komentarzy na post
        double advCommentsCountForPostsCount = commentsCount/postsCount;
/*
    }
    int showStatistics(){
        return ????

    }*/
}
    /*
    Metody:
liczbę użytkowników,
liczbę postów,
liczbę komentarzy,
średnią liczbę postów na użytkownika,
średnią liczbę komentarzy na użytkownika,
średnią liczbę komentarzy na pos
     */
