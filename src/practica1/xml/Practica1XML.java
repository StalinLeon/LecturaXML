/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1.xml;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author USUARIO
 */
public class Practica1XML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParserConfigurationException, SAXException {
        // TODO code application logic here
        
            String direccionArchivo = "\\Users\\USUARIO\\Documents\\NetBeansProjects\\Practica1-XML\\datos\\Factura2.xml";
            DocumentarXML documentarXML = new DocumentarXML(null);            
            documentarXML.preparacion(direccionArchivo);
            String s = null;
            s = documentarXML.SacarCdata(documentarXML.getD());
//            System.out.println(s);
            documentarXML.CrearArchiuvoXML(s);           
            String direccionArchivo2 = "\\Users\\USUARIO\\Documents\\NetBeansProjects\\Practica1-XML\\datos\\Factura4.xml";
            DocumentarXML documentarXML2 = new DocumentarXML(null);
            documentarXML2.preparacion(direccionArchivo2);
            documentarXML2.presentacion();

            
    }

}
