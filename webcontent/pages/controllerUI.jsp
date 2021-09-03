<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html" %>

<%@taglib prefix="t" uri="/WEB-INF/eclnt" %>


<!-- ========== CONTENT BEGIN ========== -->
<f:view>
    <h:form>
        <f:subview id="pages_controllerUIg_sv">
            <t:beanprocessing id="g_1">
                <t:clientconfig id="g_2"/>
                <t:sessioncloser id="g_3"/>
            </t:beanprocessing>
            <t:row id="g_5">
                <t:pagebeancomponent id="g_6" pagebeanbinding="#{d.CCControllerUI.contentUI}" shownullcontent="false"/>
            </t:row>
            <t:rowstatusbar id="g_20" rendered="true"/>
            <t:pageaddons id="g_pa"/>
        </f:subview>
    </h:form>
</f:view>
<!-- ========== CONTENT END ========== -->
