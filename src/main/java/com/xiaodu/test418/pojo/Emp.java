package com.xiaodu.test418.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author xiaodu
 * @since 2022-04-18
 */
@Getter
@Setter
@TableName("emp")
@ApiModel(value = "Emp对象", description = "")
public class Emp implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("`name`")
    private String name;

    @TableField("age")
    private Integer age;

    @TableField("did")
    private Integer did;


}
