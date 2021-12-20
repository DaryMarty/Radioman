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
    public void shouldSetRadioWithValue() {
        Radio radio = new Radio(16);
        radio.setCurrentRadioStation(11);
        assertEquals(11, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldCheckAboveMaxStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldCheckAboveMaxStationWithValue() {
        Radio radio = new Radio(16);
        radio.setCurrentRadioStation(16);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldCheckBelowMinStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldCheckBelowMinStationWithValue() {
        Radio radio = new Radio(16);
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
    public void shouldSwitchNextStationWithValue() {
        Radio radio = new Radio(16);
        radio.setCurrentRadioStation(14);
        radio.nextRadioStation();
        assertEquals(15, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchMaxStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchMaxStationWithValue() {
        Radio radio = new Radio(16);
        radio.setCurrentRadioStation(15);
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
    public void shouldSwitchPrevStationWithValue() {
        Radio radio = new Radio(16);
        radio.setCurrentRadioStation(15);
        radio.prevRadioStation();
        assertEquals(14, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchPrevMinStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchPrevMinStationWithValue() {
        Radio radio = new Radio(16);
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        assertEquals(15, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSoundVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(50);
        assertEquals(50, radio.getSoundVolume());
    }

    @Test
    public void shouldCheckAboveMaxVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(101);
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
        radio.setSoundVolume(99);
        radio.increaseVolume();
        assertEquals(100, radio.getSoundVolume());
    }

    @Test
    public void shouldIncreaseMaxVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getSoundVolume());
    }


    @Test
    public void shouldTurnDownVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(50);
        radio.turnDownVolume();
        assertEquals(49, radio.getSoundVolume());
    }

    @Test
    public void shouldTurnDownMinVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);
        radio.turnDownVolume();
        assertEquals(0, radio.getSoundVolume());
    }

}
