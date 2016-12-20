import junit.framework.TestCase;

public class TestHello extends TestCase {
  public void testTrue() {
    assertTrue(true);
  }
  public void testFalse() {
    String str = (new MessageGenerator()).getWelcomeMessage();
    assertFalse(false);
  }
  public void testMessage() {
     String str = (new MessageGenerator()).getWelcomeMessage();
     assertEquals("welcome", str);
  }

}

