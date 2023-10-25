import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.example.testspringpmc.service.impl.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class principalTest {

    @InjectMocks
    private MyprogImpl myprog;

    @BeforeEach
    public void init ()
    {
        myprog=new MyprogImpl();

    }

    @Test
    @DisplayName("nombre divisible par 3")
    void testtrois() {


        String expected="9 vert";
        String result=myprog.divisibleby(9);
        assertEquals(expected,result, "The add method should add two numbers");
    }

    @Test
    @DisplayName("nombre divisible par 5")
    void testcinq() {


        String expected="10 bleu";
        String result=myprog.divisibleby(10);
        assertEquals(expected,result, "The add method should add two numbers");
    }

    @Test
    @DisplayName("nombre divisible par 3 et 5")
    void testtroisetcinq() {


        String expected="30 jaune";
        String result=myprog.divisibleby(30);
        assertEquals(expected,result, "The add method should add two numbers");
    }
}
