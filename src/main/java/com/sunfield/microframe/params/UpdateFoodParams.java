package com.sunfield.microframe.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="UpdateFoodParams", description="更新马粮数量入参")
public class UpdateFoodParams {

    public UpdateFoodParams(){}

    public UpdateFoodParams(String id,Integer num){
        this.id=id;
        this.num=num;
    }

    @ApiModelProperty(value="用户ID", dataType="String")
    private String id;

    @ApiModelProperty(value="马粮增量(单位：分，增加为正数，减少为负数)", dataType="Integer")
    private Integer num;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
