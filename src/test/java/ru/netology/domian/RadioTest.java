package ru.netology.domian;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldCheckAboveMaxStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldCheckBelowMinStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchNextStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.nextRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchMaxStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.prevRadioStation();
        assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchPrevMinStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSoundVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(9);
        assertEquals(9, radio.getSoundVolume());
    }

    @Test
    public void shouldCheckAboveMaxVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(11);
        assertEquals(0, radio.getSoundVolume());
    }

    @Test
    public void shouldCheckBelowMinVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(-1);
        assertEquals(0, radio.getSoundVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(9);
        radio.increaseVolume();
        assertEquals(10, radio.getSoundVolume());
    }

    @Test
    public void shouldIncreaseMaxVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getSoundVolume());
    }


    @Test
    public void shouldTurnDownVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(5);
        radio.turnDownVolume();
        assertEquals(4, radio.getSoundVolume());
    }

    @Test
    public void shouldTurnDownMinVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);
        radio.turnDownVolume();
        assertEquals(0, radio.getSoundVolume());
    }

}
