/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.amedet.api.repositories;

import com.amedet.api.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * com.amedet.api.repositories
 * developed on Technogi Mexico
 * by carlos_technogi
 * on 3/10/15
 */
public interface UserRepository extends JpaRepository<User,Long>{
}
