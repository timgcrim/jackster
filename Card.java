public class Card{
    private String card;
    private String suit;
    private int magnitude;

    public Card(String card, String suit){
        this.card = card;
        this.suit = suit;
        this.magnitude = setMagnitude(card);
    }

    public int setMagnitude(String card){
        for (String each: new String[] {"2","3","4","5","6","7","8","9","10"}){
            if (each.equals(card)){return Integer.parseInt(card);}
        }
        if (card.equals("Jack")){return 11;}
        if (card.equals("Queen")){return 12;}
        if (card.equals("King")){return 13;}
        if (card.equals("Ace")){return 14;}
        return 0;
    }

    public String getCard(){
        return card;
    }
    public String getSuit(){
        return suit;
    }
    public int getMagnitude(){
        return magnitude;
    }
    public String toString(){
        return card + " of " + suit;
    }
}
