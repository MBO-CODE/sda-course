package com.sda.spring.core.configs.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TextEditor {

//    dependency injection : 3 options

    private SpellChecker spellChecker;

    //    1. field injection is evil
//    @Autowired - DONT DO THIS
    private TextFormatter textFormatter;

    private ImageConvertor imageConvertor;

    //    2. constructor injection - DO THIS
    @Autowired
    public TextEditor(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    //   3. setter injection
    @Autowired
    public void setImageConvertor(ImageConvertor imageConvertor) {
        this.imageConvertor = imageConvertor;
    }

    //    delegation
    public void spellCheck() {
        spellChecker.checkSpelling();
    }

    public void formatT() {
        textFormatter.formatText();
    }

    public void convertImage() {
        imageConvertor.convert();
    }
}
