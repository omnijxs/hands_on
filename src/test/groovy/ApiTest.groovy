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
    void testApiMethod_1() {

        String response = api.apiMethod('foo', 'bar', 'baz')

        assert response == 'foobarbaz'
    }

    @Test
    void testApiMethod_2() {

        String response = api.apiMethod('foo', 'foo', 'bar')

        assert response == 'foobar'
    }

    @Test
    void testApiMethod_3() {

        String response = api.apiMethod('foo', 'foo', 'foo')

        assert response == 'foo'
    }
}
