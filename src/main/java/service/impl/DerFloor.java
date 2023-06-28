package service.impl;

import service.Matter;

import java.math.BigDecimal;

public class DerFloor implements Matter {
public String scene() { return "地板";
}
public String brand() { return "德尔(Der)";
}
    public String model() {
        return "A+";
}
    public BigDecimal price() {
        return new BigDecimal(119);
}
public String desc() {
return "DER德尔集团是全球领先的专业⽊木地板制造商，北北京2008年年奥运会家装和公装 地板供应商"; }
}