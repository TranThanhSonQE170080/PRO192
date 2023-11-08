package lo9;

import java.util.HashSet;
import java.util.Set;

public class EmailSet {
    private Set<String> emailSet;

    public EmailSet() {
        emailSet = new HashSet<>();
    }

    public boolean addEmail(String email) {
        if (emailSet.contains(email)) {
            System.out.println("Email already exists: " + email);
            return false;
        } else {
            emailSet.add(email);
            return true;
        }
    }

    public boolean containsEmail(String email) {
        return emailSet.contains(email);
    }

    public Set<String> getEmailSet() {
        return emailSet;
    }
}
