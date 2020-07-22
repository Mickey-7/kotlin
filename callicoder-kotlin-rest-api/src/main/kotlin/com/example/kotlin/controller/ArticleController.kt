package com.example.kotlin.controller

import com.example.kotlin.domain.Article
import com.example.kotlin.repository.ArticleRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class ArticleController(private val articleRepository : ArticleRepository) {

    @GetMapping("/articles")
    fun getAllArticles(): List<Article> = articleRepository.findAll()


    @PostMapping("/articles")
    fun createNewArticle(@RequestBody article: Article): Article = articleRepository.save(article)

    @GetMapping("/articles/{id}")
    fun getArticleById(@PathVariable articleId: Long) : ResponseEntity<Article> {
        return articleRepository.findById(articleId).map {
            article -> ResponseEntity.ok(article)
        }.orElse(ResponseEntity.notFound().build())
    }

//    @PutMapping("/articles/{id}")
//    fun updateArticleById(@PathVariable(value = "id") articleId: Long, @RequestBody newArticle: Article): ResponseEntity<Article> {
//        return articleRepository.findById(articleId).map { existingArticle ->
//            val updatedArticle: Article = existingArticle
//                    .apply {title = newArticle.title, content = newArticle.content  }
//            ResponseEntity.ok().body(articleRepository.save(updatedArticle))
//        }.orElse(ResponseEntity.notFound().build())
//
//    }

    @DeleteMapping("/articles/{articleId}")
    fun deleteArticleById(@PathVariable articleId : Long) : ResponseEntity<Void>{
        return articleRepository.findById(articleId).map { article ->
            articleRepository.delete(article)
            ResponseEntity<Void>(HttpStatus.OK)
        }.orElse(ResponseEntity.notFound().build())
    }
}