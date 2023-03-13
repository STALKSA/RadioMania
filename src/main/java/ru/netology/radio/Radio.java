package ru.netology.radio;

public class Radio {
    private int сurrentStation;
    private int currentVolume;
    private int maxStation;

    public Radio() {
        maxStation = 9;
    }

    public Radio(int stationsCount) {
        maxStation = stationsCount - 1;
    }

    public void nextStation() {
        if (сurrentStation != maxStation) {
            сurrentStation = сurrentStation + 1;
        } else {
            сurrentStation = 0;
        }
    }

    public void prevStation() {
        if (сurrentStation != 0) {
            сurrentStation = сurrentStation - 1;
        } else {
            сurrentStation = maxStation;
        }
    }

    public int getСurrentStation() {
        return сurrentStation;
    }

    public void setCurrentStation(int сurrentStation) {
        if (сurrentStation < 0) {
            return;
        }
        if (сurrentStation > maxStation) {
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
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

}
