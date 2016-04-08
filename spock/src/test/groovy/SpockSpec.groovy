import spock.lang.Specification
import spock.lang.Unroll

@Unroll
public class SpockSpec extends Specification {

    @Unroll
    def "#a + #b = #c"() {
        expect:
        a + b == c

        where:
        a  | b  || c
        1  | 1  || 2
        2  | 2  || 4
        -1 | -1 || -2
    }

}
