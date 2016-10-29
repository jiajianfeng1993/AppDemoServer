package cn.com.hd.app.domain.chat.chatrecorder.model;

import java.util.Date;

import cn.com.hd.app.domain.base.model.query.BaseQuery;
import cn.com.hd.app.domain.chat.chatrecorder.model.query.ChatRecorderQuery;

public class ChatRecorderModel extends BaseQuery{
    private Integer id;

    private Integer sendAccountId;

    private Integer receiveAccountId;

    private Integer contentType;

    private String content;

    private Date createTime;

    private Integer state;

    private Integer showOrder;

    
    /**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSendAccountId() {
        return sendAccountId;
    }

    public void setSendAccountId(Integer sendAccountId) {
        this.sendAccountId = sendAccountId;
    }

    public Integer getReceiveAccountId() {
        return receiveAccountId;
    }

    public void setReceiveAccountId(Integer receiveAccountId) {
        this.receiveAccountId = receiveAccountId;
    }

    public Integer getContentType() {
        return contentType;
    }

    public void setContentType(Integer contentType) {
        this.contentType = contentType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getShowOrder() {
        return showOrder;
    }

    public void setShowOrder(Integer showOrder) {
        this.showOrder = showOrder;
    }
}