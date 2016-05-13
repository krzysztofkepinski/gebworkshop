package com.smartrecruiters.gebworkshop.candidate.apply

import geb.Module

/**
 * Created by Stanisław Potoczny postan88 on 06/05/16.
 */


class EducationModule extends Module{

    static content = {
        instituton { $("js-education-institution")}
        degree {$("js-education-degree")}
        major {$("js-education-major")}
        educationLocation { $("js-education-location")}
        educationBeginMonth {$("js-education-begin-month")}
        educationBeginYear { $("js-education-begin-year")}
        educationEndMonth { $("js-education-end-month")}
        educationEndYear { $("js-education-end-year")}
    }

    def enterInstitution (insti){
        instituton << insti
    }

    def enterDegree (deg){
         degree << deg
    }

    def enterMajor (maj){
        major << maj
    }

    def enterEducationLocation(loc){
        educationLocation << loc
    }

    def enterEducationBeginMonth (eduBegMon){
        educationBeginMonth << eduBegMon
    }

    def enterEducationBeginYear (eduBegYer){
        educationBeginMonth << eduBegYer
    }
    def enterEducationEndMonth (eduEndMon){
        educationEndMonth << eduEndMon
    }
    def enterEducationEndYear (eduEndYer){
        educationEndYear << eduEndYer
    }

    def fillEducation (Education education){
        enterInstitution(education.institution)
        enterDegree(education.degree)
        enterMajor(education.major)
        enterEducationLocation(education.localization)
        enterEducationBeginMonth(education.educationBeginMonth)
        enterEducationBeginYear(education.educationBeginYear)
        enterEducationEndMonth(education.educationEndmonth)
        enterEducationEndYear(education.educationEndYear)

    }
}
