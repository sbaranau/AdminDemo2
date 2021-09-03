package com.managedbeans;

import lombok.extern.slf4j.Slf4j;
import org.eclnt.editor.annotations.CCGenClass;
import org.eclnt.jsfserver.defaultscreens.OKPopup;
import org.eclnt.jsfserver.elements.ApplicationErrorInfo;
import org.eclnt.jsfserver.elements.ApplicationErrorInfoDuringSet;
import org.eclnt.jsfserver.util.HttpSessionAccess;

import java.io.Serializable;


@Slf4j
@CCGenClass(expressionBase = "#{d.CCControllerUI}")
public class CCControllerUI extends CustomPageBean implements Serializable {

    private final String resetUrl;

    public CCControllerUI() {
        resetUrl = HttpSessionAccess.getCurrentRequest().getParameter("key");


        startUp();
    }

    private void startUp(){
        log.info("startUp");
    }

    private void onSetup(){
    }

    public void onApplicationError(ApplicationErrorInfo errorInfo){
        handleError(errorInfo.getException());
    }

    public void onApplicationErrorDuringSet(ApplicationErrorInfoDuringSet aeids){
        handleError(aeids.getException());
    }

    private void handleError(Throwable exception){
        OKPopup popup = null;
        boolean showPopup = true;



        if(showPopup){
            popup.getModalPopup().setLeftTopReferenceCentered();
        }
    }



    public String getPageName() {
        return "/pages/controllerUI.jsp";
    }

    public String getRootExpressionUsedInPage() {
        return "#{d.CCControllerUI}";
    }

}
