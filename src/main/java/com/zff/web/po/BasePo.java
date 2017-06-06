package com.zff.web.po;

import java.util.Date;

/**
 * 
 * @ClassName:  BasePo   
 * @Description:����PO
 * @author: Android_Robot  
 * @date:   2017��6��6�� ����8:12:21   
 *
 */
public class BasePo {
	
	/** ������*/
	private Long createBy;
	
	/** ����ʱ��*/
	private Date createDate;
	
	/** �޸���*/
	private Long updateBy;
	
	/** �޸�ʱ��*/
	private Date updateDate;
	
	/** �汾*/
	private Integer optCounter;
	
	/** ɾ�����*/
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
