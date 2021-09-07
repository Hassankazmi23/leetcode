package leetcode.arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        if(numRows == 0) {
            return result;
        }

        result.add(Arrays.asList(1));

        for(int i = 1; i < numRows; i++ ) {
            List<Integer> currList = new ArrayList<>();
            currList.add(1);
            List<Integer> prevList = result.get(i -1);
            for(int j = 1; j < i; j++) {
                currList.add(prevList.get(j-1) + prevList.get(j));
            }
            currList.add(1);
            result.add(currList);
        }

        return result;

    }
}
