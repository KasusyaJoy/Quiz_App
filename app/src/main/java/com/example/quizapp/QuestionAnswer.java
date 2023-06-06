package com.example.quizapp;

public class QuestionAnswer {

    public static String question[] ={
            "What does CPU stand for?",
            "What is the most commonly used file formart for images on the web?",
            "What Does HTML  stand for?",
            "What is the purpose of a DNS server?",
            "What does the acronym VPN stand for?"
    };

    public static String choices[][] ={
            {"Control processing unit","Central Processing Unit","Computer Processing unit","central power unit"},
            {"JPEG","GIF","PNG","MP3"},
            {"Home Tool Markup Language","High-level Text Management language","Hyper Text Markup Language","Human Task ManagementLanguage"},
            {"translates domain names into IP addresses","stores website content and images","filters spam emails","provides internet connectivity"},
            {"virtual private network","virus protection network","virtual public network","verified private network"}

    };

    public static String correctAnswers[] = {
            "Central processing unit",
            "JPEG",
            "Hyper Text Markup Language",
            "translates domain names into IP addresses",
            "virtual private network"

    };

}
