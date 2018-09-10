package ru.lember.petfriend.entities.organization;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private Double price;
    private PriceUnit priceUnit;
    private PricePeriod pricePeriod;
    private List<PaymentType> paymentTypes = new ArrayList<>();
}
