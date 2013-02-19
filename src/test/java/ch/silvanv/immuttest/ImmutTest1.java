package ch.silvanv.immuttest;

import org.junit.Test;

final class ImmutClass1 {
    private final String arg1;
    private final String arg2;

    private ImmutClass1(Builder builder) {
        this.arg1 = builder.arg1;
        this.arg2 = builder.arg2;
    }

    public static class Builder {
        private String arg1;
        private String arg2;

        public ImmutClass1 build() {
            return new ImmutClass1(this);
        }

        public Builder arg1(String arg1) {
            this.arg1 = arg1;
            return this;
        }

        public Builder arg2(String arg2) {
            this.arg2 = arg2;
            return this;
        }
    }

    @Override
    public String toString() {
        return arg1 + " " + arg2;
    }
}

public class ImmutTest1 {
    @Test
    public void create() {
        ImmutClass1 inst = new ImmutClass1.Builder()
            .arg1("arg1")
            .arg2("arg2")
            .build();
        
        System.out.println(inst);
    }
}