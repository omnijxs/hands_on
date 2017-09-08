/**
 * Created by jusurakk on 8/31/17.
 */
class Api {

    public String apiMethod(String a, String b, String c){
        List<String> strings = uniqueStrings([a, b, c])
        return strings.join()
    }

    public String apiMethodReturnReverse(String a, String b, String c, boolean reverse) {
        return reverse ? apiMethod(c, b, a) : apiMethod(a, b, c)
    }

    private List<String> uniqueStrings(List<String> strings){
        return strings.unique()
    }
}
