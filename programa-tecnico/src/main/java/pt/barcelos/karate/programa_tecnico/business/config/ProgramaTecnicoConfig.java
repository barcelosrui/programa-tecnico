package pt.barcelos.karate.programa_tecnico.business.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pt.barcelos.karate.programa_tecnico.presistence.dao.BeltDao;
import pt.barcelos.karate.programa_tecnico.presistence.dao.KataDao;
import pt.barcelos.karate.programa_tecnico.presistence.dao.technique.PositionDao;
import pt.barcelos.karate.programa_tecnico.presistence.repository.BeltRepository;
import pt.barcelos.karate.programa_tecnico.presistence.repository.KataRepository;

import java.util.List;

@Configuration
public class ProgramaTecnicoConfig {

    @Autowired
    BeltRepository beltRepository;

    @Autowired
    KataRepository kataRepository;

    @Bean("katas")
    List<KataDao> getKata() {
        return List.of(
                new KataDao("Heian Shodan", "temp", "https://www.youtube.com/embed/q1Rg8rUpjjw?si=ZC6ifmnRaas97Ipt", "https://shotokankaratekent.co.uk/wp-content/uploads/2015/01/Heian-Shodan.gif"),
                new KataDao("Heian Nidan", "temp", "https://www.youtube.com/embed/rgs1ysn0R-0?si=lT1kWGq8NxnM-KqM", "https://shotokankaratekent.co.uk/wp-content/uploads/2015/01/Heian-Nidan.gif"),
                new KataDao("Heian Sandan", "temp", "https://www.youtube.com/embed/1MrRmimBJoA?si=V7jNEhFRANIR00LN", "https://shotokankaratekent.co.uk/wp-content/uploads/2015/01/Heian-Sandan.gif"),
                new KataDao("Heian Yondan", "temp", "https://www.youtube.com/embed/k72E1u962Qg?si=TsRQdoGCT7lTfdep", "https://shotokankaratekent.co.uk/wp-content/uploads/2015/01/Heian-Yondan.gif"),
                new KataDao("Heian Godan", "temp", "https://www.youtube.com/embed/JA0Ym97vjLg?si=fDN4wP9bJHQ-JowG", "https://shotokankaratekent.co.uk/wp-content/uploads/2015/01/Heian-Godan.gif"));
    }

    @Bean("belts")
    List<BeltDao> getBelt() {
        return List.of(
                new BeltDao("9.º Kyu", "Branco", "#FFFFFF"),
                new BeltDao("8.º Kyu", "Amarelo", "#FFF000"),
                new BeltDao("7.º Kyu", "Laranja", "#FF7700"),
                new BeltDao("6.º Kyu", "Verde", "#00FF00"),
                new BeltDao("5.º Kyu", "Azul", "#0000FF"),
                new BeltDao("4.º Kyu", "Vermelho", "#FF0000"),
                new BeltDao("3.º Kyu", "Castanho", "#964B00"),
                new BeltDao("2.º Kyu", "Castanho", "#964B00"),
                new BeltDao("1.º Kyu", "Castanho", "#964B00"),
                new BeltDao("1.º Dan", "Negro", "#000000"),
                new BeltDao("2.º Dan", "Negro", "#000000"),
                new BeltDao("3.º Dan", "Negro", "#000000"),
                new BeltDao("4.º Dan", "Negro", "#000000"),
                new BeltDao("5.º Dan", "Negro", "#000000"),
                new BeltDao("6.º Dan", "Negro", "#000000"),
                new BeltDao("7.º Dan", "Negro", "#000000"),
                new BeltDao("8.º Dan", "Negro", "#000000"),
                new BeltDao("9.º Dan", "Negro", "#000000"),
                new BeltDao("10.º Dan", "Negro", "#000000")
        );
    }

    @Bean("positions")
    List<PositionDao> getPositions() {
        return List.of(
                new PositionDao("Heisokudashi", "", "", ""),
                new PositionDao("Musubidashi", "", "", ""),
                new PositionDao("Heikodashi", "", "", ""),
                new PositionDao("Achigidashi", "", "", ""),
                new PositionDao("UshiAchigidashi", "", "", ""),
                new PositionDao("Zenkutsudashi", "", "", ""),
                new PositionDao("Kokutsudashi", "", "", ""),
                new PositionDao("Renogidashi", "", "", ""),
                new PositionDao("Teigidashi", "", "", "")
        );
    }
}
