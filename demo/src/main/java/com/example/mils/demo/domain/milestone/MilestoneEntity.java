package com.example.mils.demo.domain.milestone;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class MilestoneEntity {
    //フィールドの定義
    private long id;
    private String milestone;
    private String description;
    //コンストラクタ
    //ID(long型)とmilestone(String型)とdescription(String型)を受け取り、フィールドに代入
    public MilestoneEntity(long id, String milestone, String description){
        this.id = id;
        this.milestone = milestone;
        this.description = description;
    }
    //ゲッターとセッター
    //getID()を受け取るとidを返し、setID(id[long型])を受け取るとフィールドに代入
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    //getMilestone()を受け取ると milestoneを返し、setMilestone(milestone[String型])を受け取るとフィールドに代入
    public String getMilestone(){
        return milestone;
    }
    public void setMilestone(String milestone){
        this.milestone = milestone;
    }
    //getDescription()を受け取るとdescriptionを返し、setDescription(description[String型])を受け取るとフィールドに代入
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
}