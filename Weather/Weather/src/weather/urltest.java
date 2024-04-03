package weather;

public class urltest {
    public static void main(String[] args) {
    	TodayNow today = new TodayNow();
        Hour514 time = new Hour514();
        String serviceKey = "1jdnhESiJyvL8T7ZVy%2FIF%2BLijO8GdJmzjAJptRzoWNgn%2FVAXr%2BP79CxEmEoEGkq1MqFTzFgOjnQWICts87VfmQ%3D%3D";
        String numOfRows = "12"; // 한 번에 조회할 행 수
        int totalReads = 10; // 총 조회 횟수

        for (int page = 1; page <= totalReads; page++) {
            String url = "https://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getVilageFcst"
                         + "?serviceKey=" + serviceKey
                         + "&pageNo=" + page
                         + "&numOfRows=" + numOfRows
                         + "&dataType=XML"
                         + "&base_date=" + today.formattedDate1
                         + "&base_time=" + time.getFormattedTime() // 02시 기준으로 3시간마다
                         + "&nx=55"
                         + "&ny=127";
            System.out.println(url);
        }
    }
}