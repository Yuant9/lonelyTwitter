package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Yuan on 2018-01-18.
 */
import java.util.Date;
public class firstmood1 extends CurrentMood {

    public firstmood1(Date tweetDate, String tweetBody) {
        super();
        this.tweetDate = tweetDate;
        this.tweetBody = tweetBody;
    }

    public String getTweetBody() {
        return "mood1";
    }




}
