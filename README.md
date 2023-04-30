# `Automatización de pruebas App Exito`

#### Descripción

Proyecto de Automatización de pruebas web de la plataforma Exito con JAVA, Serenity BDD y Gradle.

#### Feature: Validate shopping cart

> **As** a user of Exito

> **I** want to access the app

> **To** purchase online

#

#### Características del Proyecto

En la construcción del proyecto de automatizacion en la plataforma Exito se implementa:

- Patrón de diseño de Screemplay.
- Framework SerenityBDD.
- Gestor de paquetes Gradle 7.
- Desarrollado en java en su versión 11

#### Versionado

| Repository       | Version |
|------------------|---------|
| Serenity         | 3.6.22  |
| SerenityCucumber | 3.6.22  |
| SerenityEnsure   | 3.2.5   |
| Slf4jSimple      | 2.0.7   |
| Junit            | 4.13.2  |
| Appium           | 8.3.0   |

#### Precondiciones

- [x] 1: Instar Java en su versión 11.
- [x] 1.1: Configurar variable de entorno JAVA_HOME.
- [x] 2: Instar Gradle en su versión 7.X.
- [x] 2.1: Configurar variable de entorno GRADLE_HOME.

#### Ejecución del proyecto

Para la ejecución del proyecto se debe implementar el siguiente comando en el terminal del directorio raíz del
proyecto:

- si no tienes Gradle o una version menor que la 7.x.x, ejecuta el siguiente comando:

```sh
./gradlew clean test 
```

- si tienes gradle instalado y configurado puedes ejecutar el siguiente comando:

```sh
gradle clean test 
```

