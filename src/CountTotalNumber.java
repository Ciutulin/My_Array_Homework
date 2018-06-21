public class CountTotalNumber {
    
    public static void main(String args[]){
        String test = "Ana are mere si alune. Alina are si ea ananas si portocale";
        char letter = 'a';
        count(test, letter);
    }

    private static void count(String test1, char letter) {
        char[] ch = test1.toCharArray();
        int total = 0;
        for(int i=0; i<test1.length(); i++){

            if(ch[i]==letter){

                total++;
            }
        }
        System.out.println("Letter a appear " + total + " times in string");
    }
}
