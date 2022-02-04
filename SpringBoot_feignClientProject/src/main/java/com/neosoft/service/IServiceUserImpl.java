package com.neosoft.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.neosoft.dto.Root;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class IServiceUserImpl implements IServiceUser {

	@Override
	public List<Root> serviceCall(List<Root> r) {
		log.info("...............>>"+r);
		return r.stream().filter(e -> e.getName().equals("Leanne Graham")).collect(Collectors.toList());
		
	}

}
