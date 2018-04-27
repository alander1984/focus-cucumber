package com.egartech.network;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alander on 27.04.18.
 */
public class TSHeaderHandlerResolver implements HandlerResolver {

    private String sessionID;
    private String userName;

    public List<Handler> getHandlerChain(PortInfo portInfo) {
        List<Handler> handlerChain = new ArrayList<Handler>();

        TSHeaderHandler hh = new TSHeaderHandler().initSession(sessionID).initUserName(userName);

        handlerChain.add(hh);

        return handlerChain;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
