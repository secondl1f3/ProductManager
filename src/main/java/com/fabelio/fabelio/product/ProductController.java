package com.fabelio.fabelio.product;

import org.apache.commons.validator.routines.UrlValidator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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

}
