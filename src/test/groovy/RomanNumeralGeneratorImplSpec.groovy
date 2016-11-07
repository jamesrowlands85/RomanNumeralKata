import com.jamesrowlands.roman_numerals.RomanNumeralGeneratorImpl
import spock.lang.Specification

/**
 * Created by James on 31/10/2016.
 */
class RomanNumeralGeneratorImplSpec extends Specification {

    def romanNumeralGenerator
    def setup() {
        romanNumeralGenerator = new RomanNumeralGeneratorImpl();
    }

    def "1 converted to Roman Numeral should equal I"() {
        given:
            def input = 1
            def expectedOutput = "I"
        when:
            def result = romanNumeralGenerator.generateNumeral(input)

        then:
            result == expectedOutput

    }

    def "2 converted to Roman Numerals should equal II"() {
        given:
            def input = 2
            def expectedOutput = "II"
        when:
            def result = romanNumeralGenerator.generateNumeral(input)

        then:
            result == expectedOutput

    }

    def "3 converted to Roman Numerals should equal III"() {
        given:
            def input = 3
            def expectedOutput = "III"
        when:
            def result = romanNumeralGenerator.generateNumeral(input)

        then:
            result == expectedOutput

    }

    def "4 converted to Roman Numerals should equal IV"() {
        given:
            def input = 4
            def expectedOutput = "IV"
        when:
            def result = romanNumeralGenerator.generateNumeral(input)

        then:
            result == expectedOutput

    }

    def "5 converted to Roman Numerals should equal V"() {
        given:
            def input = 5
            def expectedOutput = "V"
        when:
            def result = romanNumeralGenerator.generateNumeral(input)

        then:
            result == expectedOutput

    }

    def "6 converted to Roman Numerals should equal VI"() {
        given:
            def input = 6
            def expectedOutput = "VI"
        when:
            def result = romanNumeralGenerator.generateNumeral(input)

        then:
            result == expectedOutput

    }

    def "9 converted to Roman Numerals should equal IX"() {
        given:
            def input = 9
            def expectedOutput = "IX"
        when:
            def result = romanNumeralGenerator.generateNumeral(input)

        then:
            result == expectedOutput

    }

    def "10 converted to Roman Numerals should equal X"() {
        given:
            def input = 10
            def expectedOutput = "X"
        when:
            def result = romanNumeralGenerator.generateNumeral(input)

        then:
            result == expectedOutput

    }

    def "11 converted to Roman Numerals should equal XI"() {
        given:
            def input = 11
            def expectedOutput = "XI"
        when:
            def result = romanNumeralGenerator.generateNumeral(input)

        then:
            result == expectedOutput

    }

    def "14 converted to Roman Numerals should equal XIV"() {
        given:
            def input = 14
            def expectedOutput = "XIV"
        when:
            def result = romanNumeralGenerator.generateNumeral(input)

        then:
            result == expectedOutput

    }

    def "15 converted to Roman Numerals should equal XV"() {
        given:
            def input = 15
            def expectedOutput = "XV"
        when:
            def result = romanNumeralGenerator.generateNumeral(input)

        then:
            result == expectedOutput

    }

    def "39 converted to Roman Numerals should equal XXXIX"() {
        given:
            def input = 39
            def expectedOutput = "XXXIX"
        when:
            def result = romanNumeralGenerator.generateNumeral(input)

        then:
            result == expectedOutput

    }

    def "40 converted to Roman Numerals should equal XL"() {
        given:
            def input = 40
            def expectedOutput = "XL"
        when:
            def result = romanNumeralGenerator.generateNumeral(input)

        then:
            result == expectedOutput

    }

    def "49 converted to Roman Numerals should equal XLIX"() {
        given:
            def input = 49
            def expectedOutput = "XLIX"
        when:
            def result = romanNumeralGenerator.generateNumeral(input)

        then:
            result == expectedOutput

    }

    def "50 converted to Roman Numerals should equal L"() {
        given:
            def input = 50
            def expectedOutput = "L"
        when:
            def result = romanNumeralGenerator.generateNumeral(input)

        then:
            result == expectedOutput

    }

    def "90 converted to Roman Numerals should equal XC"() {
        given:
            def input = 90
            def expectedOutput = "XC"
        when:
            def result = romanNumeralGenerator.generateNumeral(input)

        then:
            result == expectedOutput

    }

    def "100 converted to Roman Numerals should equal X"() {
        given:
            def input = 100
            def expectedOutput = "C"
        when:
            def result = romanNumeralGenerator.generateNumeral(input)

        then:
            result == expectedOutput

    }

    def "400 converted to Roman Numerals should equal CD"() {
        given:
            def input = 400
            def expectedOutput = "CD"
        when:
            def result = romanNumeralGenerator.generateNumeral(input)

        then:
            result == expectedOutput

    }

    def "450 converted to Roman Numerals should equal LD"() {
        given:
            def input = 450
            def expectedOutput = "LD"
        when:
            def result = romanNumeralGenerator.generateNumeral(input)

        then:
            result == expectedOutput

    }

    def "500 converted to Roman Numerals should equal D"() {
        given:
            def input = 500
            def expectedOutput = "D"
        when:
            def result = romanNumeralGenerator.generateNumeral(input)

        then:
            result == expectedOutput

    }

    def "900 converted to Roman Numerals should equal CM"() {
        given:
            def input = 900
            def expectedOutput = "CM"
        when:
            def result = romanNumeralGenerator.generateNumeral(input)

        then:
            result == expectedOutput

    }

    def "1000 converted to Roman Numerals should equal M"() {
        given:
            def input = 1000
            def expectedOutput = "M"
        when:
            def result = romanNumeralGenerator.generateNumeral(input)

        then:
            result == expectedOutput

    }

    def "3999 converted to Roman Numerals should equal MMMCMXCIX"() {
        given:
            def input = 3999
            def expectedOutput = "MMMCMXCIX"
        when:
            def result = romanNumeralGenerator.generateNumeral(input)

        then:
            result == expectedOutput

    }

    def "0 converted to Roman Numerals should equal error message"() {
        given:
            def input = 0
            def expectedOutput = "number to convert must be between 1 and 3999";
        when:
            def result = romanNumeralGenerator.generateNumeral(input)

        then:
            result == expectedOutput

    }

    def "4000 converted to Roman Numerals should equal error message"() {
        given:
            def input = 4000
            def expectedOutput = "number to convert must be between 1 and 3999";
        when:
            def result = romanNumeralGenerator.generateNumeral(input)

        then:
            result == expectedOutput

    }
}
