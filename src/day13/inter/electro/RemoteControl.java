package day13.inter.electro;

public interface RemoteControl {

    // 인터페이스에 필드를 선언하면 자동으로 상수처리됨.
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);

    // JAVA ver.8 에서 default 메서드가 등장
    default void setMute() {
    }


}
