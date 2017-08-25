import org.junit.Test

/**
 * Created by jusurakk on 8/25/17.
 */
class LibraryTest {

    @Test
    void testLibraryInit() {
        Library library = new Library(label: 'Numibia')

        assert library.label == 'numibia'

    }
}
