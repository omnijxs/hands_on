/**
 * Created by jusurakk on 8/31/17.
 */
class Api {

    public String apiMethod(String a, String b, String d){

        String answer

        if(a == b){
            if(b != d){
                answer = b + d
            }
            else {
                answer = a
            }
        } else {
            answer = a + b + d
        }

        return answer

    }
}
