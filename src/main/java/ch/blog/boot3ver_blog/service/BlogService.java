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

    //블로그 (게시판) 글 등록 메서드
    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }

    // 모든 게시글을 가져오는 서비스 로직
    public List<Article> findAll() { return blogRepository.findAll();}

    public Article findbyId(Long id){
        return blogRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("not found :"+id));
    }

    public void delete(Long id){blogRepository.deleteById(id);}

}
