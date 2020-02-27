/**
* Title: ItemController.java  

* Description   

* @author xhz  

* @date 2020年2月27日  
 
 */
package com.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.e3mall.pojo.TbItem;
import com.e3mall.service.ItemService;

/**
 * @author xhz
 * @description 商品控制类 
 */
@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;

	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem getTbItem(@PathVariable long itemId){
		TbItem tbItem=itemService.getItemById(itemId);
		return tbItem;
	}
}
