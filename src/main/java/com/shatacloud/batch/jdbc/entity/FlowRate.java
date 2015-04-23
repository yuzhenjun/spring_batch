/**
 * @title FlowRate.java
 * @package com.shatacloud.batch.jdbc.entity
 * @projectName spring-batch
 * @author zhenjun.yu
 * @date 2015年4月22日 下午3:05:10
 */
package com.shatacloud.batch.jdbc.entity;

/**
 * @author zhenjun.yu
 */
public class FlowRate {
	private String record_time;
	private long flow_rate;
	private String sp_code;
	private String host_name;
	private long user_num;

	private String channel_idn;
	public String getRecord_time() {
		return record_time;
	}

	public void setRecord_time(String record_time) {
		this.record_time = record_time;
	}

	public long getFlow_rate() {
		return flow_rate;
	}

	public void setFlow_rate(long flow_rate) {
		this.flow_rate = flow_rate;
	}

	public String getSp_code() {
		return sp_code;
	}

	public void setSp_code(String sp_code) {
		this.sp_code = sp_code;
	}

	public String getHost_name() {
		return host_name;
	}

	public void setHost_name(String host_name) {
		this.host_name = host_name;
	}



	public long getUser_num() {
		return user_num;
	}

	public void setUser_num(long user_num) {
		this.user_num = user_num;
	}

	public String getChannel_idn() {
		return channel_idn;
	}

	public void setChannel_idn(String channel_idn) {
		this.channel_idn = channel_idn;
	}

	@Override
	public String toString() {
		return "FlowRate [record_time=" + record_time + ", flow_rate="
				+ flow_rate + ", sp_code=" + sp_code + ", host_name="
				+ host_name + ", user_num=" + user_num + ", channel_idn="
				+ channel_idn + "]";
	}


}
