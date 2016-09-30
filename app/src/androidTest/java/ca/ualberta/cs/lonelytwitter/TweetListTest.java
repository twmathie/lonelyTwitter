package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;


/**
 * Created by tymathieu on 2016-09-29.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest(){
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Adding tweet");
        try {
            tweets.add(tweet);
            tweets.add(tweet);
        }
        catch (IllegalArgumentException e) {

        }

        assertTrue(tweets.hasTweet(tweet));
    }
    public void testHasTweet(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("Test");
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));
    }

    public void testDelete(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        list.delete(tweet);
        assertFalse(list.hasTweet(tweet));
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        TweetList orderedTweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        Tweet tweet1 = new NormalTweet("test1");
        tweets.add(tweet);
        tweets.add(tweet1);
    }

    public void testGetCount(){
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("test1");
        tweets.add(tweet1);
        Tweet tweet2 = new NormalTweet("test2");
        tweets.add(tweet2);
        Tweet tweet3 = new NormalTweet("test3");
        tweets.add(tweet3);
        int myCount = tweets.getCount();
        assertEquals(3, myCount);

    }

}
