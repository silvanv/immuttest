package ch.silvanv.immuttest;

import org.junit.Test;

final class ImmutClass2 {
    private final String arg1;
    private final String arg2;

    private ImmutClass2(Builder builder) {
        this.arg1 = builder.arg1;
        this.arg2 = builder.arg2;
    }

    public static class Builder {
        protected String arg1;
        protected String arg2;
        
        public ImmutClass2 build() {
            return new ImmutClass2(this);
        }
    }

    @Override
    public String toString() {
        return arg1 + " " + arg2;
    }
}

public class ImmutTest2 {
    @Test
    public void create() {
        ImmutClass2 inst = new ImmutClass2.Builder() {{
                arg1 = "arg1";
                arg2 = "arg2";
             }}.build();
             
        System.out.println(inst);
    }
}