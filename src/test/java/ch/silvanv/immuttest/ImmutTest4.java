package ch.silvanv.immuttest;

import org.junit.Test;

final class ImmutClass4 {
    private final String arg1;
    private final String arg2;

    private ImmutClass4(Builder builder) {
        this.arg1 = builder.arg1;
        this.arg2 = builder.arg2;
    }

    public static class Builder {
        private String arg1; public Builder arg1(String v) { this.arg1 = v; return this; }
        private String arg2; public Builder arg2(String v) { this.arg2 = v; return this; }
        
        public ImmutClass4 build() {
            return new ImmutClass4(this);
        }
    }

    @Override
    public String toString() {
        return arg1 + " " + arg2;
    }
}

public class ImmutTest4 {
    @Test
    public void create() {
        ImmutClass4 inst = new ImmutClass4.Builder()
            .arg1("arg1")
            .arg2("arg2")
            .build();

        System.out.println(inst);
    }
}