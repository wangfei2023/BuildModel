package service.impl;

import service.Matter;

import java.math.BigDecimal;

public class LevelOneCeiling implements Matter {
    public String scene() {
        return "吊顶";
    }

    public String brand() {
        return "装修公司⾃自带";
    }

    public String model() {
        return "⼀一级顶";
    }

    public BigDecimal price() {
        return new BigDecimal(260);    }

    public String desc() {
        return null;
    }
}
