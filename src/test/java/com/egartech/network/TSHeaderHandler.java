package com.egartech.network;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by alander on 27.04.18.
 */
public class TSHeaderHandler implements SOAPHandler<SOAPMessageContext> {

    private String sessionID;
    private String userName;

    public TSHeaderHandler initSession(String _sessionID) {
        this.setSessionID(_sessionID);
        return this;
    }

    public TSHeaderHandler initUserName(String _userName) {
        this.setUserName(_userName);
        return this;
    }


    public boolean handleMessage(SOAPMessageContext smc) {

        Boolean outboundProperty = (Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        if (outboundProperty.booleanValue()) {

            SOAPMessage message = smc.getMessage();

            try {

                SOAPEnvelope envelope = smc.getMessage().getSOAPPart().getEnvelope();
                SOAPHeader header = envelope.addHeader();

                QName el = new QName("h","SessionID");
                SOAPElement sessionIDToken =
                        header.addHeaderElement(el);
                sessionIDToken.addTextNode(sessionID);


                QName elName = new QName("h","UserName");
                SOAPElement sessionNameToken =
                        header.addHeaderElement(elName);
                sessionNameToken.addTextNode(userName);

                //Print out the outbound SOAP message to System.out
                message.writeTo(System.out);
                System.out.println("");

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            try {

                //This handler does nothing with the response from the Web Service so
                //we just print out the SOAP message.
                SOAPMessage message = smc.getMessage();
                message.writeTo(System.out);
                System.out.println("");

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }


        return outboundProperty;

    }

    public Set getHeaders() {
        // The code below is added on order to invoke Spring secured WS.
        // Otherwise,
        // http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd
        // won't be recognised
        final QName securityHeader = new QName(
                "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd",
                "Security", "wsse");

        final HashSet headers = new HashSet();
        headers.add(securityHeader);

        return headers;
    }

    public boolean handleFault(SOAPMessageContext context) {
        //throw new UnsupportedOperationException("Not supported yet.");
        return true;
    }

    public void close(MessageContext context) {
//throw new UnsupportedOperationException("Not supported yet.");
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
