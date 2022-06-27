package com.kodilla.stream;

import com.sun.management.GarbageCollectionNotificationInfo;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
        List<Integer> ageOfUsers = filterAgeOfUsers();
        List<Integer> numberOfPost = filterNonPostUser();

    }

    public static List<Integer> filterAgeOfUsers() {
        List<Integer> userAge = UsersRepository.getUserList()
                .stream()
                .filter(age -> age.getAge() > 40)
                .map(UsersManager::getUserAge)
                .collect(Collectors.toList());

        return userAge;
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }

    public static List<Integer> filterNonPostUser() {
        List<Integer> userpost = UsersRepository.getUserList()
                .stream()
                .filter(post -> post.getNumberOfPost() == 0)
                .map(UsersManager::getUserPost)
                .collect(Collectors.toList());

        return userpost;


    }


    public static String getUserName(User user) {     //metoda zwracająca nazwe uzytkownika
        return user.getUsername();
    }

    public static Integer getUserAge(User user) {   //metoda zwracajaca wiek uzytkownika
        return user.getAge();
    }

    public static Integer getUserPost(User user) { //metoda zwracająca liczbe postów
        return user.getNumberOfPost();
    }

}


