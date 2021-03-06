package com.sunfield.microframe.common.response;

public class RelationshipResponseBean<T> {

    private String status;

    private String msg;

    private T data;

    private RelationshipResponseStatus relationshipResponseStatus;

    public RelationshipResponseStatus getRelationshipResponseStatus() {
        return relationshipResponseStatus;
    }

    public void setRelationshipResponseStatus(RelationshipResponseStatus relationshipResponseStatus) {
        this.relationshipResponseStatus = relationshipResponseStatus;
    }

    public RelationshipResponseBean(){
        this.status = RelationshipResponseStatus.getStatus(RelationshipResponseStatus.SUCCESS);
        this.msg = RelationshipResponseStatus.getMsg(RelationshipResponseStatus.SUCCESS);
    }

    public RelationshipResponseBean(RelationshipResponseStatus status){
        this.relationshipResponseStatus = status;
        this.status = RelationshipResponseStatus.getStatus(status);
        this.msg = RelationshipResponseStatus.getMsg(status);
    }

    public RelationshipResponseBean(RelationshipResponseStatus status, T data) {
        this.relationshipResponseStatus = status;
        this.status = RelationshipResponseStatus.getStatus(status);
        this.msg = RelationshipResponseStatus.getMsg(status);
        this.data = data;
    }

    public RelationshipResponseBean(RelationshipResponseStatus status, String msg){
        this.relationshipResponseStatus = status;
        this.status = RelationshipResponseStatus.getStatus(status);
        this.msg = msg;
    }

    public RelationshipResponseBean(RelationshipResponseStatus status, String msg, T data) {
        this.relationshipResponseStatus = status;
        this.status = RelationshipResponseStatus.getStatus(status);
        this.msg = msg;
        this.data = data;
    }

    public Boolean hasError(){
        return "SUCCESS".equals(this.getStatus());
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
