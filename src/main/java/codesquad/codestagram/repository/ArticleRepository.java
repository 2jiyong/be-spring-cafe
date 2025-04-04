package codesquad.codestagram.repository;

import codesquad.codestagram.domain.Article;
import codesquad.codestagram.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;


public interface ArticleRepository {
    Article save(Article article);
    List<Article> findByUser(User user);
    List<Article> findByTitle(String title);
    Optional<Article> findById(Long id);
    List<Article> findAll();
    Page<Article> findAll(Pageable pageable);
    void delete(Article article);
}
