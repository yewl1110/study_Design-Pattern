import component.*;
import facade.HomeTheaterFacade;

public class Main {
    public static void main(String[] args) {

        Amplifier amplifier = new Amplifier("앰프");
        Tuner tuner = new Tuner("튜너,,?", amplifier);
        StreamingPlayer streamingPlayer = new StreamingPlayer("플레이어", amplifier);
        Projector projector = new Projector("프로젝터", streamingPlayer);
        TheaterLights theaterLights = new TheaterLights("조명");
        Screen screen = new Screen("스크린");
        PopcornPopper popcornPopper = new PopcornPopper("팝콘기계");
        
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, tuner, streamingPlayer, projector, screen, theaterLights, popcornPopper);
        homeTheaterFacade.watchMovie("닥터 스트레인지");
        homeTheaterFacade.endMovie();
    }
}
