package com.smartrecruiters.gebworkshop.candidate.apply

import com.smartrecruiters.gebworkshop.dsl.page.jobad.JobPostingPage
import geb.spock.GebSpec


class ApplyManuallyTest extends GebSpec {

    def candidate

    def "should open job posting page"() {
        given:
            to JobPostingPage
        when:
            JobPostingPage.with {
                applyButton.click()
            }
        then:
            JobPostingPage.with {
                applyModal.isDisplayed()
            }
    }

    def "candidate should apply"() {
        given:
            to JobPostingPage
        when:
            JobPostingPage.applyManually(candidate)
        then:
            true
    }
}
