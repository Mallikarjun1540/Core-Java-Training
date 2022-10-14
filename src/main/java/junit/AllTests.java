package junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AddTestCase.class, DivTestCases.class, MulTestCase.class, SubTestCase.class })
public class AllTests {

}
