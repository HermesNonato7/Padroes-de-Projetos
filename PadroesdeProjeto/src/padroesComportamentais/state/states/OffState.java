package padroesComportamentais.state.states;

import padroesComportamentais.state.HeadPhone;

public class OffState implements HeadPhoneState {
    private static final HeadPhoneState instance = new OffState();

    private OffState() {}

    public static HeadPhoneState getInstance() {
        return instance;
    }

    @Override
    public void click(HeadPhone headPhone) {
        //Nothing to do!
    }

    @Override
    public void longClick(HeadPhone headPhone) {
        headPhone.setOn(true);
        System.out.println("> Ligando");
        headPhone.setState(OnState.getInstance());
    }
}
