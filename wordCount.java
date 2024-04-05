import java.util.HashMap;
class wordCount {
    public static HashMap<String, Integer> countWords(String str) 
		{
        String[] words = str.split("\\s+");
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        
        for (String word : words) 
			{
            String lowercaseWord = word.toLowerCase();
            
            if (wordCountMap.containsKey(lowercaseWord)) 
				{
                wordCountMap.put(lowercaseWord, wordCountMap.get(lowercaseWord) + 1);
            }
			else {
                wordCountMap.put(lowercaseWord, 1);
            }
        }
        
        return wordCountMap;
    }

    public static void main(String[] args) {
        String str = "This is a sample string with some sample words. Sample words are counted.";
        HashMap<String, Integer> wordCountMap = countWords(str);
        
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + " : " + wordCountMap.get(word));
        }
    }
}
