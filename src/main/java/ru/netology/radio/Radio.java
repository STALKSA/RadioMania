package ru.netology.radio;

public class Radio {
    int numberOfCurrentStation;
    int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int getNumberOfCurrentStation() {
        return numberOfCurrentStation;
    }

    public void setNumberOfCurrentStation(int newNumberOfCurrentStation) {
        if (newNumberOfCurrentStation > 9) {
            return;
        }
        if (newNumberOfCurrentStation < 0) {
            return;
        }
        numberOfCurrentStation = newNumberOfCurrentStation;
    }

    public void setMaxStation() {
        numberOfCurrentStation = 9;

    }

    public void setMinStation() {
        numberOfCurrentStation = 0;

    }

    public void nextStation() {
        if (numberOfCurrentStation < 9) {
            numberOfCurrentStation = numberOfCurrentStation + 1;
        }

    }

    public void prevStation() {
        if (numberOfCurrentStation > 0) {
            numberOfCurrentStation = numberOfCurrentStation - 1;
        }
    }

    public void setMaxVolume() {
        currentVolume = 10;
    }

    public void setMinVolume() {
        currentVolume = 0;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
