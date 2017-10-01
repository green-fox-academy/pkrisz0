public class BlogPost {
    public static void main(String[] args) {

        PostForBlog one = new PostForBlog();
        one.authorName = "John Doe";
        one.title = "Lorem Ipsum";
        one.text = "Lorem ipsum dolor sit amet.";
        one.publicationDate = "2000.05.04";

        PostForBlog two = new PostForBlog();
        one.authorName = "Tim Urban";
        one.title = "Wait but why";
        one.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        one.publicationDate = "2010.10.10.";

        PostForBlog three = new PostForBlog();
        one.authorName = "Tim Urban";
        one.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        one.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
        one.publicationDate = "2017.03.28.";
    }
}
