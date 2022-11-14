// CSCI 211
// Robert McCurdy
// Student ID 10715877
// Program 4
// In keeping with the UM Honor Code, I have neither given nor received assistance from anyone other
// than the instructor.

import org.junit.jupiter.api.Test;

import java.util.Base64;

import static org.junit.jupiter.api.Assertions.*;


class CryptocurrencyTest_Students {
    @Test
    public void testCoin2() {
        DoubleNode<Coin> evaluator = new DoubleNode<>();
        Coin c = new Coin(15.5, "olemiss2022");
        evaluator = new DoubleNode(c);
        c.hashValue(evaluator);
        byte [] b = Base64.getEncoder().encode((evaluator.toString()+".olemiss2022").getBytes());

        assertEquals(new String(b), evaluator.getElement().getPrivateKey());
    }


    @Test
    public void testCoin4() {
        Coin evaluator = new Coin(15.5, "olemiss2022");
        assertEquals(null, evaluator.getPrivateKey());
    }


    @Test
    public void testCoin6() {
        assertThrows(InvalidCryptocurrencyException.class, () -> {
            Coin c = new Coin(-15.5, "olemiss2022");
        });
    }

    @Test
    public void testCryptocurrency2() {
        Cryptocurrency evaluator = new Cryptocurrency();
        evaluator.buy(new Coin(15.5, "olemiss2022"));
        DoubleNode<Coin> first = evaluator.getBitcoins().getFront();
        String privateKey = first.getElement().getPrivateKey();
        assertEquals(first.getElement().getPublicKey(), privateKey.substring(privateKey.length()-5));
    }
    @Test
    public void testCryptocurrency4() {
        Cryptocurrency evaluator = new Cryptocurrency();
        evaluator.buy(new Coin(15.5, "olemiss2022"));
        evaluator.buy(new Coin(2.3, "rebels2022"));
        DoubleNode<Coin> last = evaluator.getBitcoins().getRear();
        String privateKey = last.getElement().getPrivateKey();
        assertEquals(last.getElement().getPublicKey(), privateKey.substring(privateKey.length()-5));
    }

    @Test
    public void testCryptocurrency6() {
        Cryptocurrency evaluator = new Cryptocurrency();
        evaluator.buy(new Coin(15.5, "olemiss2022"));
        evaluator.buy(new Coin(2.3, "rebels2022"));

        assertEquals("olemiss2022\nrebels2022\n", evaluator.toString());
    }

    @Test
    public void testCryptocurrency8() {
        assertThrows(EmptyCollectionException.class, () -> {
            Cryptocurrency evaluator = new Cryptocurrency();
            evaluator.buy(new Coin(15.5, "olemiss2022"));

            DoubleNode<Coin> first = evaluator.getBitcoins().getFront();
            String privateKey = first.getElement().getPrivateKey();
            evaluator.sell(privateKey);

            System.out.println(evaluator.toString());
        });
    }

    @Test
    public void testCryptocurrency10() {
        Cryptocurrency evaluator = new Cryptocurrency();
        evaluator.buy(new Coin(15.5, "olemiss2022"));
        evaluator.buy(new Coin(2.3, "rebels2022"));
        evaluator.buy(new Coin(77.73, "landsharks"));

        DoubleNode<Coin> second = evaluator.getBitcoins().getFront().getNext();
        String privateKey = second.getElement().getPrivateKey();
        evaluator.sell(privateKey);

        assertEquals("olemiss2022\nlandsharks\n", evaluator.toString());
    }

    @Test
    public void testCryptocurrency14() {
        Cryptocurrency evaluator = new Cryptocurrency();
        evaluator.buy(new Coin(15.5, "olemiss2022"));
        evaluator.buy(new Coin(2.3, "rebels2022"));
        evaluator.buy(new Coin(77.73, "landsharks"));

        DoubleNode<Coin> sellCoin = evaluator.getBitcoins().getFront();
        String privateKey = sellCoin.getElement().getPrivateKey();
        evaluator.sell(privateKey);

        evaluator.buy(new Coin(2.3, "SEC"));
        evaluator.buy(new Coin(2.3, "Mississippi"));

        sellCoin = evaluator.getBitcoins().getFront().getNext();
        privateKey = sellCoin.getElement().getPrivateKey();
        evaluator.sell(privateKey);

        assertEquals("rebels2022\nSEC\nMississippi\n", evaluator.toString());
    }

    @Test
    public void testCryptocurrency15() {
        Cryptocurrency evaluator = new Cryptocurrency();
        evaluator.buy(new Coin(15.5, "olemiss2022"));
        evaluator.buy(new Coin(2.3, "rebels2022"));
        evaluator.buy(new Coin(77.73, "landsharks"));

        String privateKey = "Help me I'm stuck";
        assertFalse(evaluator.sell(privateKey));

    }
    @Test
    public void testCryptocurrency16() {
        assertThrows(InvalidCryptocurrencyException.class, () -> {
            Cryptocurrency evaluator = new Cryptocurrency();
            evaluator.buy(new Coin(-15.5, "olemiss2022"));
        });
    }
}