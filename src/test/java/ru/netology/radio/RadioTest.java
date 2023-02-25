package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    @Test
    public void TestSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);

        int expected = 8;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetMaxVolume() {
        Radio radio = new Radio();

        radio.setMaxVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetMinVolume() {
        Radio radio = new Radio();

        radio.setMinVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestSetStation() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(8);

        int expected = 8;
        int actual = radio.getNumberOfCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testShouldNotSetStationAboveMax() {
        Radio radio = new Radio();

        radio.setMaxStation();

        int expected = 9;
        int actual = radio.getNumberOfCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testShouldNotSetStationLessMin() {
        Radio radio = new Radio();

        radio.setMinStation();

        int expected = 0;
        int actual = radio.getNumberOfCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testShouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testShouldNotSetVolumeLessMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testShouldIncreaseVolumePlusOne() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);

        radio.increaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testShouldReduceVolumeMinusOne() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);

        radio.reduceVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testShouldIncreaseStationPlusOne() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(5);

        radio.nextStation();

        int expected = 6;
        int actual = radio.getNumberOfCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testShouldReduceStationMinusOne() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentStation(5);

        radio.prevStation();

        int expected = 4;
        int actual = radio.getNumberOfCurrentStation();

        Assertions.assertEquals(expected, actual);

    }
}
