# Spring_Profile_Environment_With_Config_Server

check the properties of config server using      
~~~
https://dj-config-server.cfapps.io/actuator/dev
https://dj-config-server.cfapps.io/actuator/test
~~~

## Output of config server
~~~
{
    "name": "actuator",
    "profiles": [
        "dev"
    ],
    "label": null,
    "version": "d1f1b5dc1f484543a7a073c2b32a1c300fca104a",
    "state": null,
    "propertySources": [
        {
            "name": "https://github.com/9040010697/App_Config_Server_Properties/application-dev.yml",
            "source": {
                "spring.application.name": "SpringProfileExample_Dev_git",
                "server.port": 8086
            }
        },
        {
            "name": "https://github.com/9040010697/App_Config_Server_Properties/application.yml",
            "source": {
                "spring.application.name": "SpringProfileExample",
                "server.port": 8085
            }
        }
    ]
}
~~~
