#Challenge Google Translate
Se realizo la automatización de Google Translate.

para este reto se necesita las siguientes herramientas listadas a continuacion:

* [JDK 1.8](https://www.oracle.com/technetwork/java/javase/downloads/index.html) o superior.
* [Git](https://git-scm.com/) instalado.
* [Gradle](https://gradle.org/install/)
* Google Chrome y Firefox instalado
* Se recomienda como IDE IntelliJ IDEA o Eclipse.
* File Enconding aplicado: UTF-8.

##Empezemos

Descargar o clonar el repositorio desde https://github.com/santfirax/GoogleTranslateChallengeScreenPlay.git

`git clone https://github.com/santfirax/GoogleTranslateChallengeScreenPlay.git`

###Para ejecutar la automatización en Google Chrome

`gradle clean test -D webdriver.driver=chrome`

###Para ejecutar la automatización desde Firefox 
`gradle clean test -D webdriver.driver=firefox`

###Para ejecutar la automatización usando tags
cada Escenario tiene mapeado un tag que lo representa, los tags son los siguientes:
* @TranslateFromApp
* @TranslateFromGoogleSearch

Para el primer Escenario `gradle clean test -Dcucumber.options="--tags @TranslateFromApp"`

para el segundo Escenario `gradle clean test -Dcucumber.options="--tags @TranslateFromGoogleSearch"`

Para especificar el driver se agrega `-D webdriver.driver`

Primer Escenario con Chrome: `gradle clean test -Dcucumber.options="--tags @TranslateFromApp" -D webdriver.driver=chrome`

Segundo Escenario con Firefox: `gradle clean test -Dcucumber.options="--tags @TranslateFromGoogleSearch" -D webdriver.driver=firefox`

Ambos Escenarios se pueden ejecutar en Chrome y Firefox solamente se debe especificar si es Chrome o Firefox cuando se pasa la opción `webdriver.driver` en caso tal de que no se especifique esta opción el browser por defecto sera Firefox

####Evidencia
la evidencia producida esta en la siguiente ruta:
`target//site//serenity` en el arcivo index.html

###Nota:
* Los Escenarios fueron planteados desde Google en idioma español
