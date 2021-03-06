package model.entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import javax.jdo.annotations.*;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Pension {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;
	@Persistent
	private int amount;
	@Persistent
	private String name;
	@Persistent
	private Date date;

	public Pension(String name, int amount) {
		this.amount = amount;
		this.name = name;
		TimeZone.setDefault(TimeZone.getTimeZone("America/Lima"));
		this.date = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		if(!id.equals(""))
			this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(!name.equals(""))
			this.name = name;
	}

	public String getDate() {
		TimeZone.setDefault(TimeZone.getTimeZone("America/Lima"));
		SimpleDateFormat sdf = new SimpleDateFormat();
		return sdf.format(date);
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
