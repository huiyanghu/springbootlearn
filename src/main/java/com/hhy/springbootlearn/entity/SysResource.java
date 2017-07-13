package com.hhy.springbootlearn.entity;

/**
 * Created by hhy on 17/7/12.
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "s_resource")
public class SysResource {
    @Id
    @GeneratedValue
    @Column(name = "id", length = 20)
    private Long id;

    @Column(name = "resource_url")
    private String resourceUrl;//url

    @Column(name = "remark")
    private String remark;//备注

    @Column(name = "resource_name")
    private String resourceName;//资源名称

    @Column(name = "method_name")
    private String methodName;//资源所对应的方法名

    @Column(name = "method_path")
    private String methodPath;//资源所对应的包路径

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getMethodPath() {
        return methodPath;
    }

    public void setMethodPath(String methodPath) {
        this.methodPath = methodPath;
    }
}
