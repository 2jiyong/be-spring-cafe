package codesquad.codestagram.repository;

import codesquad.codestagram.domain.Article;
import codesquad.codestagram.domain.Reply;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ReplyRepository {
    Reply save(Reply reply);
    List<Reply> findByArticle(Article article);
    Optional<Reply> findById(Long id);
    Page<Reply> findAll(Pageable pageable);
    void delete(Reply reply);
}
