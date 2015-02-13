package com.boaglio.hb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

@Configuration
public class SpringMongoConfig extends AbstractMongoConfiguration {

	private static final String MONGOLAB_URI = "MONGOLAB_URI";
	private static final String LOCAL_MONGODB = "hb";
	private String mongodbURI;
	private boolean heroku;

	public SpringMongoConfig() {

		mongodbURI = System.getenv(MONGOLAB_URI);

		if (mongodbURI != null) {
			heroku = true;
		} else {
			mongodbURI = "mongodb://127.0.0.1/" + LOCAL_MONGODB;
		}

	}

	@Override
	public String getDatabaseName() {

		if (heroku) {
			String db = mongodbURI.substring(mongodbURI.indexOf("heroku_app",11));
			System.out.println(" MongoLab db name = " + db);
			return db;
		} else {
			return LOCAL_MONGODB;
		}
	}

	@Override
	@Bean
	public Mongo mongo() throws Exception {

		MongoClientURI uri = new MongoClientURI(mongodbURI);
		MongoClient mongoClient = new MongoClient(uri);
		return mongoClient;
	}

}
