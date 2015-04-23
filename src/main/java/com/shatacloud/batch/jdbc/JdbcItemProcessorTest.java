package com.shatacloud.batch.jdbc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class JdbcItemProcessorTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:batch.xml");
		JobLauncher launcher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("jdbcJob");
		try {
			/* 运行Job */
			Map<String,JobParameter> parameters=new HashMap<String, JobParameter>();
			parameters.put("id", new JobParameter((long) 50000));
			JobParameters jps=new JobParameters(parameters);
			JobExecution result = launcher.run(job,jps);
			/* 处理结束，控制台打印处理结果 */
			System.out.println(result.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
