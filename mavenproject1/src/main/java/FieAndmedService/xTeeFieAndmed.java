/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FieAndmedService;

import eu.x_road.emta_v6.PersonalIdentityCode;
import eu.x_road.emta_v6.XteeFieAndmedResponse;
import eu.x_road.emta_v6.XteeFieAndmedResponseType;
import javax.jws.WebService;

/**
 *
 * @author Rasmus
 */
@WebService(serviceName = "webService", portName = "port", endpointInterface = "eu.x_road.emta_v6.WebServiceInterface", targetNamespace = "http://emta-v6.x-road.eu", wsdlLocation = "WEB-INF/wsdl/services.wsdl")
public class xTeeFieAndmed {  

 /**s
 * 
 * @param keha
 * @param paring
 * @param keha0
 * @return XteeFieAndmedResponseType
 */
   
    public eu.x_road.emta_v6.XteeFieAndmedResponse xteeFieAndmed(eu.x_road.emta_v6.PersonalIdentityCode keha, javax.xml.ws.Holder<eu.x_road.emta_v6.PersonalIdentityCode> paring, javax.xml.ws.Holder<eu.x_road.emta_v6.XteeFieAndmedResponseType> keha0) {
       XteeFieAndmedResponseType xTeeFieAndmedResponseType = new XteeFieAndmedResponseType();
        
       XteeFieAndmedResponse xTeeFieAndmedResponse = new XteeFieAndmedResponse();
        
       PersonalIdentityCode personalIdentityCode = new PersonalIdentityCode();
       personalIdentityCode.setIsikukood(keha.getIsikukood());
        
       xTeeFieAndmedResponse.setParing(personalIdentityCode);
       xTeeFieAndmedResponse.setKeha(xTeeFieAndmedResponseType);
        
        
        return xTeeFieAndmedResponse;
    }
    
}
