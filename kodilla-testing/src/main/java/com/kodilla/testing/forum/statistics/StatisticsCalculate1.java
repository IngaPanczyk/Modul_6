package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class StatisticsCalculate1 {
    double userCountNumber;
    double postsCount;
    double commentsCount;
    double advPostsCountForUser;
    double advCommentsCountForUser;
    double advCommentsCountForPostsCount;

    public double getUserCountNumber() {
        return userCountNumber;
    }

    public double getPostsCount() {
        return postsCount;
    }

    public double getCommentsCount() {
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

    public void calculateAdvStatistics(Statistics statistics) {

        // Liczenie liczby userów;
        userCountNumber = statistics.usersNames().size();
        //Liczenie ilości postów
        postsCount = statistics.postsCount();
        //Liczenie ilości komentarzy
        commentsCount = statistics.commentsCount();
        //Liczenie średniej liczby komentarzy na użytkownika
        advCommentsCountForUser = commentsCount / userCountNumber;
        //Liczenie średniej liczby komentarzy na post
        advCommentsCountForPostsCount = commentsCount / postsCount;
        //Liczenie średniej liczby postów na użytkownika
        advPostsCountForUser = postsCount / userCountNumber;

        if (postsCount == 0) {
            advCommentsCountForPostsCount = 0;
        }
        if (userCountNumber == 0) {
            advCommentsCountForUser = 0;
            advPostsCountForUser = 0;
        }

    }
}
