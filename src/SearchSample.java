public class SearchSample {
    public static void main(String[] args) {
        int[][] list = {{1, 3, 5}, {1, 2, 5}, {2, 7, 2}};
        System.out.print("Print Matrix");
        for (int i = 0; i < 3; i++) {
            System.out.println("\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(list[i][j]+" ");
            }
        }
        System.out.println("\t");
        System.out.println("Reverse index of column and row and print:");
        int[][] transpose = new int[3][3];
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[j][i] = list[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(transpose[i][j]+" ");
            }
        }

        System.out.println("\t");
        int searchValue = 5;
        int positionX = -1;
        int positionY = -1;
        PARENT_LOOP:
        for (int i = 0; i < list.length; i++) {
            CHILD_LOOP:
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == searchValue) {
                    positionX = i;
                    positionY = j;
                    break PARENT_LOOP; // nhảy ra hẳn khỏi vòng lặp bên ngoài luôn mới sợ
                }
            }
        }
        if (positionX == -1 || positionY == -1) {
            System.out.println("Value " + searchValue + " not found");
        } else {
            System.out.println("Value " + searchValue + " found at: " + "(" + positionX + "," + positionY + ")");
        }
    }
}
