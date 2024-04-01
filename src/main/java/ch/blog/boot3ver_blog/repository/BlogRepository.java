package ch.blog.boot3ver_blog.repository;

import ch.blog.boot3ver_blog.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {

}
