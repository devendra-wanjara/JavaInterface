import com.deven.service.TweetServiceImpl;

public class Application {

	public Application() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TweetServiceImpl tweetServiceImpl = new TweetServiceImpl();
		TweetServiceImpl tweetServiceImpl1 = new TweetServiceImpl();
		
	System.out.println(tweetServiceImpl.getrepository().findAll());
	System.out.println(tweetServiceImpl.getrepository1().findAll());
	}

}
