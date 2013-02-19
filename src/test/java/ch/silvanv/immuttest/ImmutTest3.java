package ch.silvanv.immuttest;

import org.junit.Test;

final class ImmutClass3 {
    private final String arg1;
    private final String arg2;

    public static ImmutClass3 create() {
        return new ImmutClass3(null, null);
    }

    private ImmutClass3(String arg1, String arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    public ImmutClass3 arg1(String arg1) {
        return new ImmutClass3(arg1, arg2);
    }

    public ImmutClass3 arg2(String arg2) {
        return new ImmutClass3(arg1, arg2);
    }

    @Override
    public String toString() {
        return arg1 + " " + arg2;
    }
}

public class ImmutTest3 {
    @Test
    public void create() {
        final ImmutClass3 inst = ImmutClass3.create()
            .arg1("arg1")
            .arg2("arg2");
        
        System.out.println(inst);
    }
}