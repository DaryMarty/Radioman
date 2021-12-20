package ru.netology.domian;

public class Radio {
    private int currentRadioStation;
    private int soundVolume;
    private int NumberOfRadioStation = 10;

    public Radio(int numberOfRadioStation) {
        NumberOfRadioStation = numberOfRadioStation;
    }

    public Radio() {
    }

    public int getNumberOfRadioStation() {
        return NumberOfRadioStation;
    }

    public void setNumberOfRadioStation(int NumberOfRadioStation) {
        this.NumberOfRadioStation = NumberOfRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        int maxNumberRadio = this.NumberOfRadioStation - 1;
        if (currentRadioStation > maxNumberRadio) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextRadioStation() {
        int maxNumberRadio = this.NumberOfRadioStation - 1;
        if (currentRadioStation == maxNumberRadio) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public void prevRadioStation() {
        int maxNumberRadio = this.NumberOfRadioStation - 1;
        if (currentRadioStation == 0) {
            currentRadioStation = maxNumberRadio;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume > 100) {
            return;
        }
        if (soundVolume < 0) {
            return;
        }
        this.soundVolume = soundVolume;
    }

    public void increaseVolume() {
        if (soundVolume < 100) {
            soundVolume = soundVolume + 1;
        }
    }

    public void turnDownVolume() {
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        }
    }

}

