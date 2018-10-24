package spring.aoplimitation.limitation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParamHandlerChildrenTest {

    @Autowired
    ParamHandlerChildren classUnderTest;

    @Test
    public void failure_aspect_cause_override_aspect() {
        String result = classUnderTest.handle("some");
        assertSame("some", result);
    }

}