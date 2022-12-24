package builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;

@Builder @ToString @Getter
public class User {
    private String name;
    private int age;
    private String email;

    public static void main(String[] args) {
        User user = User.builder().name("Fedir").age(18).build();
//        System.out.println(user);
    }
}
