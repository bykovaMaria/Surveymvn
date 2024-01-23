package ru.netology.javaqa;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        FormDate date = new FormDate();
        date.day = 13;
        date.month = 6;
        date.year = 1999;


        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 444444";
        post.patronymic = "Иванович";
        post.phone = "+7 888 8888888";
        post.surname = "Иванов";
        post.birthday = date;
        post.subscription = true;

        System.out.println(post.subscription);

    }
}