package com.suits.finder.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.suits.finder.service.SuitsFinderService;
import com.suits.finder.util.SuitsFinderUtil;

@RestController
public class SuitsFinderController {
	@Autowired
	SuitsFinderService suitsFinderService;
	
	@Autowired
	SuitsFinderUtil util;

}
