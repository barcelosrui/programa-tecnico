package pt.barcelos.karate.programa_tecnico;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pt.barcelos.karate.programa_tecnico.presistence.dao.BeltDao;
import pt.barcelos.karate.programa_tecnico.presistence.dao.KataDao;
import pt.barcelos.karate.programa_tecnico.presistence.dao.TechnicalProgramDao;
import pt.barcelos.karate.programa_tecnico.presistence.repository.BeltRepository;
import pt.barcelos.karate.programa_tecnico.presistence.repository.KataRepository;
import pt.barcelos.karate.programa_tecnico.presistence.repository.TechnicalProgramRepository;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class ProgramaTecnicoApplication {

    @Autowired
    @Qualifier("katas")
    private List<KataDao> kataDaos;

    @Autowired
    @Qualifier("belts")
    private List<BeltDao> beltDaos;

    //@Autowired
    //@Qualifier("technicalPrograms")
    //private List<TechnicalProgram> technicalPrograms;

    private static final Logger log = LoggerFactory.getLogger(ProgramaTecnicoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ProgramaTecnicoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(KataRepository kataRepository, BeltRepository beltRepository, TechnicalProgramRepository technicalProgramRepository) {
        return args -> {

            kataRepository.saveAll(kataDaos);
            beltRepository.saveAll(beltDaos);

            final List<TechnicalProgramDao> technicalPrograms = new ArrayList<>();
            final List<BeltDao> listBeltDao = beltRepository.findAll();

            technicalPrograms.add(new TechnicalProgramDao(
                    listBeltDao.stream().filter(beltDao -> beltDao.getLevel().equals("8.º Kyu")).findAny().get(),
                    List.of(),
                    List.of(),
                    List.of(),
                    List.of(),
                    List.of(kataRepository.findByName("Heian Shodan"))
            ));

            technicalPrograms.add(new TechnicalProgramDao(
                    listBeltDao.stream().filter(beltDao -> beltDao.getLevel().equals("7.º Kyu")).findAny().get(),
                    List.of(),
                    List.of(),
                    List.of(),
                    List.of(),
                    List.of(kataRepository.findByName("Heian Nidan"))
            ));
            technicalPrograms.add(new TechnicalProgramDao(
                    listBeltDao.stream().filter(beltDao -> beltDao.getLevel().equals("6.º Kyu")).findAny().get(),
                    List.of(),
                    List.of(),
                    List.of(),
                    List.of(),
                    List.of(kataRepository.findByName("Heian Sandan"))
            ));

            technicalPrograms.add(new TechnicalProgramDao(
                    listBeltDao.stream().filter(beltDao -> beltDao.getLevel().equals("5.º Kyu")).findAny().get(),
                    List.of(),
                    List.of(),
                    List.of(),
                    List.of(),
                    List.of(kataRepository.findByName("Heian Yondan"))
            ));

            technicalPrograms.add(new TechnicalProgramDao(
                    listBeltDao.stream().filter(beltDao -> beltDao.getLevel().equals("4.º Kyu")).findAny().get(),
                    List.of(),
                    List.of(),
                    List.of(),
                    List.of(),
                    List.of(kataRepository.findByName("Heian Godan"))
            ));
            technicalProgramRepository.saveAll(technicalPrograms);

            // fetch all customers
            log.info("Katas found with findAll():");
            log.info("-------------------------------");
            kataRepository.findAll().forEach(customer -> log.info(customer.toString()));
            log.info("");

            // fetch an individual kata by ID
            KataDao customer = kataRepository.findById(1L);
            log.info("KATA found with findById(1L):");
            log.info("--------------------------------");
            log.info(customer.toString());
            log.info("");

            // fetch katas by name
            log.info("Customer found with findByName('Heian Sandan'):");
            log.info("--------------------------------------------");
            log.info(kataRepository.findByName("Heian Sandan").getName());
            log.info("");
        };
    }


}
