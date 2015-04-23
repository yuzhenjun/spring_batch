/**
 * @title WriteTasklet.java
 * @package com.shatacloud.batch.helloworld
 * @projectName gs-batch-processing
 * @author zhenjun.yu
 * @date 2015年4月22日 上午10:53:12
 */
package com.shatacloud.batch.helloworld;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * @author zhenjun.yu

 */
public class WriteTasklet implements Tasklet{

	 private String message;

	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		  	System.out.println(message);
	        return RepeatStatus.FINISHED;
	}

}
