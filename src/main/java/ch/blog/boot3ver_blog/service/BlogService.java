package ch.blog.boot3ver_blog.service;

import ch.blog.boot3ver_blog.domain.Article;
import ch.blog.boot3ver_blog.dto.AddArticleRequest;
import ch.blog.boot3ver_blog.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service // bean으로 등록
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll() { return blogRepository.findAll();}

    public Article findbyId(Long id){
        return blogRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("not found :"+id));
    }

    public void delete(Long id){blogRepository.deleteById(id);}

}
