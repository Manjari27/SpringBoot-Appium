package com.SimpleApp.Simple.Application.page;

import com.SimpleApp.Simple.Application.annotation.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Page
public class MediaPage extends Base {

    @Autowired
    private FirstPage firstPage;

    @Autowired
    private SecondPage secondPage;

    public FirstPage getFirstPage(){
        return firstPage;
    }

    public SecondPage secondPage(){
        return secondPage;
    }
}
