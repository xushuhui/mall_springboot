package cn.phpst.mall.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SpuSimplifyVO {
    private Integer id;
    private String title;
    private String subtitle;
    private String img;
    private String forThemeImg;
    private String price;
    private String discountPrice;
    private String description;
    private String tags;
    private String sketchSpecId;
}