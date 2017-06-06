package com.zff.web.po;

import java.util.Date;

/**
 * 
 * @ClassName:  BasePo   
 * @Description:公共PO
 * @author: Android_Robot  
 * @date:   2017年6月6日 下午8:12:21   
 *
 */
public class BasePo {
	
	/** 创建人*/
	private Long createBy;
	
	/** 创建时间*/
	private Date createDate;
	
	/** 修改人*/
	private Long updateBy;
	
	/** 修改时间*/
	private Date updateDate;
	
	/** 版本*/
	private Integer optCounter;
	
	/** 删除标记*/
	private Boolean markForDelete;

	public Long getCreateBy() {
		return createBy;
	}

	public void setCreateBy(Long createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Long getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(Long updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Integer getOptCounter() {
		return optCounter;
	}

	public void setOptCounter(Integer optCounter) {
		this.optCounter = optCounter;
	}

	public Boolean getMarkForDelete() {
		return markForDelete;
	}

	public void setMarkForDelete(Boolean markForDelete) {
		this.markForDelete = markForDelete;
	}
	
}
