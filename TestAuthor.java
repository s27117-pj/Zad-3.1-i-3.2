public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Boleslaw", "Prus", 55);

        System.out.println("Name: " + author.getName());
        System.out.println("Surname: " + author.getSurname());
        System.out.println("Age: " + author.getAge());

        System.out.println(author.toString());

        author.setSurname("Prus");
        System.out.println("Surname after modification: " + author.getSurname());
    }
}