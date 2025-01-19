package com.example.biblotheque.gestion_bibliotheque.config;

import com.example.biblotheque.gestion_bibliotheque.*;


public class MongoDBUtil {
    private static MongoClient mongoClient;
    private static MongoDatabase database;

    static {
        try {
            mongoClient = MongoClients.create("mongodb://localhost:27017");
            database = mongoClient.getDatabase("library_db");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static MongoDatabase getDatabase() {
        return database;
    }
}
