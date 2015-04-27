package com.shatacloud.batch.jdbc;

import org.springframework.batch.item.ItemProcessor;

import com.shatacloud.batch.jdbc.entity.FlowRate;

public class JdbcItemProcessor implements ItemProcessor<FlowRate, FlowRate> {
    private long count=0;
	@Override
	public FlowRate process(FlowRate item) throws Exception {
		System.out.println("process people desc"+count++);
	/*	if(count==10001){
			 throw new Exception("invalid data");
		}*/
		return item;
	}

}
