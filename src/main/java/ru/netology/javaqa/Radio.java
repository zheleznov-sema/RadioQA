package ru.netology.javaqa;

public class Radio {
    private int currentRadioStationNumber;
    private int currentVolume;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        if (newCurrentRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }


    public void next() {
        currentRadioStationNumber = currentRadioStationNumber + 1;
        if (currentRadioStationNumber > 9) {
            currentRadioStationNumber = 0;
        }
    }

    public void prev() {
        currentRadioStationNumber = currentRadioStationNumber - 1;
        if (currentRadioStationNumber < 0) {
            currentRadioStationNumber = 9;
        }
    }


    public void setMaxWave() {
        currentRadioStationNumber = 9;
    }

    public void setMinWave() {
        currentRadioStationNumber = 0;
    }


    public int getCurrentVolume(){
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void reduseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
