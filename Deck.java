import java.util.ArrayList; 

public class Deck{
    private ArrayList<Card> cards;
    private String name;

    public Deck(){
        cards = new ArrayList<Card>();
        for(String suit:new String[] {"Clubs","Diamonds","Hearts","Spades"}){
            for(String card:new String[] {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"}){
                cards.add(new Card(card,suit));
            }
        }
    }
    public Deck(String name){
        this.name = name;
    }
    public void addCard(Card newCard){
        cards.add(newCard);
    }
    public void playCard(Card card, Deck other){
        other.cards.add(card);
        this.cards.remove(card);
    }
    public void playAllCards(Deck other){
        for(Card each:other.cards){
            other.cards.add(each);
            this.cards.remove(each);
        }
    }
    public Card getFirstCard(){
        return cards.get(0);
    }
    public void shuffle(){
        for(int j = 0; j<1000;j++){
            int i = (int)(Math.random()*50);
            Card temp = cards.get(i);
            cards.remove(cards.get(i));
            cards.add((int)(Math.random()*50),temp);
        }
    }
    public void output(){
        for(Card each:cards){
            System.out.println(each);
        }
    }
}