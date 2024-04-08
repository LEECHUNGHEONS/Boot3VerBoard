package ch.blog.boot3ver_blog.service;

import ch.blog.boot3ver_blog.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service // bean으로 등록
public class BlogService {

    private final BlogRepository blogRepository;
}
