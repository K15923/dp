package com.laok.dp.behavioral.chainiofresp;

/**
 * @author k 2022/8/28 9:41
 */
public class ChainMain {
    public static void main(String[] args) {
        Support a = new NoSupport("A");
        Support b = new LimitSupport("B", 3);
        Support c = new SpecialSupport("C", 45);
        Support d = new LimitSupport("D", 6);
        Support e = new OddSupport("E");
        Support f = new LimitSupport("F", 543);

        a.setNext(b).setNext(c).setNext(d).setNext(e).setNext(f);
        for (int i = 0; i < 500; i++) {
            a.support(new Trouble(i));
        }

    }
}
