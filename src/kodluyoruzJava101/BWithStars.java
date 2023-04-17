package kodluyoruzJava101;

public class BWithStars {
    public static void main(String[] args) {
        String[][] stars = new String[5][3];

        for (int i = 0; i < stars.length; i++) {
            for (int k = 0; k < stars[i].length; k++){
                if (i == 0 || i == 4){
                    stars[i][k] = "*" + "\t" ;
                }else if (k == 0){
                    stars[i][k] = "*" + "\t";
                }else if (i == 1 && k == 2){
                    stars[i][k] = "*" + "\t";
                }else if (i==2 && k ==1){
                    stars[i][k] = "*" + "\t";
                }else if (i==3 && k == 2){
                    stars[i][k] = "*" + "\t";
                }else {
                    stars[i][k] = "" + "\t";
                }
            }
        }for (String[] row : stars){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
