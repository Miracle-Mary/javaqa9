package ru.netology.smart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // тестирование задания количества радиостанций пользователем при условии, что число положительное всегда

    @Test
    public void shouldSetMaxStation() {
        Radio radio = new Radio(100);

        Assertions.assertEquals(99, radio.getMaxStation());
    }

    // тестирование установок радиостанций при конструкторе по умолчанию

    @Test
    public void shouldSetStationBetweenEnds() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationBeforeMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationAboveMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationBeforeMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.nextStation();

        Assertions.assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStationFromMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.nextStation();

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.prevStation();

        Assertions.assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldSetPrevStationFromMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prevStation();

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    //тестирование установок звука

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(45);
        radio.increaseVolume();

        Assertions.assertEquals(46, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeFromMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(45);
        radio.decreaseVolume();

        Assertions.assertEquals(44, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeFromMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeBetweenEnds() {
        Radio radio = new Radio();

        radio.setCurrentVolume(45);

        Assertions.assertEquals(45, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeBeforeMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        Assertions.assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeBeforeMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeAboveMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        Assertions.assertEquals(1, radio.getCurrentVolume());
    }


}
