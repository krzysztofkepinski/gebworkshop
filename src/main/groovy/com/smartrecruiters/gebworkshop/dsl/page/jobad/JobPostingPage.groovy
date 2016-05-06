package com.smartrecruiters.gebworkshop.dsl.page.jobad

import geb.Page


class JobPostingPage extends Page {
    static url = "https://cert.smartrecruiters.com/CartoonNetwork/90012141-designer-designer-designer"

    static at = {
        applyButton.isDisplayed()
    }

    static content = {

        applyButton(wait: true) { $("#st-apply") }
        applyModal(required: false) { $(".js-modal modal-dialog") }
    }

    def applyManually(candidate) {

    }

}
