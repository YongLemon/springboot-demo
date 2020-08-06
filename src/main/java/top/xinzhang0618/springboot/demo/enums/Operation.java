package top.xinzhang0618.springboot.demo.enums;

import java.util.HashMap;
import java.util.Map;

public enum Operation {

    PLUS {
        @Override
        double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS {
        @Override
        double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES {
        @Override
        double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE {
        @Override
        double apply(double x, double y) {
            return x / y;
        }
    };

    abstract double apply(double x, double y);
}
