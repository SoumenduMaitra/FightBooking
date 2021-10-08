package com.cg.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Schedule {
	@Id
	private Integer scheduleId;

}
