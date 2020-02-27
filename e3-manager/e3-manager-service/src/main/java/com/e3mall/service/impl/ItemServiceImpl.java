/**
* Title: ItemServiceImpl.java  

* Description   

* @author xhz  

* @date 2020年2月27日  
 
 */
package com.e3mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e3mall.dao.TbItemMapper;
import com.e3mall.pojo.TbItem;
import com.e3mall.service.ItemService;

/**
 * @author xhz
 * @description 商品业务接口的实现类
 */
@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private TbItemMapper tbItemMapper;

	/* (non-Javadoc)
	 * @see com.e3mall.service.ItemService#getItemById(long)
	 */
	@Override
	public TbItem getItemById(long itemId) {
		// TODO Auto-generated method stub
		TbItem iTbItem=tbItemMapper.selectByPrimaryKey(itemId);
		return iTbItem;
	}

}
