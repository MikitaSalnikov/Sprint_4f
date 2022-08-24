import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {
    private final String name;
    private final boolean expected;

    public AccountTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] dataForTest() {
        return new Object[][]{
                {"Volodya Kotlyarov", true},
                {" VolodyaKotlyarov", false},
                {"VolodyaKotlyarov ", false},
                {"Volodya Kot lyarov", false},
                {"VK", false},
                {"V K", true},
                {"Volodya Kotlyarovic", true},
                {"Volodya Kotlyarovich", false},
                {null, false},
        };
    }

    @Test
    public void checkName(){
        Account account = new Account(name);
        assertEquals(expected, account.checkNameToEmboss());
    }
}
