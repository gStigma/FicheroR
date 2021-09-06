package com.cursoandroid.referenciasandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/* Se muestra el uso del fichero R
* Este texto a sido extraido de https://developer.android.com/guide/topics/resources/providing-resources
* *se puede extraer más informacion el los enlaces
* para más informacion enviar correo a gSStigma@gmail.com
* 1.0
* */

/*El directorio res/ contiene todos los recursos (en subdirectorios): un recurso de imagen, dos recursos de diseño,
 directorios mipmap/ para los íconos del selector y un archivo de recursos de strings. Los nombres del directorio de
 recursos son importantes*/

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)// R es el fichero de cada uno de los elementos que vamos incluyendo y es auto regenerado por el propio android estudio
    }
}