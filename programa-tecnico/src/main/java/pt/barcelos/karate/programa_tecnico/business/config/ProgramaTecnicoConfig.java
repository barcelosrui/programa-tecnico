package pt.barcelos.karate.programa_tecnico.business.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pt.barcelos.karate.programa_tecnico.presistence.dao.BeltDao;
import pt.barcelos.karate.programa_tecnico.presistence.dao.KataDao;
import pt.barcelos.karate.programa_tecnico.presistence.dao.technique.DefenseDao;
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
                new KataDao("Shi Oi-Zuki Shodan", "temp", "", ""),
                new KataDao("Taykyoku Shodan", "temp", "", ""),
                new KataDao("Taykyoku Nidan", "temp", "", ""),
                new KataDao("Taykyoku Sandan", "temp", "", ""),
                new KataDao("Heian Shodan", "temp", "https://www.youtube.com/embed/q1Rg8rUpjjw?si=ZC6ifmnRaas97Ipt", "https://shotokankaratekent.co.uk/wp-content/uploads/2015/01/Heian-Shodan.gif"),
                new KataDao("Uke Waza Shodan", "temp", "", ""),
                new KataDao("Happo Zuki", "temp", "", ""),
                new KataDao("Heian Nidan", "temp", "https://www.youtube.com/embed/rgs1ysn0R-0?si=lT1kWGq8NxnM-KqM", "https://shotokankaratekent.co.uk/wp-content/uploads/2015/01/Heian-Nidan.gif"),
                new KataDao("Uke Waza Nidan", "temp", "", ""),
                new KataDao("Heian Sandan", "temp", "https://www.youtube.com/embed/1MrRmimBJoA?si=V7jNEhFRANIR00LN", "https://shotokankaratekent.co.uk/wp-content/uploads/2015/01/Heian-Sandan.gif"),
                new KataDao("Uke Waza Sandan", "temp", "", ""),
                new KataDao("Heian Yondan", "temp", "https://www.youtube.com/embed/k72E1u962Qg?si=TsRQdoGCT7lTfdep", "https://shotokankaratekent.co.uk/wp-content/uploads/2015/01/Heian-Yondan.gif"),
                new KataDao("Uke Waza Yondan", "temp", "", ""),
                new KataDao("Heian Godan", "temp", "https://www.youtube.com/embed/JA0Ym97vjLg?si=fDN4wP9bJHQ-JowG", "https://shotokankaratekent.co.uk/wp-content/uploads/2015/01/Heian-Godan.gif"),
                new KataDao("Uke Waza Godan", "temp", "", ""),
                new KataDao("Ki Shodan Geri Kata", "temp", "", "")
        );
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
                new PositionDao("Heisoku Dachi", "","", "", false),
                new PositionDao("Musubi Dachi", "", "", "", false),
                new PositionDao("Heiko Dachi", "", "", "", false),
                new PositionDao("Soto Hatjiji Dachi", "",  "", "", false),
                new PositionDao("Ushi Hatjiji Dachi", "", "", "", false),
                new PositionDao("Zenkutsu Dachi", "", "", "",false),
                new PositionDao("Kokutsu Dachi", "", "", "", false),
                new PositionDao("Renogi Dachi", "", "", "", false),
                new PositionDao("Teiji Dachi", "", "", "", false),
                new PositionDao("Yori Ashi", "Deslocamento anterior e postrior", "", "", true),
                new PositionDao("Tsugi Ashi", "Deslocamento intermédio com a perna postrior", "", "", true),
                new PositionDao("Kiba Dachi", "", "", "", false),
                new PositionDao("Kata Ashi Dachi", "", "", "", false),
                new PositionDao("Neko Ashi Dachi", "", "", "", false),
                new PositionDao("Shiko Dachi", "", "", "", false),
                new PositionDao("Kosa Dachi", "", "", "", false),
                new PositionDao("Ayumi Ashi Dachi", "Deslocação Frontal", "", "", true),
                new PositionDao("Hangetsu Dachi", "", "", "", false),
                new PositionDao("Sochin Dachi", "", "", "", false),
                new PositionDao("Kata Hiza Dachi", "","", "", false ),
                new PositionDao("Tsuro Ashi Dachi", "", "", "", false),
                new PositionDao("Sanchin Dachi", "", "", "", false)
        );
    }


    @Bean("defenses")
    List<DefenseDao> getDefenses() {
        return List.of(
                new DefenseDao("Gedan Barai Uke", "Defesa baixa","", ""),
                new DefenseDao("Chudan Ude Uke", "Defesa media","", ""),
                new DefenseDao("Jodan Age Uke", "Defesa alta","", ""),
                new DefenseDao("Shuto Uke", "Defesa com a parte externa do antebraço em rotação","", ""),
                new DefenseDao("Soto Uke", "Defesa com a parte interna do antebraço em rotação","", ""),
                new DefenseDao("Shuto Barai", "Defesa circular com o sabre da mão em rotação","", ""),
                new DefenseDao("Haiwan Uke", "Defesa com a parte externa do antebraço ","", ""),
                new DefenseDao("Morrote Ude Uke", "Defesa dupla média com a parte externa do antebraço","", ""),
                new DefenseDao("Nagashi Uke", "Defesa com a palma da mão","", ""),
                new DefenseDao("Harai Uke", "Defesa circular baixa com o antebraço","", ""),
                new DefenseDao("Otoshi Uke", "Defesa com o punho/antebraço [ken]","", ""),
                new DefenseDao("Kosa Uke", "Defesa dupla com duas técnicas em simultânio","", ""),
                new DefenseDao("Manji Uke", "Defesa dupla com duas técnicas em simultânio","", ""),
                new DefenseDao("Kakiwake Uke", "Defesa dupla com os antebraços [ken & shuto]","", ""),
                new DefenseDao("Juji Uke", "Defesa cruzada [ken & shuto]","", ""),
                new DefenseDao("Koken Uke", "Defesa com a parte anterior da mão","", ""),
                new DefenseDao("Morrote Gamae Uke", "Defesa dupla","", ""),
                new DefenseDao("Sukui Uke", "Defesa Circular baixa com antebraço com rotação da anca","", ""),
                new DefenseDao("Morrote Shuto Uke", "Defesa dupla com o sabre da mão","", ""),
                new DefenseDao("Teisho Awase Uke", "Defesa com a planta do pé","", ""),
                new DefenseDao("De Ashi Barai", "Defesa com a palma da mão","", ""),
                new DefenseDao("Kakate Uke", "Defesa dupla com a palma da mão","", "")

                );
    }
}
