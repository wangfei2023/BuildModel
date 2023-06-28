package controller;

import service.Matter;
import service.impl.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DecorationPackageController {
    public String getMatterList(BigDecimal area, Integer level) {

        List<Matter> list = new ArrayList<Matter>(); // 装修清单
        BigDecimal price = BigDecimal.ZERO; // 装修价格
        if (1 == level) {
            LevelTwoCeiling levelTwoCeiling = new LevelTwoCeiling(); // 吊
            DuluxCoat duluxCoat = new DuluxCoat();  // 涂
            ShengXiangFloor shengXiangFloor = new ShengXiangFloor(); // 地
            list.add(levelTwoCeiling);
            list.add(duluxCoat);
            list.add(shengXiangFloor);
            price = price.add(area.multiply(new BigDecimal("0.2")).multiply(levelTwoCeiling.price()));
            price = price.add(area.multiply(new BigDecimal("1.4")).multiply(duluxCoat.price()));
            price = price.add(area.multiply(shengXiangFloor.price()));
        }
        if (2 == level) {
            LiBangCoat liBangCoat = new LiBangCoat();
            MarcoPoloTile marcoPoloTile = new MarcoPoloTile();
            LevelTwoCeiling levelTwoCeiling = new LevelTwoCeiling(); // 吊
            list.add(levelTwoCeiling);
            list.add(liBangCoat);
            list.add(marcoPoloTile);
            price = price.add(area.multiply(new BigDecimal("0.2")).multiply(levelTwoCeiling.price()));
            price = price.add(area.multiply(new
                    BigDecimal("1.4")).multiply(liBangCoat.price()));
            price = price.add(area.multiply(marcoPoloTile.price()));
        }
// 现代简约
        if (3 == level) {
            LevelOneCeiling levelOneCeiling = new LevelOneCeiling();  // 吊顶，⼆二级顶
            LiBangCoat liBangCoat = new LiBangCoat();                 // 涂料料，⽴立邦
            DongPengTile dongPengTile = new DongPengTile();           // 地砖，东鹏
            list.add(levelOneCeiling);
            list.add(liBangCoat);
            list.add(dongPengTile);
            price = price.add(area.multiply(new
                    BigDecimal("0.2")).multiply(levelOneCeiling.price()));
            price = price.add(area.multiply(new
                    BigDecimal("1.4")).multiply(liBangCoat.price()));
            price = price.add(area.multiply(dongPengTile.price()));
        }
        StringBuilder detail = new StringBuilder("\r\n-------------------- -----------------------------------\r\n" +
                " 元\r\n" +
                        "装修清单" + "\r\n" +
                        "套餐等级:" + level + "\r\n" +
                        "套餐价格:" + price.setScale(2, BigDecimal.ROUND_HALF_UP) +
                        "房屋⾯面积:" + area.doubleValue() + " 平⽶米\r\n" + "材料料清单:\r\n");
        for (Matter matter: list) {
            detail.append(matter.scene()).append(":").append(matter.brand()).append( "、").append(matter.model()).append("、平⽶米价 格:").append(matter.price()).append(" 元。\n");
        }
        return detail.toString();
    }
}
