public class WordReplace {

    public static String replaceWord(String sentence, String target, String replacement) {
        // Replace all occurrences of 'target' with 'replacement'
        return sentence.replace(target, replacement);
    }

    public static void main(String[] args) {
        String sentence = "The cat jumped over the cat.";
        String target = "cat";
        String replacement = "maha";

        String result = replaceWord(sentence, target, replacement);
        System.out.println(result); // Output: The dog jumped over the dog.
    }
}
