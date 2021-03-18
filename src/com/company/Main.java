package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<s.length();++i){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                int n = s.charAt(i) - '0';
                while(s.charAt(++i) != ' '){
                    n *= 10;
                    n += s.charAt(i);
                }
                st.push(n);
            }
            else if(s.charAt(i) == '+'){
                int b = st.pop();
                int a = st.pop();
                st.push(a + b);
            }
            else if(s.charAt(i) == '-'){
                int b = st.pop();
                int a = st.pop();
                st.push(a - b);
            }
            else if(s.charAt(i) == '*'){
                int b = st.pop();
                int a = st.pop();
                st.push(a * b);
            }
            else if(s.charAt(i) == '/'){
                int b = st.pop();
                int a = st.pop();
                st.push(a / b);
            }
            else if(s.charAt(i) == '^'){
                int b = st.pop();
                int a = st.pop();
                st.push((int) Math.pow(a, b));
            }
        }
        System.out.println(st.pop());
    }
}
