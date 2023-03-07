package ru.netology.radio;

public class Radio {
    private int сurrentStation;
    private int currentVolume;

    public void nextStation() {
        if (сurrentStation != 9) {
            сurrentStation = сurrentStation + 1;
        } else {
            сurrentStation = 0;
        }
    }

    public void prevStation() {
        if (сurrentStation != 0) {
            сurrentStation = сurrentStation - 1;
        } else {
            сurrentStation = 9;
        }
    }

    public int getСurrentStation() {
        return сurrentStation;
    }

    public void setCurrentStation(int сurrentStation) {
        if (сurrentStation < 0) {
            return;
        }
        if (сurrentStation > 9) {
            return;
        }
        this.сurrentStation = сurrentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

}
