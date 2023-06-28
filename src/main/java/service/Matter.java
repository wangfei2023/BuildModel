package service;
//todo:在模拟⼯工程中提供了了装修中所需要的物料料
import java.math.BigDecimal;

public interface Matter {
    String scene();// 场景;地板、地砖、涂料料、吊顶
    String brand();// 品牌
    String model();// 型号
    BigDecimal price();// 价格
    String desc();// 描述
}
