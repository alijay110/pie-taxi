package com.pszymczyk.pietaxi;

import org.springframework.stereotype.Component;

@Component
class FakeBillingApi implements BillingApi {

    @Override
    public Status checkPassengerAccount(PassengerId passengerId) {
        return Status.OK;
    }
}