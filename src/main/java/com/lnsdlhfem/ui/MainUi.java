package com.lnsdlhfem.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.Viewport;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;

@SpringUI
@Viewport("initial-scale=1, maximum-scale=1")
@Theme("demo")
@Title("vaadin-demo")
public class MainUi extends UI{

    /**
     * @Title: init
     * @Description: 进入web应用时触发
     * @param: [request]
     * @return: void
     */
    @Override
    protected void init(VaadinRequest request) {

    }
}
