public class UrlFixer {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Solution #1

        String urlfixed = url.replace("https", "https:");
        String odds = urlfixed.replace("bots", "odds");

        System.out.println(odds);

        // Solution #2

        String http = "https:";
        String ends = "odds";
        String shorty = url.substring(5,38);

        System.out.println(http + shorty + ends);
    }
}

// Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
// Also, the URL is missing a crucial component, find out what it is and insert it too!
// Try to solve it more than once using different String functions!

