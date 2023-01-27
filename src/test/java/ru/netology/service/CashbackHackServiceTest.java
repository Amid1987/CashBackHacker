package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateIfAmountCorrect() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }
    @Test
    public void shouldCalculateIfAmountLimit() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual,expected);
    }
    @Test
    public void shouldCalculateIfAmountZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }
    @Test
    public void shouldCalculateIfAmountThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}