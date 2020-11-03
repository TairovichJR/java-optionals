import javax.swing.text.html.Option;
import java.util.Optional;

public class Person {

    private final String name;
    private final String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    //so we can work with nullable
    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}
