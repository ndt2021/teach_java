package chuong2.phan8;

public class Lesson28 {
    public static void main(String[] args) {
        int x = -200;
        int newX = Math.abs(x);
        System.out.println(STR."newX = \{newX}");
        float degree = 90;
        System.out.println(Math.toRadians(degree));
        System.out.println(Math.toDegrees(Math.PI / 2));
        System.out.println(STR."sin(PI / 3) = \{Math.sin(Math.PI / 3)}");
        System.out.println(STR."cos(PI / 3) = \{Math.cos(Math.PI / 3)}");
        System.out.println(STR."tan(PI / 3) = \{Math.tan(Math.PI / 3)}");

        var radius = 125.66;
        var perimeter = 2 * Math.PI * radius;
        var area = Math.PI * Math.pow(radius, 2);
        System.out.println(STR."Chu vi đường tròn bán kính \{radius} = \{perimeter}");
        System.out.println(STR."Diện tích đường tròn bán kính \{radius} = \{area}");

        var a = 200;
        var b = 500;
        System.out.println(STR."min(a, b) = \{Math.min(a, b)}");
        System.out.println(STR."max(a, b) = \{Math.max(a, b)}");
    }
}
