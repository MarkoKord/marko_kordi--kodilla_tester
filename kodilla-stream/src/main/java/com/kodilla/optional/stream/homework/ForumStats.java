package com.kodilla.optional.stream.homework;

import com.kodilla.optional.stream.UsersRepository;

import java.util.List;
import java.util.stream.Collectors;


public class ForumStats {
    public static void main(String[] args) {
        System.out.println(averagePostsMoreThan40());
        System.out.println(averagePostsLessThan40());
    }

    public static double averagePostsMoreThan40() {
        double avg = UsersRepository.getUserList()
                .stream()
                .filter(n -> n.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return avg;
    }


    public static double averagePostsLessThan40() {
        double young = UsersRepository.getUserList()
                .stream()
                .filter(n -> n.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();

        return young;
    }
}

