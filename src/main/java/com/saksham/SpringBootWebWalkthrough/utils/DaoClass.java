package com.saksham.SpringBootWebWalkthrough.utils;

import com.saksham.SpringBootWebWalkthrough.annotation.TimeTaken;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DaoClass {

    @TimeTaken
    public String retrieveSomething() {
        String extraLine = "Extra Line";
        return "Something is retrieved";
    }

}
