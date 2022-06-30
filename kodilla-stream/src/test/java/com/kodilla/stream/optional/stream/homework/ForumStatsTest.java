package com.kodilla.stream.optional.stream.homework;


import com.kodilla.optional.stream.User;
import com.kodilla.optional.stream.UsersRepository;
import com.kodilla.optional.stream.homework.ForumStats;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {


    @Test
    public void sholudCountAvargeOfPostsUsersOlderThan40() {
        ForumStats forum = new ForumStats();
            double avg = ForumStats.averagePostsMoreThan40();
        assertEquals(2.20, avg, 0.5);


    }

    @Test
    public void sholudCountAvargeOfPostsUsersYoungerThan40() {
        ForumStats forum = new ForumStats();
        double avg = ForumStats.averagePostsLessThan40();
        assertEquals(2383, avg, 5);

    }
}





