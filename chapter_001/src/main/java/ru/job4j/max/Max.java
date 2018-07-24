    package ru.job4j.max;
     public class Max {
         public int max(int first, int second, int third) {
             int temp = this.max(first, second);
             return this.max(temp, third);
         }

         public int max(int first, int second) {
             return first > second ? first : second;
         }
     }