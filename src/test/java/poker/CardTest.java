package poker;

import org.junit.Assert;
import org.junit.Test;
import parking.Car;

import java.util.Arrays;
import java.util.List;

public class CardTest {

    @Test
    public void should_return_WIN2_when_give_two_cards(){

        Poker poker = new Poker();
        Assert.assertEquals("WIN2",poker.compare(Arrays.asList(new Card("3S")),Arrays.asList(new Card("4D"))));
    }

    @Test
    public void should_return_DRAW_when_give_two_cards(){

        Poker poker = new Poker();
        Assert.assertEquals("DRAW",poker.compare(Arrays.asList(new Card("4S")),Arrays.asList(new Card("4D"))));
    }

    @Test
    public void should_return_WIN2_when_give_two_cardList(){

        Poker poker = new Poker();
        List<Card> cards1 = Arrays.asList(new Card("8S"),new Card("3D"),new Card("2H"),new Card("7S"),new Card("9H"));
        List<Card> cards2 = Arrays.asList(new Card("3H"),new Card("JH"),new Card("TS"),new Card("4D"),new Card("2S"));
        Assert.assertEquals("WIN2",poker.compare(cards1,cards2));
    }

    @Test
    public void should_return_DRAW_when_give_two_cardList(){

        Poker poker = new Poker();
        List<Card> cards1 = Arrays.asList(new Card("8S"),new Card("3D"),new Card("2H"),new Card("7S"),new Card("9H"));
        List<Card> cards2 = Arrays.asList(new Card("8H"),new Card("3H"),new Card("2S"),new Card("7D"),new Card("9S"));
        Assert.assertEquals("DRAW",poker.compare(cards1,cards2));
    }
    @Test
    public void should_return_WIN2_when_cardList2_have_pair(){

        Poker poker = new Poker();
        List<Card> cards1 = Arrays.asList(new Card("8S"),new Card("3D"),new Card("2H"),new Card("7S"),new Card("9H"));
        List<Card> cards2 = Arrays.asList(new Card("8H"),new Card("3H"),new Card("2S"),new Card("9D"),new Card("9S"));
        Assert.assertEquals("WIN2",poker.compare(cards1,cards2));
    }


}
