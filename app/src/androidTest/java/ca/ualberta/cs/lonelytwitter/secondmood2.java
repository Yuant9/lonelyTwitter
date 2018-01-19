package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Yuan on 2018-01-18.
 */
import java.util.Date;
public class secondmood2 extends CurrentMood {
    public secondmood2(Date tweetDate, String tweetBody) {
        super();
        this.tweetDate = tweetDate;
        this.tweetBody = tweetBody;
    }

    public String getTweetBody() {
        return "mood2";
    }


}
