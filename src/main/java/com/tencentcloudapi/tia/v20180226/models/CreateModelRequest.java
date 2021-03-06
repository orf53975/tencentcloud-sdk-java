/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tia.v20180226.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateModelRequest  extends AbstractModel{

    /**
    * 模型名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 要部署模型的路径名
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 关于模型的描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 指定集群的名称（集群模式下必填）
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
    * 运行环境镜像的标签
    */
    @SerializedName("RuntimeVersion")
    @Expose
    private String RuntimeVersion;

    /**
    * 要部署的模型副本数目（集群模式下选填）
    */
    @SerializedName("Replicas")
    @Expose
    private Integer Replicas;

    /**
    * 暴露外网或内网，默认暴露外网（集群模式下选填）
    */
    @SerializedName("Expose")
    @Expose
    private String Expose;

    /**
    * 部署模式（无服务器函数模式/集群模式）
    */
    @SerializedName("ServType")
    @Expose
    private String ServType;

    /**
    * 部署模型的其他配置信息
    */
    @SerializedName("RuntimeConf")
    @Expose
    private String [] RuntimeConf;

    /**
     * 获取模型名称
     * @return Name 模型名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置模型名称
     * @param Name 模型名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取要部署模型的路径名
     * @return Model 要部署模型的路径名
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * 设置要部署模型的路径名
     * @param Model 要部署模型的路径名
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * 获取关于模型的描述
     * @return Description 关于模型的描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置关于模型的描述
     * @param Description 关于模型的描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取指定集群的名称（集群模式下必填）
     * @return Cluster 指定集群的名称（集群模式下必填）
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * 设置指定集群的名称（集群模式下必填）
     * @param Cluster 指定集群的名称（集群模式下必填）
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * 获取运行环境镜像的标签
     * @return RuntimeVersion 运行环境镜像的标签
     */
    public String getRuntimeVersion() {
        return this.RuntimeVersion;
    }

    /**
     * 设置运行环境镜像的标签
     * @param RuntimeVersion 运行环境镜像的标签
     */
    public void setRuntimeVersion(String RuntimeVersion) {
        this.RuntimeVersion = RuntimeVersion;
    }

    /**
     * 获取要部署的模型副本数目（集群模式下选填）
     * @return Replicas 要部署的模型副本数目（集群模式下选填）
     */
    public Integer getReplicas() {
        return this.Replicas;
    }

    /**
     * 设置要部署的模型副本数目（集群模式下选填）
     * @param Replicas 要部署的模型副本数目（集群模式下选填）
     */
    public void setReplicas(Integer Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * 获取暴露外网或内网，默认暴露外网（集群模式下选填）
     * @return Expose 暴露外网或内网，默认暴露外网（集群模式下选填）
     */
    public String getExpose() {
        return this.Expose;
    }

    /**
     * 设置暴露外网或内网，默认暴露外网（集群模式下选填）
     * @param Expose 暴露外网或内网，默认暴露外网（集群模式下选填）
     */
    public void setExpose(String Expose) {
        this.Expose = Expose;
    }

    /**
     * 获取部署模式（无服务器函数模式/集群模式）
     * @return ServType 部署模式（无服务器函数模式/集群模式）
     */
    public String getServType() {
        return this.ServType;
    }

    /**
     * 设置部署模式（无服务器函数模式/集群模式）
     * @param ServType 部署模式（无服务器函数模式/集群模式）
     */
    public void setServType(String ServType) {
        this.ServType = ServType;
    }

    /**
     * 获取部署模型的其他配置信息
     * @return RuntimeConf 部署模型的其他配置信息
     */
    public String [] getRuntimeConf() {
        return this.RuntimeConf;
    }

    /**
     * 设置部署模型的其他配置信息
     * @param RuntimeConf 部署模型的其他配置信息
     */
    public void setRuntimeConf(String [] RuntimeConf) {
        this.RuntimeConf = RuntimeConf;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Cluster", this.Cluster);
        this.setParamSimple(map, prefix + "RuntimeVersion", this.RuntimeVersion);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);
        this.setParamSimple(map, prefix + "Expose", this.Expose);
        this.setParamSimple(map, prefix + "ServType", this.ServType);
        this.setParamArraySimple(map, prefix + "RuntimeConf.", this.RuntimeConf);

    }
}

