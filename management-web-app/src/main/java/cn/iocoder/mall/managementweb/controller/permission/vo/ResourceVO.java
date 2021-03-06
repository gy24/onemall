package cn.iocoder.mall.managementweb.controller.permission.vo;

import cn.iocoder.common.framework.validator.InEnum;
import cn.iocoder.mall.systemservice.enums.permission.ResourceTypeEnum;
import lombok.*;
import io.swagger.annotations.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.*;

@ApiModel("资源 VO")
@Data
public class ResourceVO {

    @ApiModelProperty(value = "资源编号", required = true, example = "1")
    @NotNull(message = "资源编号不能为空")
    private Integer id;
    @ApiModelProperty(value = "菜单名", required = true, example = "商品管理")
    @NotEmpty(message = "菜单名不能为空")
    private String name;
    @ApiModelProperty(value = "权限标识", example = "resource:add")
    private String permission;
    @ApiModelProperty(value = "资源类型", required = true, example = "1")
    @NotNull(message = "资源类型不能为空")
    @InEnum(value = ResourceTypeEnum.class, message = "资源类型必须是 {value}")
    private Integer type;
    @ApiModelProperty(value = "排序", required = true, example = "1")
    @NotNull(message = "排序不能为空")
    private Integer sort;
    @ApiModelProperty(value = "父级资源编号", required = true, example = "1", notes = "如果无父资源，则值为 0")
    @NotNull(message = "父级资源编号不能为空")
    private Integer pid;
    @ApiModelProperty(value = "前端路由", example = "/resource/list")
    private String route;
    @ApiModelProperty(value = "菜单图标", example = "add")
    private String icon;
    @ApiModelProperty(value = "前端界面", example = "@/views/example/edit")
    private String view;
    @ApiModelProperty(value = "添加时间", required = true)
    private Date createTime;

}
