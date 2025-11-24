package ru.netology.javaqa;

public class Radio {
    private int currentVolume;
    private int maxWave = 9;
    private int minWave = 0;
    private int currentRadioStationNumber = minWave;

    public Radio(int count){
        this.minWave = 0;
        this.maxWave = count -1;
        if (count < 1) {
            count = 1;
        }
        this.currentRadioStationNumber = 0;
    }

    public Radio(){
        this(10);
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < minWave) {
            return;
        }
        if (newCurrentRadioStationNumber > maxWave) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }


    public void next() {
        currentRadioStationNumber = currentRadioStationNumber + 1;
        if (currentRadioStationNumber > maxWave) {
            currentRadioStationNumber = minWave;
        }
    }

    public void prev() {
        currentRadioStationNumber = currentRadioStationNumber - 1;
        if (currentRadioStationNumber < minWave) {
            currentRadioStationNumber = maxWave;
        }
    }


    public void setMaxWave() {
        currentRadioStationNumber = maxWave;
    }

    public void setMinWave() {
        currentRadioStationNumber = minWave;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
