package payroll;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.CommandLineRunner;

/**
 *
 * @author Faisal
 */
class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    
    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {
        
        return args -> {
            log.info("Preloading " + repository.save(new Employee("Abu Bakar", "KhalifahOne")));
            log.info("Preloading " + repository.save(new Employee("Umar", "KhalifahTwo")));
        };
    }
}
