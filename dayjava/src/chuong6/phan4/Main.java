package chuong6.phan4;

public class Main {
    public static void main(String[] args) {

        Season season1 = Season.SUMMER;
        System.out.println(season1.getSeasonName());

        Season season2 = Season.WINTER;
        System.out.println(season2.getSeasonName());

    }

    enum Season {
        SPRING("MÙA XUÂN"),
        SUMMER("MÙA HẠ"),
        FALL("MÙA THU"),
        WINTER("MÙA ĐÔNG");

        private final String seasonName;

        Season(String name) {
            seasonName = name;
        }
        public String getSeasonName() {
            return seasonName;
        }
    }

}
