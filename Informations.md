Informations :

Le fichier ```/src/main/resources/swagger.yaml``` décrit l'API. Il est référencé dans le ```pom.xml```

```xml
<configuration>
    <inputSpec>src/main/resources/swagger.yaml</inputSpec>
    <language>spring</language>
    <library>okhttp-gson</library>
    <configOptions>
        <sourceFolder>src/gen/java/main</sourceFolder>
        <interfaceOnly>true</interfaceOnly>
        <basePackage>ch.heigvd.gamification</basePackage>
        <modelPackage>ch.heigvd.gamification.api.dto</modelPackage>
        <apiPackage>ch.heigvd.gamification.api</apiPackage>
    </configOptions>
</configuration>
```



