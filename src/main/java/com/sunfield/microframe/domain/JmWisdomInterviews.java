package com.sunfield.microframe.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sunfield.microframe.domain.base.BaseDomain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * jm_wisdom_interviews bean
 * @author sunfield coder
 */
@ApiModel(value="JmWisdomInterviews", description="")
public class JmWisdomInterviews extends BaseDomain{

	@ApiModelProperty(value="标题", dataType="String")
	private String title;
	
	@ApiModelProperty(value="访谈介绍", dataType="String")
	private String content;
	
	@ApiModelProperty(value="封面地址", dataType="String")
	private String coverUrl;
	
	@ApiModelProperty(value="推荐排序，从1开始，空代表不推荐", dataType="Integer")
	private Integer selectOrder;
	
	@ApiModelProperty(value="视频板块推荐排序，从1开始，空代表不推荐", dataType="Integer")
	private Integer videoSelectOrder;
	
	@ApiModelProperty(value="收藏人数,缓存", dataType="Integer")
	private Integer favorites = 0;

	@ApiModelProperty(value="收藏标识", dataType="Integer")
	private Integer favoriteTag = 0;

	@ApiModelProperty(value="访问用户ID,关联用户信息表ID", dataType="String")
	private String visitUserId;

	@ApiModelProperty(value="访问者对该访谈的收藏状态", dataType="Integer")
	private Integer visitUserYesOrNo = 0;

	@JsonFormat(locale="zh",pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")//用于接收json中特定形式格式化的日期字符串
	private Date dateStart;
	@JsonFormat(locale="zh",pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date dateEnd;

	public Integer getFavoriteTag() {
		return favoriteTag;
	}

	public void setFavoriteTag(Integer favoriteTag) {
		this.favoriteTag = favoriteTag;
	}

	public Date getDateStart() {
		return dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public Date getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	public String getVisitUserId() {
		return visitUserId;
	}

	public void setVisitUserId(String visitUserId) {
		this.visitUserId = visitUserId;
	}

	public Integer getVisitUserYesOrNo() {
		return visitUserYesOrNo;
	}

	public void setVisitUserYesOrNo(Integer visitUserYesOrNo) {
		this.visitUserYesOrNo = visitUserYesOrNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public String getCoverUrl() {
		return coverUrl;
	}

	public void setCoverUrl(String coverUrl) {
		this.coverUrl = coverUrl;
	}
	
	public Integer getSelectOrder() {
		return selectOrder;
	}

	public void setSelectOrder(Integer selectOrder) {
		this.selectOrder = selectOrder;
	}
	
	public Integer getVideoSelectOrder() {
		return videoSelectOrder;
	}

	public void setVideoSelectOrder(Integer videoSelectOrder) {
		this.videoSelectOrder = videoSelectOrder;
	}
	
	public Integer getFavorites() {
		return favorites;
	}

	public void setFavorites(Integer favorites) {
		this.favorites = favorites;
	}
	
}