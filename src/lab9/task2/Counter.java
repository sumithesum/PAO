package lab9.task2;

import java.util.*;

public class Counter implements WordCounter {

    Map<String,Integer> wordCount = new HashMap<>();

    @Override
    public void parse(String text) {
        for (String word : text.split("[.,\\s+]")) {
            if (word.isEmpty()) {
                continue;
            }
            if ( wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
    }

    @Override
    public int getCount(String word) {
        return   wordCount.get(word);
    }

    @Override
    public SortedSet<String> getUniqueWords() {
        SortedSet<String> words = new TreeSet<>();
        for (String word : wordCount.keySet())
            if (wordCount.get(word) == 1)
                words.add(word);

        return words;

    }

    @Override
    public void printWordCounts(){
        System.out.println(wordCount);

    }

    @Override
    public void reset() {
        wordCount.clear();
    }
}
