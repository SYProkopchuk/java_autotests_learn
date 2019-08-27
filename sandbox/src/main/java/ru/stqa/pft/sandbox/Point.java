package ru.stqa.pft.sandbox;


public class Point {
     int pointA;
     int pointB;
     public Point (int pointA, int pointB) {
         this.pointA=pointA;
         this.pointB=pointB;
     }

     public int lenghtBetweenPoints() {
         if(pointA>pointB){
            return (pointA-pointB);
         } else {
             return (pointB-pointA);
         }
     }
    }

