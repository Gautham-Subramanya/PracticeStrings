public class MultipleOccurances {
    public static void findIndexes(){
        String searchableString = "She sells seashells by the seashore";
        String keyword = "se";

        int index = searchableString.indexOf(keyword);
        while (index >=0){
            System.out.println("Index : "+index + "-"+(index+2));
            index = searchableString.indexOf(keyword, index+keyword.length())   ;
        }

    }

    public static void main(String[] args) {
        findIndexes();
    }
}
