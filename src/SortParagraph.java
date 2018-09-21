import java.util.Arrays;

public class SortParagraph {
    public static void main(String[] args) {
        String str = "A paragraph is a self-contained unit of a discourse in writing dealing with a particular point or idea." +
                " A paragraph consists of one or more sentences. Though not required by the syntax of any language, paragraphs are usually an expected part of formal writing, used to organize longer prose.";

        String[] input = str.split(" ");
        Arrays.sort(input);
        System.out.println(Arrays.toString(input));
    }
}
