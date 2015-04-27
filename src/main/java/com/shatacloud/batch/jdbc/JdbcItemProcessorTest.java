package com.shatacloud.batch.jdbc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.core.launch.support.CommandLineJobRunner;




public class JdbcItemProcessorTest {
	public static void main(String[] args) throws Exception {
		List<String> list=new ArrayList<String>();
		for(String arg:args){
			list.add(arg);
		}
		CommandLineJobRunner.main(args);
	}

}
