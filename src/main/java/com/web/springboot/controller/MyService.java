package com.web.springboot.controller;

import com.web.springboot.model.ExpandNumber;
import com.web.springboot.model.LexiographicSearch;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MyService {
    /**
     * Method to find substrings from array a1 in array a2
     * @param a1 array of sub strings
     * @param a2 array of strings
     * @return Collection of substrings a1 founded in a2 in alphabetic order
     */
    public String executeFirstTaskWeb(String a1, String a2) {
        try {
            String[] a1Array = formatSingleStringTask1(a1);
            String[] a2Array = formatSingleStringTask1(a2);
            Collection<String> collection = new LexiographicSearch().doLexiographicSearch(a1Array, a2Array);
            if (collection.size() == 0) {
                return "no matches";
            }
            StringBuilder builder = new StringBuilder("");
            builder.append("substrings are -  ");
            for (String string : collection) {
                builder.append(string+", ");
            }
            return builder.substring(0,builder.length()-2);
        } catch (RuntimeException e) {
            return e.getMessage();
        }
    }

    /**
     * Method get result of executing task 2
     *
     * @param unformattedString String from textbox
     * @return answer as string to place in textbox
     * @throws RuntimeException throws Exception if input format is invalid
     */
    public String executeSecondTask(String unformattedString) throws RuntimeException {
        try {
            Integer.parseInt(unformattedString);
        } catch (RuntimeException e) {
            return e.getMessage();
        }
        return new ExpandNumber().expandNumber(unformattedString);
    }

    private String[] formatSingleStringTask1(String string) throws RuntimeException {
        String[] array = string.split("\\[\"|\"\\]|\",\\s\"");
        if (array.length == 0) {
            throw new RuntimeException("Не обнаружены элементы массива");
        }
        // Return elements without first, like a1 =
        String[] result = new String[array.length - 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = array[i + 1];
        }
        return result;
    }
}
