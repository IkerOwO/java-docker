//import java.util.Collections;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import models.Person;

public class App {
    public static void main(String[] args) {
        Map<Integer, Person> person = new HashMap<>();
        person.put(1, new Person("Pepe", "Castor", 23, LocalDate.of(2003, 10, 2)));
        person.put(2, new Person("Lucia", "Rodriguez", 35, LocalDate.of(1991, 2, 19)));        
        person.put(3, new Person("Juan", "Perez", 45, LocalDate.of(1981, 3, 4)));
        person.forEach((key, value) -> System.out.println(value));
    }
}
