package padroesComportamentais.state.states;

import padroesComportamentais.state.HeadPhone;

public class PlayingState implements HeadPhoneState {
    private static final HeadPhoneState instance = new PlayingState();

    private PlayingState() {}

    public static HeadPhoneState getInstance() {
        return instance;
    }
    @Override
    public void click(HeadPhone headPhone) {
        headPhone.setPlaying(false);
        System.out.println("> Para música");
        headPhone.setState(OnState.getInstance());
    }

    @Override
    public void longClick(HeadPhone headPhone) {
        headPhone.setOn(false);
        System.out.println("> Desligando");
        headPhone.setState(OffState.getInstance());
    }
}
