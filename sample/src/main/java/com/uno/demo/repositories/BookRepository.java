/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uno.demo.repositories;

import com.uno.demo.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author soumitragoswami
 */


public interface BookRepository extends JpaRepository<Book, String> {
}
