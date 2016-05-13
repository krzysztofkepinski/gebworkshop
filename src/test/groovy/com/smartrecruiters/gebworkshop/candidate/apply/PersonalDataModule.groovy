package com.smartrecruiters.gebworkshop.candidate.apply

import geb.Module

/**
 * Created by krzysztofkepinski on 06/05/16.
 */


class PersonalDataModule extends Module{
    static content = {
        firstNameInput { $("#js-first-name-edit")}
        lastNameInput { $("#js-last-name-edit")}
        emailInput { $("#js-email")}
    }

    def enterFirstName (firstName){
        firstNameInput << firstName
    }
    def enterLastName (lastName){
        lastNameInput << lastName
    }
    def enterEmail (email){
        emailInput << email
    }

    def fillInPersonalData(personalData){
        enterFirstName(personalData.firstName)
        enterLastName(personalData.lastName)
        enterEmail(personalData.email)
    }



}
