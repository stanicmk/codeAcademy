package org.test.soapExample;

import javax.xml.ws.Endpoint;

import org.test.soapExample.services.PersonServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Endpoint.publish("http://localhost:8080/Person", new PersonServiceImpl());
        
        
    }
}
