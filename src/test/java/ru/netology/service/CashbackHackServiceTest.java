package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateIfAmountCorrect() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected, "Вам осталось купить на 100 рублей");
    }
    @Test
    public void shouldCalculateIfAmountLimit() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual,expected, "Вам осталось купить на 999 рублей");
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
    public void shouldCalculateIfAmountNegative() {
        CashbackHackService service = new CashbackHackService();
        int amount = -300;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}