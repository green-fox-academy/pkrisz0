public class XO {
    public static void main(String[] args) {
        System.out.println(getXO("xxfet46465oooWCX"));
    }
    public static boolean getXO(String str){
        int countX = str.length() - str.replaceAll("[xX]", "").length();
        int countO = str.length() - str.replaceAll("[oO]", "").length();

        return countO == countX;
    }
}
