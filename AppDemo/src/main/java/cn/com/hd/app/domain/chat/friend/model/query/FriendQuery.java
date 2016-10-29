package cn.com.hd.app.domain.chat.friend.model.query;

import cn.com.hd.app.domain.chat.friend.model.FriendModel;

public class FriendQuery extends FriendModel{
	int startRow;
	int pageSize=10;
	int pageNo;
	/**
	 * @return the startRow
	 */
	public int getStartRow() {
		return startRow;
	}
	/**
	 * @param startRow the startRow to set
	 */
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}
	/**
	 * @return the pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}
	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	/**
	 * @return the pageNo
	 */
	public int getPageNo() {
		return pageNo;
	}
	/**
	 * @param pageNo the pageNo to set
	 */
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
		startRow=pageNo-1<0?0:(pageNo-1)*pageSize;
	}
	
	
}
