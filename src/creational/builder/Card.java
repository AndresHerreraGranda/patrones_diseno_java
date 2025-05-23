package src.creational.builder;

public class Card {
    private final String cardType;
    private final String number;
    private final String name;
    private final int expire;
    private final boolean credit;

    @Override
    public String toString() {
        return "Card{" +
                "cardType='" + cardType + '\'' +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", expire=" + expire +
                ", credit=" + credit +
                '}';
    }

    public Card(CardBuilder builder) {
        this.cardType = builder.cardType;
        this.number = builder.number;
        this.name = builder.name;
        this.expire = builder.expire;
        this.credit = builder.credit;
    }

    public static class CardBuilder{
        private String cardType;
        private String number;
        private String name;
        private int expire;
        private boolean credit;

        public CardBuilder(String cardType, String number){
            this.cardType = cardType;
            this.number = number;
        }

        public CardBuilder name(String name){
            this.name = name;
            return this;
        }

        public CardBuilder expire(int expire){
            this.expire = expire;
            return this;
        }

        public CardBuilder credit(boolean credit){
            this.credit = credit;
            return this;
        }

        public Card build(){
            return new Card(this);
        }

    }


}
