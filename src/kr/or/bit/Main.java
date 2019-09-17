package kr.or.bit;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());//총시행횟수;
        int count = 0;//그룹단어 갯수 초기화;
        for (int p = 0; p < n; p++) {//총 n회 시행
            char[] word = br.readLine().trim().toCharArray();//입력받은 단어 char배열로
            if(word.length == 0) continue;
            ArrayList<Integer>[] alpha = new ArrayList[26];//a-z까지 총 26, 0번방에는 a가 몇번째 위치에 나오는지 담음
            for (int i = 0; i < 26; i++) {//ArrayList 선언
                alpha[i] = new ArrayList<Integer>();
            }
            boolean check = true;//그룹단어 인지 체크
            for (int i = 0; i < word.length; i++) {//입력받은 단어의 각 문자의 위치를 ArrayList 배열에 다음
                alpha[word[i] - 'a'].add(i);
            }

            for (int i = 0; i < 26; i++) {//ArrayList 배열 조회
                if (alpha[i].size() == 0 || alpha[i].size() == 1) continue;
                for (int j = 0; j < alpha[i].size() - 1; j++) {
                    if (alpha[i].get(j + 1) - alpha[i].get(j) != 1) {//각 ArrayList의 앞 뒤 값 차이가 1인지 확인
                        check = false;//아니라면 그룹단어가 아님
                        break;//다음 어레이 리스트 조회
                    }
                }
            }
            if (check) count += 1;
        }
        bw.write(String.valueOf(count));
        br.close();
        bw.close();
    }

}