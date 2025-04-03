package com.lgy.item_jdbc_oracle.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.lgy.item_jdbc_oracle.dao.ItemDAO;
import com.lgy.item_jdbc_oracle.dto.ItemDTO;


public class ItemContentService implements ItemService {

	@Override
	public void execute(Model model) {
		System.out.println("service1");
		ItemDAO dao = new ItemDAO();
		System.out.println("service2");
		ArrayList<ItemDTO> dtos = dao.contentView();
		System.out.println("service3");
		model.addAttribute("contentView", dtos);
		System.out.println("service4");
	}

}
