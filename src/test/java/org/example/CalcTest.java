package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @ParameterizedTest(name = "#{index} - сложение {0} и {1} равно {2}")
    @DisplayName("Проверка суммирования")
    @CsvSource({"2,3,5", "5,4,9", "1,2,3"})
    @Tag("Сложение")
    void summ(int a, int b, int expSum) {
        Calc calc = new Calc();
        int resultSum = calc.summ(a, b);
        Assertions.assertEquals(expSum, resultSum, "Не тот ответ при сложении");
    }


    @ParameterizedTest(name = "#{index} - разность {0} и {1} равна {2}")
    @DisplayName("Проверка вычитания")
    @CsvSource({"7,3,4", "5,4,1", "6,2,4"})
    @Tag("Разность")
    void diff(int f, int d, int expDif){
        Calc calc = new Calc();
        int resultDif = calc.diff(f, d);
        Assertions.assertEquals(expDif, resultDif, "Не тот ответ при вычитании");
    }
}