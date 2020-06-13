package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class StatisticsCalculate1 {
    int userCountNumber;
    int postsCount;
    int commentsCount;
    double advPostsCountForUser;
    double advCommentsCountForUser;
    double advCommentsCountForPostsCount;

    public int getUserCountNumber() {
        return userCountNumber;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAdvPostsCountForUser() {
        return advPostsCountForUser;
    }

    public double getAdvCommentsCountForUser() {
        return advCommentsCountForUser;
    }

    public double getAdvCommentsCountForPostsCount() {
        return advCommentsCountForPostsCount;
    }

    public Statistics calculateAdvStatistics(Statistics statistics) {

        List<String> usersNames = new ArrayList<String>();
        //Liczenie iości urzytkowników
        int userCountNumber = usersNames.size();
        //Liczenie ilości postów
        int postsCount = statistics.postsCount();
        //Liczenie ilości komentarzy
        int commentsCount = statistics.commentsCount();
        //Liczenie średniej liczby postów na użytkownika
        double advPostsCountForUser = postsCount / userCountNumber;
        //Liczenie średniej liczby komentarzy na użytkownika
        double advCommentsCountForUser = commentsCount / userCountNumber;
        //Liczenie średniej liczby komentarzy na post
        double advCommentsCountForPostsCount = commentsCount / postsCount;

        return statistics;

    }
}
