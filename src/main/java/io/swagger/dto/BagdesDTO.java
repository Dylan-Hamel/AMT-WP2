package io.swagger.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel(description = "A badge in an application.")
public class BagdesDTO {
    private String name;

    public BagdesDTO() {
    }

    public BagdesDTO(String name) {
        this.name = name;
    }

    @ApiModelProperty(value = "The name of the badge.", required = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}