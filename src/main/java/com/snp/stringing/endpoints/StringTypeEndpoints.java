package com.snp.stringing.endpoints;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.snp.stringing.domain.StringType;

@RestController
public class StringTypeEndpoints {

	@RequestMapping(value = "/stringtypes", method = RequestMethod.GET)
	public List<StringType> getStringTypes() {
		return Arrays.asList(StringType.values());
	}

}
