package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {
    @Test
    public void TestUsersFilterChemistGroupUsernames() {
        UsersManager user = new UsersManager();
        List<String> person = UsersManager.filterChemistGroupUsernames();


        assertEquals(2, person.size());
    }


        @Test
        public void filterChemistGroupUsernames() {
            UsersManager userAge = new UsersManager();
            List<Integer> age = UsersManager.filterAgeOfUsers();

            assertEquals(4, age.size());

        }
        @Test
    public void filterNonPostUser() {
        UsersManager userPost = new UsersManager();
        List<Integer> post = UsersManager.filterNonPostUser();

        assertEquals(2, post.size());
            System.out.println("Liczba uzytkownikow ktorzy nie dodali posta: "  + post.size());
        }


}