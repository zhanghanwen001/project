package com.mine.restful.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import java.io.Serializable;

import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* 系统用户
* @TableName sys_users
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUser implements Serializable {

    private Integer id;
    /**
    * 用户名
    */
    @NotBlank(message="[用户名]不能为空")
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("用户名")
    private String username;
    /**
    * 密码
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("密码")
    private String password;
    /**
    * 盐  密码加密时前缀，使加密后的值不同
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("盐  密码加密时前缀，使加密后的值不同")
    private String salt;
    /**
    * 邮箱
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("邮箱")
    private String email;
    /**
    * 手机号
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("手机号")
    private String mobile;
    /**
    * 状态  0：禁用   1：正常  默认值 ：1
    */
    @ApiModelProperty("状态  0：禁用   1：正常  默认值 ：1")
    private Integer valid;
    /**
    * 
    */
    @ApiModelProperty("")
    private Integer deptId;
    /**
    * 创建时间
    */
    @ApiModelProperty("创建时间")
    private Date createdTime;
    /**
    * 修改时间
    */
    @ApiModelProperty("修改时间")
    private String modifiedTime;
    /**
    * 创建用户
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("创建用户")
    private String creater;
    /**
    * 修改用户
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("修改用户")
    private String modifiedUser;



}
