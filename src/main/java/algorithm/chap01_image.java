package algorithm;

public class chap01_image {
    public static void main(String[] args) {
//        triangleB(3);
//        triangleLU(3);
        triangleRU(3);
    }

    public static void triangleB(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void triangleLU(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void triangleRU(int n){
        for (int i = 1; i <= n; i++) {
            // 공백 출력
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 별표 출력
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // 줄 바꿈
            System.out.println();
        }

    }
}
