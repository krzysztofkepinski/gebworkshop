package com.smartrecruiters.gebworkshop.candidate.apply

/**
 * Created by postan88 on 12/05/16.
 */
class OnTheWebModule extends geb.Module {

    static content ={

        linkedIn {$("js-linkedin")}
        facebook {$("js-facebook")}
        twitter {$("js-twitter")}

    }
    def fillLinkedIn (linIn){
        linkedIn << linIn
    }

    def fillFacebook (faceB){
        facebook << faceB
    }

    def fillTwitter (twitt){
        twitter << twitt
    }

    def  fillOnTheModule  (OnTheWeb onTheWeb){

        fillLinkedIn( onTheWeb.linkedIn)
        fillFacebook(onTheWeb.facebook)
        fillTwitter(onTheWeb.twitter)

    }

}
