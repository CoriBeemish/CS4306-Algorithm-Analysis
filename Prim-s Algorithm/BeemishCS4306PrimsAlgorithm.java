// FILE: BeemishPrimsAlgorithm.java
// AUTHOR: Cori Beemish
// DATE: March 20th, 2018

import java.util.ArrayList;
import java.util.List;

public class BeemishCS4306PrimsAlgorithm {
    public static void main(String[] args) {

        int [][] adjMatrix = {
                //   1  2  3  4  5  6  7  8  9  10
                {Integer.MAX_VALUE, 1, 4, 4, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE}, //1
                {1, Integer.MAX_VALUE, 3, 5, 9, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE}, //2
                {4, 3, Integer.MAX_VALUE, Integer.MAX_VALUE, 10, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 18}, //3
                {4, 5, Integer.MAX_VALUE, Integer.MAX_VALUE, 7, 9, 9, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE}, //4
                {Integer.MAX_VALUE, 9, 10, 7, Integer.MAX_VALUE, Integer.MAX_VALUE, 8, 9, Integer.MAX_VALUE, 8}, //5
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 9, Integer.MAX_VALUE, Integer.MAX_VALUE, 2, 4, 6, Integer.MAX_VALUE}, //6
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 9, 8, 2, Integer.MAX_VALUE, 2, Integer.MAX_VALUE, Integer.MAX_VALUE}, //7
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 9, 4, 2, Integer.MAX_VALUE, 3, 9}, //8
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 6, Integer.MAX_VALUE, 3, Integer.MAX_VALUE, 9}, //9
                {Integer.MAX_VALUE, Integer.MAX_VALUE, 18, Integer.MAX_VALUE, 8, Integer.MAX_VALUE, Integer.MAX_VALUE, 9, 9, Integer.MAX_VALUE} //10
        };
        int totalVertices = 10;
        int primWeight = 0;
        int w = 0;
        int minWeight;

        List<Integer> visitedVertices = new ArrayList<>();
        visitedVertices.add(0);

        while(visitedVertices.size() != totalVertices) {
            minWeight = Integer.MAX_VALUE;
            for(int i : visitedVertices) {
                for(int j = 0 ; j < totalVertices; ++j ){
                    if(minWeight > adjMatrix[i][j] && !visitedVertices.contains(j)){
                        minWeight = adjMatrix[i][j];
                        w = j;
                    }
                }
            }
            visitedVertices.add(w);
            primWeight += minWeight;
        }
        System.out.printf("Prim's total weight = %d \n",primWeight);
        System.out.printf("Vertices visited = %s",visitedVertices.toString());
    }
}