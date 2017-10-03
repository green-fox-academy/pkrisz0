public class Rainfall {

    static String data =
            "Rome:Jan 81.2,Feb 63.2,Mar 70.3,Apr 55.7,May 53.0,Jun 36.4,Jul 17.5,Aug 27.5,Sep 60.9,Oct 117.7,Nov 111.0,Dec 97.9" +
                    "\n";

    public static void mean(String town, String strng){

        String[] relevant = data.split("town", data.indexOf('\n'));

    }

    public static void variance(String town, String strng){



    }

    public static void main(String[] args) {

        String data =
                "Rome:Jan 81.2,Feb 63.2,Mar 70.3,Apr 55.7,May 53.0,Jun 36.4,Jul 17.5,Aug 27.5,Sep 60.9,Oct 117.7,Nov 111.0,Dec 97.9" +
                        "\n" + "Moscow :Jan 81.2,Feb 63.2,Mar 70.3,Apr 55.7,May";

        String[] relevant = data.split("town", data.indexOf("\\n"));

    }

}
