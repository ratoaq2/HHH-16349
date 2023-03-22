package org.hibernate.bugs;

public class MyPojo {
	Integer amount;
	RelatedEntity relatedEntity;

	public MyPojo(Integer amount, RelatedEntity relatedEntity) {
		this.amount = amount;
		this.relatedEntity = relatedEntity;
	}

}
