import org.junit.Test

/**
 * Created by jusurakk on 8/31/17.
 */
class ApiTest {

    @Test
    void testApiMethod_1() {
        Api api = new Api()

        String response = api.apiMethod('foo', 'bar', 'baz')

        assert response == 'foobarbaz'
    }

    @Test
    void testApiMethod_2() {
        Api api = new Api()

        String response = api.apiMethod('foo', 'foo', 'bar')

        assert response == 'foobar'
    }

    @Test
    void testApiMethod_3() {
        Api api = new Api()

        String response = api.apiMethod('foo', 'foo', 'foo')

        assert response == 'foo'
    }

    @Test
    void testApiMethod_4() {
        Api api = new Api()

        String response = api.apiMethod(null, 'foo', 'foo')

        assert response == 'No empty values allowed'
    }
}
