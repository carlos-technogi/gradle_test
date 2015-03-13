/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.amedet.api.repositories;

import java.util.List;

import com.amedet.api.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;


@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends JpaRepository<Person, Long> {
    @RestResource(exported = false)
    List<Person> findByLastName(@Param("name") String name);


    @Override
    @RestResource(exported = false)
    void delete(Long id);

    @Override
    @RestResource(exported = false)
    void delete(Person entity);

    @Override
    @RestResource(exported = false)
    Person save(Person person);

    @Override
    @RestResource(exported = false)
    long count();

    @Override
    @RestResource(exported = false)
    Person findOne(Long aLong);


}