/**
 * @title CsvItemProcessor.java
 * @package com.shatacloud.batch.csv
 * @projectName gs-batch-processing
 * @author zhenjun.yu
 * @date 2015年4月22日 上午11:32:06
 */
package com.shatacloud.batch.csv;

import org.springframework.batch.item.ItemProcessor;

/**
 * @author zhenjun.yu

 */
public class CsvItemProcessor implements ItemProcessor<Person, Person> {

	@Override
	public Person process(Person person) throws Exception {
		 /* 合并ID和名字 */
		person.setId(person.getId() + "--" + person.getFirstName());
		person.setFirstName(person.getFirstName()+"======="+person.getLastName());
        person.setLastName(person.getLastName()+">>>>>>>>>");
        
        System.out.println(person);
        /* 将处理后的结果传递给writer */
        return person;
	}

}
