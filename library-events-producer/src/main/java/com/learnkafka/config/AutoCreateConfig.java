package com.learnkafka.config;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.kafka.config.TopicBuilder;


/**
 * Para rama principal de desarrollo
 * 
 * primer cambio en rama desarrollo1
*/

@Configuration
@Profile("local")
public class AutoCreateConfig {

    /**
     * 2º cmabio en rama desarrollo1 
     * 
     */

    @Bean
    public NewTopic libraryEvents(){
        return TopicBuilder.name("library-events")
                .partitions(3)
                .replicas(1)
                .build();
    }
    /**
     * Un cambio hecho en master tras la creación de la rama desarrollo1
     * 
     */


}
