package org.hibernate.bugs;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "MY_TABLE")
public class MyEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Integer id;

	@Column(name = "amount")
	private Integer amount;

	@JoinColumn(name = "REL_ENTITY", foreignKey = @ForeignKey(name = "FK_REL_ENT_01"))
	@ManyToOne
	@Fetch(FetchMode.SELECT)
	private RelatedEntity relatedEntity;
}