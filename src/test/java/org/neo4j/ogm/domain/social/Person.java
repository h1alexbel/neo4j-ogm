/*
 * Copyright (c) 2002-2015 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This product is licensed to you under the Apache License, Version 2.0 (the "License").
 * You may not use this product except in compliance with the License.
 *
 * This product may include a number of subcomponents with
 * separate copyright notices and license terms. Your use of the source
 * code for these subcomponents is subject to the terms and
 * conditions of the subcomponent's license, as noted in the LICENSE file.
 *
 */

package org.neo4j.ogm.domain.social;

import org.neo4j.ogm.annotation.Relationship;

import java.util.ArrayList;
import java.util.List;

/**
 * POJO used to test the direction of an outgoing relationship.
 *
 * @author Luanne Misquitta
 */
public class Person {

	private Long id;
	private String name;

	@Relationship(type = "LIKES", direction = "OUTGOING")
	private List<Person> peopleILike=new ArrayList<>();

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public List<Person> getPeopleILike() {
		return peopleILike;
	}

	public void setPeopleILike(List<Person> peopleILike) {
		this.peopleILike = peopleILike;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
