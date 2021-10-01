package com.twitter.app;

import com.twitter.app.config.TweetKeywordsConfig;
import com.twitter.app.twitter.runner.StreamRunner;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

/**
 * @author david
 */
@Slf4j
@SpringBootApplication
public class TwitterApplication implements CommandLineRunner {

	@Autowired
	private StreamRunner streamRunner;

	@Autowired
	private TweetKeywordsConfig tweetKeywordsConfig;

	public static void main(String[] args) {
		SpringApplication.run(TwitterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		streamRunner.start();
	}

}
