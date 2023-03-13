package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void testStationCount(){
        Radio radio = new Radio(20);

        radio.setCurrentStation(15);

        int expected = 15;
        int actual = radio.getСurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationCountWithMinusStation(){
        Radio radio = new Radio(10);

        radio.setCurrentStation(-15);

        int expected = 0;
        int actual = radio.getСurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationCountWithMinusCount(){
        Radio radio = new Radio(-10);

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getСurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(88);

        int expected = 88;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentVolumeWithZero() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentVolumeWithMinus() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentVolumeHundred() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentVolumeAboveHundredOne() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getСurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentStationMinus() {
        Radio radio = new Radio();

        radio.setCurrentStation(-6);

        int expected = 0;
        int actual = radio.getСurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentStationZero() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getСurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentStationTen() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getСurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentStationMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getСurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentStationAboveTen() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getСurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        radio.nextStation();

        int expected = 9;
        int actual = radio.getСurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getСurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStationZero() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.nextStation();

        int expected = 1;
        int actual = radio.getСurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.prevStation();

        int expected = 8;
        int actual = radio.getСurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStationMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getСurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStationOne() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        radio.prevStation();

        int expected = 0;
        int actual = radio.getСurrentStation();

        Assertions.assertEquals(expected, actual);
    }

}
