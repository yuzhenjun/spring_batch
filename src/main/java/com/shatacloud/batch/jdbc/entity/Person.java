/**
 * @title Person.java
 * @package com.shatacloud.batch.jdbc.entity
 * @projectName gs-batch-processing
 * @author zhenjun.yu
 * @date 2015年4月22日 下午1:16:52
 */
package com.shatacloud.batch.jdbc.entity;

/**
 * @author zhenjun.yu
 */
public class Person {
	private long id;
	private String name;
	private String password;

	public Person() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", password=" + password
				+ "]";
	}

	
}
