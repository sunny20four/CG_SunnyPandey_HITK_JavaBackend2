import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<String> emails = new ArrayList<>();

        emails.add("alice@mail.com");
        emails.add("bob@mail.com");
        emails.add("alice@mail.com");
        emails.add("carol@mail.com");
        emails.add("bob@mail.com");
        emails.add("dave@mail.com");


        System.out.println(emails);

        HashSet<String> uniqueEmails =
                new HashSet<>(emails);


        for(String email : uniqueEmails) {
            System.out.println(email);
        }

        System.out.println(uniqueEmails.size());
    }
}
