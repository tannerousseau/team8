package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class testDeck
{
  @Test
  public void testDeck()
  {
    Deck deck = new Deck();
    assertNotNull(deck);
    assertEquals(52, deck.size());
    for(int i = 0; i < 52; i++){
      assertNotNull(deck.cards.get(i));
    }
    /*******************************/
    for(int i = 0; i < 4; i++){
      for(int j = 2; j < 15; i++){
        assertEquals(j, deck.cards.get(i).value); //right?
      }
    }
    /******************************/
  }
  @testing
  public void testShuffle(){
    Deck deck = new Deck();
    Deck deckB = new Deck();

    deck.shuffle();
    for (int i = 0; i < 52; i++){
      assertFalse(deck.cards.get(i), deck.cards.get(i)); //see that cards changed position, dont know if this will work though
    }
  }
}
