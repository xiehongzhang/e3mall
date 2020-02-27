/**
* Title: ItemService.java  

* Description   

* @author xhz  

* @date 2020年2月27日  
 
 */
package com.e3mall.service;

import com.e3mall.pojo.TbItem;

/**
 * @author xhz
 * @description 对商品的业务操作接口
 */
public interface ItemService {
	
	/**
	 * @name xhz
	 * @Description 通过id查询商品
	 * @param long
	 * @return TbItem
	 */
	TbItem getItemById(long itemId);
}
