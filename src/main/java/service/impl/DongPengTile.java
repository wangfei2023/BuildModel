package service.impl;

import service.Matter;

import java.math.BigDecimal;

public class DongPengTile implements Matter {
public String scene() { return "地砖";
}
public String brand() { return "东鹏瓷砖";
}
    public String model() {
        return "10001";
}
    public BigDecimal price() {
        return new BigDecimal(102);
}
public String desc() {
return "东鹏瓷砖以品质铸就品牌，科技推动品牌，⼝口碑碑传播品牌为宗旨，2014年年品牌价值132.35亿元，位列列建陶⾏行行业榜⾸首。"; }
}