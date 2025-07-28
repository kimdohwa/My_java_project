package ch02_control_statement;

public class Switch08 {
    public static void main(String[] args) {
        int month = 12;

        switch (month) {
            case 3, 4, 5:
                System.out.println(month + "월은 봄 입니다.");
                break;

            case 6, 7, 8:
                System.out.println(month + "월은 여름 입니다.");
                break;

            case 9, 10, 11:
                System.out.println(month + "월은 가을 입니다.");
                break;

            case 12, 1, 2:
                System.out.println(month + "월은 겨울 입니다.");
                break;

            default:
                System.out.println("1-12를 입력해주세요.");

        }
    }
}