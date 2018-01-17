package codewars;

public class FileNameExtractor {
    public static void main(String[] args) {
        System.out.println(extractFileName("1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION"));
    }

    public static String extractFileName(String dirtyFileName) {

        return dirtyFileName.substring(dirtyFileName.indexOf('_') + 1, dirtyFileName.lastIndexOf('.'));
    }
}
