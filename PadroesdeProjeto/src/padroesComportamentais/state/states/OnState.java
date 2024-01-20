package padroesComportamentais.state.states;

import padroesComportamentais.state.HeadPhone;

public class OnState implements HeadPhoneState {
    private static final HeadPhoneState instance = new OnState();

    private OnState() {}

    public static HeadPhoneState getInstance() {
        return instance;
    }

    @Override
    public void click(HeadPhone headPhone) {
        headPhone.setPlaying(true);
        System.out.println("> Toca música");
        headPhone.setState(PlayingState.getInstance());
    }

    @Override
    public void longClick(HeadPhone headPhone) {
        headPhone.setOn(false);
        System.out.println("> Desligando");
        headPhone.setState(OffState.getInstance());
    }
}

