package pack.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountMatches {

    public static Long CountFromString(String text, String regex){

        Long count;

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        count = matcher.results().count();

        return count;
    }

}
