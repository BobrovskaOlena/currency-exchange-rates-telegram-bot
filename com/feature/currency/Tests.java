package com.feature.currency;

public class Tests {
    public static void main(String[] args) {
        PrintCurrencyService printCurrencyService = new PrintCurrencyService();
        String convert1 = printCurrencyService.convert(printCurrencyService.salesRates(Currency.USD), printCurrencyService.purchaseRates(Currency.USD), Currency.USD);
        System.out.println(convert1);
    }
}
