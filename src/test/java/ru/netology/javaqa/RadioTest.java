package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void shouldSetValidStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationToZero() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationToNine() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIgnoreStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(5);
        radio.setCurrentRadioStationNumber(15);

        int expected = 5;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIgnoreStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(5);
        radio.setCurrentRadioStationNumber(-1);

        int expected = 5;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetMaxWave() {
        Radio radio = new Radio();
        radio.setMaxWave();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinWave() {
        Radio radio = new Radio();
        radio.setMinWave();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNextStationInsideRange() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(5);

        radio.next();

        int expected = 6;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationFromNineToZero() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldPrevStationInsideRange() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(5);

        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationFromZeroToNine() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseVolumeInsideRange() {
        Radio radio = new Radio();
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeAboveMax() {
        Radio radio = new Radio();

        for (int i = 0; i < 100; i++) {
            radio.increaseVolume();
        }

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldReduceVolumeInsideRange() {
        Radio radio = new Radio();

        radio.increaseVolume();
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReduceVolumeBelowZero() {
        Radio radio = new Radio();

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationsCountConstructor(){
        Radio radio = new Radio(30);
        radio.setCurrentRadioStationNumber(29);

        int exepted = 29;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(exepted, actual);
    }

    @Test
    public void shouldWrapFromLastToZeroWithCustomCount() {
        Radio radio = new Radio(30);
        radio.setCurrentRadioStationNumber(29);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldHandleCountLessThanOne() {
        Radio radio = new Radio(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


}