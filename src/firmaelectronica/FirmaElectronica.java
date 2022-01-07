/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firmaelectronica;

/**
 *
 * @author ccarreno
 */
public class FirmaElectronica {
    //private static Object XAdESBESSignature;
     
    public static void main(String[] args) throws Exception {
               
    /*String xmlPath = "C:\\SRI\\ComprobantesGenerados\\0501202201093076400600120010010000000481234567811.xml";
    String pathSignature = "C:\\FacturacionElectronica\\0930764006001.p12";
    String passSignature = "Sw28Cw37";
    String pathOut = "C:\\SRI\\ComprobantesFirmados\\";
    String nameFileOut = "factura_sign.xml";*/

    String pathSignature = args[0];
    String passSignature = args[1];
    String xmlPath = args[2];
    String pathOut = args[3];
    String nameFileOut = args[4];
     
    System.out.println("Ruta del XML de entrada: " + xmlPath);
    System.out.println("Ruta Certificado: " + pathSignature);
    System.out.println("Clave del Certificado: " + passSignature);
    System.out.println("Ruta de salida del XML: " + pathOut);
    System.out.println("Nombre del archivo salido: " + nameFileOut);
     
    try{
        XAdESBESSignature.firmar(xmlPath, pathSignature, passSignature, pathOut, nameFileOut);
    }catch(Exception e){
        System.out.println("Errores: " + e);
    }
}
 
   
}