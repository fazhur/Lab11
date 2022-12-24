package mailjet;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Client {
    private static long count = 0;
    @Getter
    private final long id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private int age;
    @Getter @Setter
    private Sex sex;

    public Client(){
        id = ++count;
    }
}