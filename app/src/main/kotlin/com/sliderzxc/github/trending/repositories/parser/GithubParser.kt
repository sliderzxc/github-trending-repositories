package com.sliderzxc.github.trending.repositories.parser

import com.sliderzxc.github.trending.repositories.language.ProgrammingLanguage
import org.jsoup.Jsoup
import java.io.IOException


object GithubParser {
    fun parseTrendingRepositories(programmingLanguage: ProgrammingLanguage) {
        val url = "https://github.com/trending/${programmingLanguage.language}"

        try {
            val document = Jsoup.connect(url).get()

            val codeWord = "stargazers"
            val hrefAttributes = document.select("a[href]").map {
                it.attr("href")
            }.filter { it.contains(codeWord) }.map { repositoryId ->
                "https://github.com${repositoryId.replace(codeWord, "")}"
            }

            hrefAttributes.forEach {
                println(it)
            }


        } catch (e: IOException) {
            println("message: ${e.message}")
        }
    }
}

fun main() {
    GithubParser.parseTrendingRepositories(ProgrammingLanguage.Java)
}
