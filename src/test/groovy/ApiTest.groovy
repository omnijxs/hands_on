import org.junit.Test
import org.junit.Before

/**
 * Created by jusurakk on 8/31/17.
 */
class ApiTest {
    Api api

    @Before
    void setup(){
        api = new Api()
    }

    @Test
    void testApiMethodReturnsDifferentParametersJoined () {
        String response = api.apiMethod('foo', 'bar', 'baz')
        assert response == 'foobarbaz'
    }

    @Test
    void testApiMethodReturnsOnlyDifferentParametersJoined() {
        String response = api.apiMethod('foo', 'foo', 'bar')
        assert response == 'foobar'
    }

    @Test
    void testApiMethodReturnOnlyOneParameterWhenGivenParametersAreSame() {
        String response = api.apiMethod('foo', 'foo', 'foo')
        assert response == 'foo'
    }

    @Test
    void testApiMethodReturnReverseReturnOriginalApiMethodResultWhenFalse(){

        String response = api.apiMethodReturnReverse('foo', 'bar', 'baz', false)
        assert response == 'foobarbaz'
    }

    @Test
    void testApiMethodReturnReverseReturnsReversedApiMethodResultWhenTrue(){
        String response = api.apiMethodReturnReverse('foo', 'bar', 'baz', true)
        assert response == 'bazbarfoo'
    }

    @Test
    void testApiMethodReturnReverseReturnsTwoStringsReversedApiMethodResultWhenTrue(){
        String response = api.apiMethodReturnReverse('nakki', 'seilaa', 'seilaa', true)
        assert response == 'seilaanakki'
    }

    @Test
    void testApiMethodReturnReverseReturnsOneStringReversedApiMethodResultWhenTrue(){
        String response = api.apiMethodReturnReverse('nakki', 'nakki', 'nakki', true)
        assert response == 'nakki'
    }

    @Test
    void testUniqueStringsReturnsThreeGivenStringsInOrderWithoutDuplicates(){
        String[] response = api.uniqueStrings(['foo', 'bar', 'baz'])
        assert response == ['foo', 'bar', 'baz']
    }

    @Test
    void testUniqueStringsReturnsTwoGivenStringsInOrderWithoutDuplicates(){
        String[] response = api.uniqueStrings(['foo', 'bar', 'foo'])
        assert response == ['foo', 'bar']
    }

}
