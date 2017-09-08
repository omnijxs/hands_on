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
}
