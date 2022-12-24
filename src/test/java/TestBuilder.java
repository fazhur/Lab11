import builder.User;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBuilder {
    @Test
    public void testBuilder() {
        User user = User.builder().name("Fedir").age(18).build();
        assertEquals("Fedir", user.getName());
        assertEquals(18, user.getAge());
    }
}
