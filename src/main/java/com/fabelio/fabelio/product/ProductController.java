package com.fabelio.fabelio.product;

import org.apache.commons.validator.routines.UrlValidator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
public class ProductController {
    /*
    * Show list of products
    * */
    @GetMapping("/")
    public String list() {
        return "products";
    }

    /*
    * Check URL is valid or not
    * */
    @GetMapping("/add-link")
    public boolean checkLink(String url) {
        boolean isValidUrl = false;
        UrlValidator urlValidator = new UrlValidator();
        isValidUrl = urlValidator.isValid(url);
        if (isValidUrl == true) {
            return isValidUrl;
        }
        return isValidUrl;
    }

    /**
     * Crawling Data from a webpage
     */
    // test commit
    @GetMapping("/crawl-url")
    public boolean getCrawling(String url) throws IOException {
        boolean result = false;
        Document doc = Jsoup.connect(url).get();
        Elements images = doc.select("img[src~=(?i)\\.(png|jpe?g|gif)]");
        String title = doc.title();
        for (Element image : images){

        }
        return result;
    }
}
