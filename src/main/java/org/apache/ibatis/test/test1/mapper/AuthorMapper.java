package org.apache.ibatis.test.test1.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.test.test1.entity.Author;

import java.util.List;

/**
 * @ClassName AuthorMapper
 * @auther mjlf
 * @Date 2019/10/12 13:54
 * @Description TODO
 */
public interface AuthorMapper {

  void saveAuthor(Author author);

  List<Author> getAllAuthor();

  Author getAuthorById(Integer id);
}
