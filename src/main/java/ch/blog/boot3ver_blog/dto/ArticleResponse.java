package ch.blog.boot3ver_blog.dto;

import ch.blog.boot3ver_blog.domain.Article;
import lombok.Builder;
import lombok.Getter;

@Getter

public class ArticleResponse {

    private final String title;
    private final String content;

    @Builder
    public ArticleResponse(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
