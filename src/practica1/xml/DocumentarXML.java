/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1.xml;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 *
 * @author USUARIO
 */
class DocumentarXML {

    public Document d;

    public DocumentarXML() {
    }

    public DocumentarXML(Document d) {
        this.d = d;
    }

    public Document getD() {
        return d;
    }

    public void setD(Document d) {
        this.d = d;
    }

    public void preparacion(String s) throws ParserConfigurationException, SAXException {
        try {
            File file = new File(s);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = null;
            this.d = db.parse(file);
            this.d.getDocumentElement().normalize();

        } catch (IOException ex) {
            Logger.getLogger(DocumentarXML.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String SacarCdata(Document d) {
        NodeList autorizacion = d.getElementsByTagName("autorizacion");
        Node comprobante = autorizacion.item(0);
        Element element = (Element) comprobante;
        String xmlString;
        xmlString = element.getElementsByTagName("comprobante").item(0).getTextContent();
        return xmlString;
    }

    public void CrearArchiuvoXML(String contenido) {
        try {
            String ruta = "\\Users\\USUARIO\\Documents\\NetBeansProjects\\Practica1-XML\\datos\\Factura4.xml";

            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void presentacion() {
        String nodoPrincipal;
        nodoPrincipal = this.d.getDocumentElement().getNodeName();
        System.out.println("Elemento Raiz: " + nodoPrincipal);
        NodeList programas = this.d.getElementsByTagName("totalImpuesto");
        System.out.println("Contenido del Documento");
        System.out.println("");
        for (int i = 0; i < programas.getLength(); i++) {
            Node programa = programas.item(i);
            System.out.println("Nombre del elemento actual: " + programa.getNodeName());
            if (programa.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) programa;
//                System.out.println("codigo: " + element.getAttribute("codigo"));
                System.out.println("codigo: " + element.getElementsByTagName("codigo").item(0).getTextContent());
                System.out.println("codigoPorcentaje: " + element.getElementsByTagName("codigoPorcentaje").item(0).getTextContent());
                System.out.println("baseImponible: " + element.getElementsByTagName("baseImponible").item(0).getTextContent());
                System.out.println("tarifa: " + element.getElementsByTagName("tarifa").item(0).getTextContent());
                System.out.println("valor: " + element.getElementsByTagName("valor").item(0).getTextContent());
                

            }
        }
    }
}
