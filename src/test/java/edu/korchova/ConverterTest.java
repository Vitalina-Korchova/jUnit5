package edu.korchova;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/*
    @author Віталіна
    @project Lab3
    @class ConverterTest
    @version 1.0.0
    @since 23.03.2025 - 18-54
*/

class ConverterTest {

    @Test
    void whenArabic_3_ThenRoman_III() {
        Assertions.assertEquals("III", Converter.convertArabicToRoman(3));
    }

    @Test
    void whenArabic_10_ThenRoman_X() {
        Assertions.assertEquals("X", Converter.convertArabicToRoman(10));
    }

    @Test
    void whenArabic_14_ThenRoman_XIV() {
        Assertions.assertEquals("XIV", Converter.convertArabicToRoman(14));
    }

    @Test
    void whenArabic_18_ThenRoman_XVIII() {
        Assertions.assertEquals("XVIII", Converter.convertArabicToRoman(18));
    }

    @Test
    void whenArabic_19_ThenRoman_XIX() {
        Assertions.assertEquals("XIX", Converter.convertArabicToRoman(19));
    }

    @Test
    void whenArabic_20_ThenRoman_XX() {
        Assertions.assertEquals("XX", Converter.convertArabicToRoman(20));
    }

    @Test
    void whenArabic_28_ThenRoman_XXVIII() {
        Assertions.assertEquals("XXVIII", Converter.convertArabicToRoman(28));
    }

    @Test
    void whenArabic_38_ThenRoman_XXXVIII() {
        Assertions.assertEquals("XXXVIII", Converter.convertArabicToRoman(38));
    }

    @Test
    void whenArabic_40_ThenRoman_XL() {
        Assertions.assertEquals("XL", Converter.convertArabicToRoman(40));
    }

    @Test
    void whenArabic_48_ThenRoman_XLVIII() {
        Assertions.assertEquals("XLVIII", Converter.convertArabicToRoman(48));
    }

    @Test
    void whenArabic_50_ThenRoman_L() {
        Assertions.assertEquals("L", Converter.convertArabicToRoman(50));
    }

    @Test
    void whenArabic_58_ThenRoman_LVIII() {
        Assertions.assertEquals("LVIII", Converter.convertArabicToRoman(58));
    }

    @Test
    void whenArabic_69_ThenRoman_LXIX() {
        Assertions.assertEquals("LXIX", Converter.convertArabicToRoman(69));
    }

    @Test
    void whenArabic_88_ThenRoman_LXXXVIII() {
        Assertions.assertEquals("LXXXVIII", Converter.convertArabicToRoman(88));
    }

    @Test
    void whenArabic_100_ThenRoman_C() {
        Assertions.assertEquals("C", Converter.convertArabicToRoman(100));
    }

    @Test
    void whenArabic_108_ThenRoman_CVIII() {
        Assertions.assertEquals("CVIII", Converter.convertArabicToRoman(108));
    }

    @Test
    void whenArabic_124_ThenRoman_CXXIV() {
        Assertions.assertEquals("CXXIV", Converter.convertArabicToRoman(124));
    }

    @Test
    void whenArabic_159_ThenRoman_CLIX() {
        Assertions.assertEquals("CLIX", Converter.convertArabicToRoman(159));
    }

    @Test
    void whenArabic_185_ThenRoman_CLXXXV() {
        Assertions.assertEquals("CLXXXV", Converter.convertArabicToRoman(185));
    }

    @Test
    void whenArabic_190_ThenRoman_CXC() {
        Assertions.assertEquals("CXC", Converter.convertArabicToRoman(190));
    }

    @Test
    void whenArabic_200_ThenRoman_CC() {
        Assertions.assertEquals("CC", Converter.convertArabicToRoman(200));
    }

    @Test
    void whenArabic_250_ThenRoman_CCL() {
        Assertions.assertEquals("CCL", Converter.convertArabicToRoman(250));
    }

    @Test
    void whenArabic_409_ThenRoman_CDIV() {
        Assertions.assertEquals("CDIX", Converter.convertArabicToRoman(409));
    }

    @Test
    void whenArabic_595_ThenRoman_DXCV() {
        Assertions.assertEquals("DXCV", Converter.convertArabicToRoman(595));
    }

    @Test
    void whenArabic_1598_ThenRoman_MDXCIII() {
        Assertions.assertEquals("MDXCVIII", Converter.convertArabicToRoman(1598));
    }

}