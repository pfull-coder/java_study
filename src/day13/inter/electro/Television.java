package day13.inter.electro;

import static day13.inter.electro.RemoteControl.MAX_VOLUME;
import static day13.inter.electro.RemoteControl.MIN_VOLUME;

public class Television implements RemoteControl {

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > MAX_VOLUME) {
            this.volume = MAX_VOLUME;
        } else if (volume < MIN_VOLUME) {
            this.volume = MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨: " + this.volume);
    }
    // RemoteControl에 새로 추가된 기능을 오류가 나지 않게
    // default 설정해놓고 필요한 부분만 찾아서 추가할 수 있다.
    @Override
    public void setMute() {

    }
}
