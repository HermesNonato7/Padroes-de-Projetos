package padroesComportamentais.state;

import padroesComportamentais.state.states.HeadPhoneState;
import padroesComportamentais.state.states.OffState;

public class HeadPhone {
    private HeadPhoneState state;
    private boolean isOn;
    private boolean isPlaying;

    public HeadPhone() {
        this.isOn = false;
        this.isPlaying = false;
        state = OffState.getInstance();
    }

    public void onLongClick() {
        System.out.println("Click long pressionado...");
        state.longClick(this);
    }

    public void onClick() {
        System.out.println("Click pressionado...");
        state.click(this);
    }

    public HeadPhoneState getState() {
        return state;
    }

    public void setState(HeadPhoneState state) {
        System.out.println(String.format("Alterando estado de %s para %s",
                this.state.getClass().getSimpleName(),
                state.getClass().getSimpleName()));
        this.state = state;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean isPlaying) {
        this.isPlaying = isPlaying;
    }
}

