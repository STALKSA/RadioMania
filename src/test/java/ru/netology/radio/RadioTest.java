package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {


    @Test
    public void TestSetCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);

        int expected = 8;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestSetCurrentVolumeWithZero() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestSetCurrentVolumeWithMinus() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestSetCurrentVolumeTen() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestSetCurrentVolumeAboveTen() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestSetCurrentVolumeAboveEleven() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestSetCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getСurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestSetCurrentStationMinus() {
        Radio radio = new Radio();

        radio.setCurrentStation(-6);

        int expected = 0;
        int actual = radio.getСurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestSetCurrentStationZero() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getСurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestSetCurrentStationTen() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getСurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestSetCurrentStationMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getСurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestSetCurrentStationAboveTen() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getСurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        radio.nextStation();

        int expected = 9;
        int actual = radio.getСurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestNextStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getСurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestNextStationZero() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.nextStation();

        int expected = 1;
        int actual = radio.getСurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.prevStation();

        int expected = 8;
        int actual = radio.getСurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestPrevStationMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getСurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestPrevStationOne() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        radio.prevStation();

        int expected = 0;
        int actual = radio.getСurrentStation();

        Assertions.assertEquals(expected, actual);
    }

}
