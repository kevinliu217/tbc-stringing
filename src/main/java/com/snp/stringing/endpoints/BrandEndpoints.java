package com.snp.stringing.endpoints;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.snp.stringing.domain.Brand;

@RestController
public class BrandEndpoints {

	@RequestMapping(value = "/brands", method = RequestMethod.GET)
	public List<Brand> getBrands() {
		return Arrays.asList(Brand.values());
	}

}
