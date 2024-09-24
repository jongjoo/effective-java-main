package me.whiteship.chapter01.item01;

/**
 * 이 클래스의 인스턴스는 #getInstance()를 통해 사용한다.
 * @see #getInstance()
 */
public class Settings {

    private boolean useAutoSteering;

    private boolean useABS;

    private Difficulty difficulty;

    private Settings() {}

    private static final Settings SETTINGS = new Settings();

    public static Settings getInstance() {
        return SETTINGS;
    }

    // Boolean.ValueOf() 의 기능에서 TRUE, FALSE의 인스턴스를 미리 만들어놓음.
    // flyweight 패턴처럼 인스턴스를 통제해 메모리를 아낄 수 있음.


    // 단점 1. 상속이 어렵다
    // Private 형식이라 상속을 받을 수 없다. 생성자를 허용하지 않음.
    // 사용하고 싶으면 class내 또는 method내 Delegate 방식으로 사용해야함.
    // 단점 2. 문서관리가 어렵다 javadoc
}
