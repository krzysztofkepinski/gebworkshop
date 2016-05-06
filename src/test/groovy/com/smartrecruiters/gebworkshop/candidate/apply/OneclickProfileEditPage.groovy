package com.smartrecruiters.gebworkshop.candidate.apply

import geb.Page


class OneclickProfileEditPage  extends Page {

    static content = {
        personalDataModule { module PersonalDataModule }
        educationModule { module EducationModule }
        experienceModule { module ExperienceModule }
        onTheWebModule { module OnTheWebModule }
        companyLogo { ${ "#js-logo-container" } }
        messageHiringManager { $( "#js-message" ) }

    }

    def fillInPersonalData(PersonalData personalData) {
        personalDataModule.fillInPersonalData(personalData)
    }
}
