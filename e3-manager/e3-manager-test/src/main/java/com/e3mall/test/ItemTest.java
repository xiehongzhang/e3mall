/**
* Title: ItemTest.java  

* Description   

* @author xhz  

* @date 2020年2月27日  
 
 */
package com.e3mall.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.e3mall.pojo.TbItem;
import com.e3mall.service.ItemService;

/**
 * @author xhz
 * @description 测试商场业务接口的实现类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="{applicationContext-service.xml,applicationContext-dao.xml,applicationContext-transaction.xml}")
public class ItemTest {
	@Autowired
	private ItemService itemService;
	@Test
	public void testGetItemById(){
		long itemId=536563L;
		TbItem tbItem=itemService.getItemById(itemId);
		System.out.println(tbItem);
	}
	
}
