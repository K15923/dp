package com.dp.behavioral.chainiofresp;

/**
 * @author k 2022/8/28 9:21
 */
public abstract class Support {

    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            doneFail(trouble);
        }
    }

    protected void done(Trouble trouble) {
        System.out.println(trouble + "is resolved by" + this + ".");
    }

    protected void doneFail(Trouble trouble) {
        System.out.println(trouble + "cannot be resolved by" + this + ".");
    }


    abstract boolean resolve(Trouble trouble);

    @Override
    public String toString() {
        return "Support{" +
                "name='" + name + '\'' +
                '}';
    }
}
