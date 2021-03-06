package com.sunfield.microframe.domain;

import com.sunfield.microframe.domain.base.BaseDomain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * jm_relationship_group bean
 * @author sunfield coder
 */
@ApiModel(value="JmRelationshipGroup", description="")
public class JmRelationshipGroup extends BaseDomain{

	@ApiModelProperty(value="名称", dataType="String")
	private String name;
	
	@ApiModelProperty(value="头像地址", dataType="String")
	private String iconUrl;
	
	@ApiModelProperty(value="创建者用户id，关联用户表id", dataType="String")
	private String creatorId;

	@ApiModelProperty(value="操作用户id，关联用户表id", dataType="String")
	private String operatorId;
	
	@ApiModelProperty(value="行业分类ID,关联行业分类表ID", dataType="String")
	private String industryId;

	@ApiModelProperty(value="行业分类名称,关联行业分类表name字段，冗余存储，提升查询效率", dataType="String")
	private String industryName;
	
	@ApiModelProperty(value="成员人数", dataType="Integer")
	private Integer members = 0;
	
	@ApiModelProperty(value="部落介绍", dataType="String")
	private String content;

	@ApiModelProperty(value="成员列表", dataType="List<JmAppUser>")
	private List<JmAppUser> memberList;//用于创建部落时添加成员，和部落创建者（一般从自身好友列表中）添加成员的操作，传递json数组，如果这里使用Set去重，要重写JmAppUser的equals和hashCode方法

	@ApiModelProperty(value="访问用户与部落的关系：0 默认无关联 1 群主 2 成员 3 申请中 4 已拒绝", dataType="Integer")
	private Integer userGroupRelation = 0;

	private JmAppUser creator;

	public Integer getUserGroupRelation() {
		return userGroupRelation;
	}

	public void setUserGroupRelation(Integer userGroupRelation) {
		this.userGroupRelation = userGroupRelation;
	}

	public JmAppUser getCreator() {
		return creator;
	}

	public void setCreator(JmAppUser creator) {
		this.creator = creator;
	}

	public String getIndustryName() {
		return industryName;
	}

	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public List<JmAppUser> getMemberList() {
		return memberList;
	}

	public void setMemberList(List<JmAppUser> memberList) {
		this.memberList = memberList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	
	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}
	
	public String getIndustryId() {
		return industryId;
	}

	public void setIndustryId(String industryId) {
		this.industryId = industryId;
	}
	
	public Integer getMembers() {
		return members;
	}

	public void setMembers(Integer members) {
		this.members = members;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}