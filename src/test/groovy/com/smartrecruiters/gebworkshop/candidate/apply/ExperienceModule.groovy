package com.smartrecruiters.gebworkshop.candidate.apply

import geb.Module

/**
 * Created by Stnislaw Potoczny postan88 on 06/05/16.
 */
class ExperienceModule extends Module {

    static content ={

        occupation {$("js-work-position")}
        city {$("js-work-location")}
        company {$("js-work-employer")}
        workBeginMonth {$("js-work-begin-month")}
        workBeginYear {$("js-work-begin-year")}
        workEndMonth {$("js-work-end-month")}
        workEndYear {$("js-work-end-year")}


    }

    def enterOcupation (ocupa){
        occupation << ocupa

    }

    def enterCity (cit){
        city << cit
    }

    def enterCompany (comp) {
        company << comp
    }

    def enterWorkBeginMonth (entWoBeMo){
        workBeginMonth << entWoBeMo
    }

    def enterWorkBeginYear (entWoBeYe){
        workBeginYear << entWoBeYe
    }

    def enterWorkEndYear (entWoEnYe){
        workEndYear << entWoEnYe
    }

    def enterWorkEndMonth (entWoEnMo){
        workEndMonth << entWoEnMo
    }

    def fillExperience (Experience experience) {

        enterOcupation(experience.occupation)
        enterCity(experience.city)
        enterCompany(experience.city)
        enterWorkBeginMonth(experience.workBeginMonth)
        enterWorkEndMonth(experience.workEndMonth)
        enterWorkEndYear(experience.workEndYear)
        enterWorkBeginYear(experience.workBeginYear)

    }
}
