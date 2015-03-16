
public class ConditionalTest {

    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        int result;
        boolean someCondition = false;
        result = someCondition ? value1 : value2;  //result will equal value 1 if someCondition=true, value2 if false

        System.out.println(result);
    }
}
