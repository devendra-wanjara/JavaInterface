package com.deven.service;

import com.deven.repository.File1TweetRepositoryImpl;
import com.deven.repository.FileTweetRepositoryImpl;
import com.deven.repository.TweetRepository;

public class TweetServiceImpl {

	public TweetServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	private TweetRepository repository = new FileTweetRepositoryImpl();
	private File1TweetRepositoryImpl repository1 = new File1TweetRepositoryImpl();
	
	public TweetRepository getrepository() {
		return repository;
	}

	public File1TweetRepositoryImpl getrepository1() {
		return repository1;
	}

}
