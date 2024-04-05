package ch.blog.boot3ver_blog.dto;

import ch.blog.boot3ver_blog.domain.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddArticleRequest {

    private String title;
    private String content;


    public Article toEntity(){
        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }
}
