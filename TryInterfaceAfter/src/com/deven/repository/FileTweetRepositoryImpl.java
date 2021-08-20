package com.deven.repository;

import java.util.HashMap;
import java.util.Map;

public class FileTweetRepositoryImpl implements TweetRepository {

	public FileTweetRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Map<String,String> findAll(){
	
		Map<String,String> tweets = new HashMap<>();
		tweets.put("dEVEN", "First Tweet");
		tweets.put("DEVEN", "Second Tweet");
		
		return tweets;
	}
}
