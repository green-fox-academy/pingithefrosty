public class Main {
  public static void main(String[] args) {
  BlogPost blogPost1 = new BlogPost();
  blogPost1.setAuthorName("John Doe");
  blogPost1.setTitle("Lorem Ipsum");
  blogPost1.setText("Lorem ipsum dolor sit amet.");
  blogPost1.setPublicationDate("2000.05.04.");

  BlogPost blogPost2 = new BlogPost();
  blogPost1.setAuthorName("Tim Urban");
  blogPost1.setTitle("Wait but why");
  blogPost1.setText("A popular long-form, stick-figure-illustrated blog about almost everything.");
  blogPost1.setPublicationDate("2010.10.10.");

  BlogPost blogPost3 = new BlogPost();
  blogPost1.setAuthorName("William Turton");
  blogPost1.setTitle("One Engineer Is Trying to Get IBM to Reckon With Trump");
  blogPost1.setText("Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. " +
      "When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really " +
      "into the whole organizer profile thing.");
  blogPost1.setPublicationDate("2017.03.28.");

  }
}
