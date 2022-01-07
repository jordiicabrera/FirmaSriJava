# Firma Electronica SRI JAVA

Proyecto del Firmado Electronico en Java para la Facturación Electrónica que se usa en Ecuador, basado en las especificaciones definidas en XADES_BES lo que permitiría ser usada en otros ambientes que requieran XADES_BES.

## Forma de utilizar

Al compilar el código se genera un archivo FirmaElectronica.jar que permite firmar el documento de la siguiente forma:

java -jar FirmaElectronica.jar /path/sample/certificate.p12 cErTiFicAtEPaSsWoRd /path/sample/unsignedFile.xml /path/sample outputFile.xml

Desde la ventana de comandos CMD en Windows o Terminal en Linux se procede a ejecutar el Jar que requiere 4 parametros, los cuales se digitan despues del archivo jar separados por un espacio en blanco entre ellos <br />

A continuacion se detalla lo que debe tener cada parametro<br />

Parametro 1: Se debe ingresar la ruta donde se ubica el certificado de firma electronica p12. <br />
Parametro 2: Se debe ingresar la contraseña de la firma electronica. <br />
Parametro 3: Se debe ingresar la ruta donde se encuentra el archivo XML generado que se desea firmar. <br />
Parametro 4: Se debe ingresar el nombre que tendra el archivo firmado. <br />

# CREDITOS

Todo el código es crédito de Cristhian Carreño quien expone en el siguiente tutorial como firmar un documento. <br />
http://webcarreno.org/index.php/tutorials/28-sri-tutorial/24-sri-firma-digital-xades-bes
La web ya no se encuentra disponible pero este proyecto se baso en el siguiente repositorio <br />
https://github.com/joselo/sri



