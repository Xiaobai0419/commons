package com.sunfield.microframe.domain;

import com.sunfield.microframe.domain.base.BaseDomain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * jm_relationship_friendlife bean
 * @author sunfield coder
 */
@ApiModel(value="JmRelationshipFriendlife", description="")
public class JmRelationshipFriendlife extends BaseDomain{

	@ApiModelProperty(value="发布者用户id，关联用户表id", dataType="String")
	private String userId;

	@ApiModelProperty(value="发布者昵称，冗余存储", dataType="String")
	private String nickName;

	@ApiModelProperty(value="发布者头像url，冗余存储", dataType="String")
	private String headPicUrl;

	@ApiModelProperty(value="发布者手机号（账号），冗余存储", dataType="String")
	private String mobile;
	
	@ApiModelProperty(value="能源圈内容", dataType="String")
	private String content;
	
	@ApiModelProperty(value="图片OSS地址，多个逗号分隔，最多支持9张", dataType="String")
	private String picUrls;
	
	@ApiModelProperty(value="点赞数", dataType="Integer")
	private Integer ayes = 0;

	@ApiModelProperty(value="点赞标识", dataType="Integer")
	private Integer ayesTag = 0;

	@ApiModelProperty(value="评论数", dataType="Integer")
	private Integer comments = 0;

	@ApiModelProperty(value="评论标识", dataType="Integer")
	private Integer commentTag = 0;

	@ApiModelProperty(value="登录用户id", dataType="String")
	private String visitedUserId;

	@ApiModelProperty(value="登录用户对该朋友圈点赞状态 0 无赞 1 赞", dataType="String")
	private Integer visitedUserYesOrNo = 0;

	public Integer getAyesTag() {
		return ayesTag;
	}

	public void setAyesTag(Integer ayesTag) {
		this.ayesTag = ayesTag;
	}

	public Integer getCommentTag() {
		return commentTag;
	}

	public void setCommentTag(Integer commentTag) {
		this.commentTag = commentTag;
	}

	public Integer getVisitedUserYesOrNo() {
		return visitedUserYesOrNo;
	}

	public void setVisitedUserYesOrNo(Integer visitedUserYesOrNo) {
		this.visitedUserYesOrNo = visitedUserYesOrNo;
	}

	public String getVisitedUserId() {
		return visitedUserId;
	}

	public void setVisitedUserId(String visitedUserId) {
		this.visitedUserId = visitedUserId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getHeadPicUrl() {
		return headPicUrl;
	}

	public void setHeadPicUrl(String headPicUrl) {
		this.headPicUrl = headPicUrl;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getComments() {
		return comments;
	}

	public void setComments(Integer comments) {
		this.comments = comments;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public String getPicUrls() {
		return picUrls;
	}

	public void setPicUrls(String picUrls) {
		this.picUrls = picUrls;
	}
	
	public Integer getAyes() {
		return ayes;
	}

	public void setAyes(Integer ayes) {
		this.ayes = ayes;
	}
	
}