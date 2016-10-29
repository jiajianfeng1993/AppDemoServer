package cn.com.hd.app.domain.chat.friend.model;

import java.util.Date;

import cn.com.hd.app.domain.base.model.query.BaseQuery;

public class FriendModel extends BaseQuery{
    private Integer id;

    private Integer accountId;

    private Integer friendId;

    private Integer isLeader;

    private String friendMemo;

    private Date createTime;

    private Integer showOrder;

    private Integer state;
    
    

    
    /**
	 * @return the state
	 */
	public Integer getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(Integer state) {
		this.state = state;
	}

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

	public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getFriendId() {
        return friendId;
    }

    public void setFriendId(Integer friendId) {
        this.friendId = friendId;
    }

    public Integer getIsLeader() {
        return isLeader;
    }

    public void setIsLeader(Integer isLeader) {
        this.isLeader = isLeader;
    }

    public String getFriendMemo() {
        return friendMemo;
    }

    public void setFriendMemo(String friendMemo) {
        this.friendMemo = friendMemo == null ? null : friendMemo.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getShowOrder() {
        return showOrder;
    }

    public void setShowOrder(Integer showOrder) {
        this.showOrder = showOrder;
    }
}