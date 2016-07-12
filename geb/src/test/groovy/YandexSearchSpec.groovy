import geb.spock.GebReportingSpec

class YandexSearchSpec extends GebReportingSpec {

    void 'search geb'() {
        given:
        go 'https://ya.ru/'

        when:
        $('#text') << 'gebish.org'
        report "screenshot before click"
        $('button', text: 'Найти').click()
        waitFor { title.contains('gebish.org') }

        then:
        $('h2', text: contains('Very Groovy Browser Automation'), 0).displayed
    }

}
