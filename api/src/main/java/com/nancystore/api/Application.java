package com.nancystore.api;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.conversions.Bson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;

import org.bson.Document;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
