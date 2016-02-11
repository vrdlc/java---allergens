import org.junit.*;
import static org.junit.Assert.*;

public class AllergiesTest {

@Test
public void giveAllergens_returnsArrayOfAllergensWhenGivenAllergyScore_eggsAndPeanuts() {
  Allergies allergiesTest = new Allergies();
  assertEquals("[eggs, peanuts]", allergiesTest.giveAllergens (3));
}
  // @Test
  // public void

  //  giveChange_returnsCorrectChangeWhenGivenAValueOf99_3Quarters2Dimes0Nickels4Pennies() {
  //   CoinCombinations coinCombinationTest = new CoinCombinations();
  //   Integer change = 99;
  //   assertEquals(0, (int) coinCombinationTest.giveChange (99));
  // }

}
