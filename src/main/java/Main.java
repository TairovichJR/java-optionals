import java.util.Optional;

public class Main {
    public static void main(String[] args) {

//        Optional<Object> empty = Optional.empty();
//        System.out.println(empty.isPresent());
//        System.out.println(empty.isEmpty());

//        Optional<String> hello = Optional.of("Hello");
//        System.out.println(hello.isPresent());
//        System.out.println(hello.isEmpty());
//        String orElse = hello.orElse("world");
//        System.out.println(orElse);

//        Optional<String> nullable = Optional.ofNullable(null);
//        System.out.println(nullable.isPresent());
//        System.out.println(nullable.isEmpty());
//        String orElse = nullable.orElse("world");
//        System.out.println(orElse);

//        Optional<String> nullable = Optional.ofNullable("hello");
//        System.out.println(nullable.isPresent());
//        System.out.println(nullable.isEmpty());
//        String orElse = nullable
//                .map(String::toUpperCase)
//                .orElseGet(()->{
//                    // extra logic to retrieve the value
//                    return "world";
//                });
//
//        System.out.println(orElse);

//        Optional<String> nullable = Optional.ofNullable("hello");
//        System.out.println(nullable.isPresent());
//        System.out.println(nullable.isEmpty());
//        String orElse = nullable
//                .map(String::toUpperCase)
//                .orElseThrow(IllegalStateException::new);
//
//        System.out.println(orElse);

//        Optional<String> nullable = Optional.ofNullable("hello");
//        System.out.println(nullable.isPresent());
//        System.out.println(nullable.isEmpty());
//        nullable
//                .ifPresent(word -> {
//                    System.out.println(word);
//                });
//
//        nullable
//                .ifPresentOrElse(word -> {
//                    System.out.println(word);
//                }, () -> System.out.println("world"));

//        Person person = new Person("James", "james@gmail.com");
//        System.out.println(person.getEmail().toLowerCase());

        //if the email value of null then, we would get null pointer exception
        //to fix, we can let the client know that email value may be empty
//        Person person = new Person("James", "dfadsfa");
//        String email = person
//                             .getEmail()
//                             .map(String::toLowerCase)
//                             .orElse("Email not provided");
//        System.out.println(email);

        Person person = new Person("James", "KKL@yahoo.com");
      if (person.getEmail().isPresent()){
          String email = person.getEmail().get();
          System.out.println(email.toLowerCase());
      }else
          System.out.println("email not provided");

    }
}
