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
import pt.barcelos.karate.programa_tecnico.presistence.dao.technique.DefenseDao;
import pt.barcelos.karate.programa_tecnico.presistence.dao.technique.PositionDao;
import pt.barcelos.karate.programa_tecnico.presistence.repository.BeltRepository;
import pt.barcelos.karate.programa_tecnico.presistence.repository.KataRepository;
import pt.barcelos.karate.programa_tecnico.presistence.repository.TechnicalProgramRepository;
import pt.barcelos.karate.programa_tecnico.presistence.repository.technique.DefenseRepository;
import pt.barcelos.karate.programa_tecnico.presistence.repository.technique.PositionRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


@SpringBootApplication
public class ProgramaTecnicoApplication {

    @Autowired
    @Qualifier("katas")
    private List<KataDao> kataDaos;

    @Autowired
    @Qualifier("belts")
    private List<BeltDao> beltDaos;

    @Autowired
    @Qualifier("positions")
    private List<PositionDao> positionDaos;

    @Autowired
    @Qualifier("defenses")
    private List<DefenseDao> defenseDaos;

    //@Autowired
    //@Qualifier("technicalPrograms")
    //private List<TechnicalProgram> technicalPrograms;

    private static final Logger log = LoggerFactory.getLogger(ProgramaTecnicoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ProgramaTecnicoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(KataRepository kataRepository,
                                  BeltRepository beltRepository,
                                  PositionRepository positionRepository,
                                  DefenseRepository defenseRepository,
                                  TechnicalProgramRepository technicalProgramRepository) {
        return args -> {
            kataRepository.saveAll(kataDaos);
            beltRepository.saveAll(beltDaos);
            positionRepository.saveAll(positionDaos);
            defenseRepository.saveAll(defenseDaos);

            final List<TechnicalProgramDao> technicalPrograms = new ArrayList<>();
            final List<BeltDao> listBeltDao = beltRepository.findAll();

            new ArrayList<>();
            final List<PositionDao> kyu9Positions = createList(
                    List.of("Heisoku Dachi", "Musubi Dachi", "Heiko Dachi", "Soto Hatjiji Dachi", "Ushi Hatjiji Dachi", "Zenkutsu Dachi"),
                    positionRepository::findByName);

            final List<DefenseDao> kyu9Defenses = createList(
                    List.of("Gedan Barai Uke", "Chudan Ude Uke", "Jodan Age Uke"),
                    defenseRepository::findByName);

            final List<KataDao> kyu9Katas = createList(
                    List.of("Shi Oi-Zuki Shodan", "Taykyoku Shodan", "Taykyoku Nidan", "Taykyoku Sandan"),
                    kataRepository::findByName);

            technicalPrograms.add(new TechnicalProgramDao(
                    listBeltDao.stream().filter(beltDao -> beltDao.getLevel().equals("9.º Kyu")).findAny().get(),
                    kyu9Positions,
                    List.of(),
                    List.of(),
                    kyu9Defenses,
                    kyu9Katas
            ));

            final List<PositionDao> kyu8Positions = createList(
                    List.of("Kokutsu Dachi", "Renogi Dachi", "Teiji Dachi"),
                    positionRepository::findByName);

            final List<DefenseDao> kyu8Defenses = createList(
                    List.of("Shuto Uke", "Soto Uke", "Shuto Barai"),
                    defenseRepository::findByName);

            final List<KataDao> kyu8Katas = createList(
                    List.of("Heian Shodan", "Uke Waza Shodan", "Happo Zuki"),
                    kataRepository::findByName);

            technicalPrograms.add(new TechnicalProgramDao(
                    listBeltDao.stream().filter(beltDao -> beltDao.getLevel().equals("8.º Kyu")).findAny().get(),
                    kyu8Positions,
                    List.of(),
                    List.of(),
                    kyu8Defenses,
                    kyu8Katas)
            );

            final List<PositionDao> kyu7Positions = createList(
                    List.of("Yori Ashi", "Tsugi Ashi", "Kiba Dachi", "Kata Ashi Dachi", "Neko Ashi Dachi"),
                    positionRepository::findByName);

            final List<DefenseDao> kyu7Defenses = createList(
                    List.of("Haiwan Uke", "Morrote Ude Uke", "Nagashi Uke", "Harai Uke"),
                    defenseRepository::findByName);

            final List<KataDao> kyu7Katas = createList(
                    List.of("Heian Nidan", "Uke Waza Nidan"),
                    kataRepository::findByName);

            technicalPrograms.add(new TechnicalProgramDao(
                    listBeltDao.stream().filter(beltDao -> beltDao.getLevel().equals("7.º Kyu")).findAny().get(),
                    kyu7Positions,
                    List.of(),
                    List.of(),
                    kyu7Defenses,
                    kyu7Katas
            ));

            final List<PositionDao> kyu6Positions = createList(
                    List.of("Shiko Dachi", "Kosa Dachi", "Ayumi Ashi Dachi"),
                    positionRepository::findByName);

            final List<DefenseDao> kyu6Defenses = createList(
                    List.of("Otoshi Uke", "Kosa Uke", "Manji Gamae"),
                    defenseRepository::findByName);

            final List<KataDao> kyu6Katas = createList(
                    List.of("Heian Sandan", "Uke Waza Sandan"),
                    kataRepository::findByName);

            technicalPrograms.add(new TechnicalProgramDao(
                    listBeltDao.stream().filter(beltDao -> beltDao.getLevel().equals("6.º Kyu")).findAny().get(),
                    kyu6Positions,
                    List.of(),
                    List.of(),
                    kyu6Defenses,
                    kyu6Katas)
            );

            final List<PositionDao> kyu5Positions = createList(
                    List.of("Hangetsu Dachi", "Sochin Dachi"),
                    positionRepository::findByName);

            final List<DefenseDao> kyu5Defenses = createList(
                    List.of("Kakiwake Uke", "Juji Uke", "Koken Uke", "Morrote Gamae Uke"),
                    defenseRepository::findByName);

            final List<KataDao> kyu5Katas = createList(
                    List.of("Heian Yondan", "Uke Waza Yondan"),
                    kataRepository::findByName);

            technicalPrograms.add(new TechnicalProgramDao(
                    listBeltDao.stream().filter(beltDao -> beltDao.getLevel().equals("5.º Kyu")).findAny().get(),
                    kyu5Positions,
                    List.of(),
                    List.of(),
                    kyu5Defenses,
                    kyu5Katas)
            );

            final List<PositionDao> kyu4Positions = createList(
                    List.of("Kata Hiza Dachi", "Tsuro Ashi Dachi", "Sanchin Dachi"),
                    positionRepository::findByName);

            final List<DefenseDao> kyu4Defenses = createList(
                    List.of("Sukui Uke", "Morrote Shuto Uke", "Teisho Awase Uke", "De Ashi Barai", "Kakate Uke"),
                    defenseRepository::findByName);

            final List<KataDao> kyu4Katas = createList(
                    List.of("Heian Godan", "Uke Waza Godan", "Ki Shodan Geri Kata"),
                    kataRepository::findByName);

            technicalPrograms.add(new TechnicalProgramDao(
                    listBeltDao.stream().filter(beltDao -> beltDao.getLevel().equals("4.º Kyu")).findAny().get(),
                    kyu4Positions,
                    List.of(),
                    List.of(),
                    kyu4Defenses,
                    kyu4Katas
            ));
            technicalProgramRepository.saveAll(technicalPrograms);
        };
    }

    private <T> List<T> createList(List<String> list, Function<String, T> consumer) {
        final List<T> result = new ArrayList<>();
        for (String s : list) {
            result.add(consumer.apply(s));
        }
        return result;
    }
}
