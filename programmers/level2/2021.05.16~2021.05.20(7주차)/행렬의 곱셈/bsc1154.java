class Solution {
      public int[][] solution(int[][] arr1, int[][] arr2) {
          int[][] answer = new int[arr1.length][arr2[0].length];

          for(int i = 0 ; i < arr1.length ; ++i){//  3    결과 행수
              for(int j = 0 ; j < arr2[0].length ; ++j){//2 결과 열수 
                  for(int k = 0 ; k < arr1[0].length ; ++k) {//2 계산 반복 (곱한수를 +)
                      answer[i][j] += arr1[i][k] * arr2[k][j];
                  }
              }
          }

          return answer;
      }
  }
