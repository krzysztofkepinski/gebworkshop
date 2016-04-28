package com.smartrecruiters.gebworkshop.dsl.page.jobad

import geb.Page


class JobPostingPage extends Page {
    static url = "https://www.smartrecruiters.com/smartrecruiters/89636157-quality-engineer"

    static at = {
        applyButton.isDisplayed()
    }

    static content = {
        applyButton(wait: true) { $("#st-apply") }
        applyModal(required: false) { $(".js-modal modal-dialog") }
    }

}
