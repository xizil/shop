package com.mission.shop.product.dao.model;

import java.io.Serializable;
import java.util.Date;

public class Cart implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cart.id
	 * @mbggenerated  Fri Oct 24 19:57:10 CST 2014
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cart.user_id
	 * @mbggenerated  Fri Oct 24 19:57:10 CST 2014
	 */
	private Long userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cart.goods_id
	 * @mbggenerated  Fri Oct 24 19:57:10 CST 2014
	 */
	private Long goodsId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cart.buy_num
	 * @mbggenerated  Fri Oct 24 19:57:10 CST 2014
	 */
	private Integer buyNum;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cart.create_time
	 * @mbggenerated  Fri Oct 24 19:57:10 CST 2014
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table cart
	 * @mbggenerated  Fri Oct 24 19:57:10 CST 2014
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cart.id
	 * @return  the value of cart.id
	 * @mbggenerated  Fri Oct 24 19:57:10 CST 2014
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cart.id
	 * @param id  the value for cart.id
	 * @mbggenerated  Fri Oct 24 19:57:10 CST 2014
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cart.user_id
	 * @return  the value of cart.user_id
	 * @mbggenerated  Fri Oct 24 19:57:10 CST 2014
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cart.user_id
	 * @param userId  the value for cart.user_id
	 * @mbggenerated  Fri Oct 24 19:57:10 CST 2014
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cart.goods_id
	 * @return  the value of cart.goods_id
	 * @mbggenerated  Fri Oct 24 19:57:10 CST 2014
	 */
	public Long getGoodsId() {
		return goodsId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cart.goods_id
	 * @param goodsId  the value for cart.goods_id
	 * @mbggenerated  Fri Oct 24 19:57:10 CST 2014
	 */
	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cart.buy_num
	 * @return  the value of cart.buy_num
	 * @mbggenerated  Fri Oct 24 19:57:10 CST 2014
	 */
	public Integer getBuyNum() {
		return buyNum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cart.buy_num
	 * @param buyNum  the value for cart.buy_num
	 * @mbggenerated  Fri Oct 24 19:57:10 CST 2014
	 */
	public void setBuyNum(Integer buyNum) {
		this.buyNum = buyNum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cart.create_time
	 * @return  the value of cart.create_time
	 * @mbggenerated  Fri Oct 24 19:57:10 CST 2014
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cart.create_time
	 * @param createTime  the value for cart.create_time
	 * @mbggenerated  Fri Oct 24 19:57:10 CST 2014
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cart
     *
     * @mbggenerated Thu Jul 17 19:37:59 CST 2014
     */

    
}