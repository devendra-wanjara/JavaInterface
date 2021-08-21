package com.deven.repository;

import java.util.HashMap;
import java.util.Map;

public class File1TweetRepositoryImpl implements TweetRepository {

	public File1TweetRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Map<String,String> findAll(){
	
		Map<String,String> tweets = new HashMap<>();
		tweets.put("JHON", "First Tweet");
		tweets.put("JHON1", "Second Tweet");
		
		return tweets;
	}
}
