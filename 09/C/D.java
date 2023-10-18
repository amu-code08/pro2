import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


public class D{
    static int h;
    static int w;
    static int H;
    static int W;
    static int coin;
    static int[][] source;
    static int[][] target;
    static int[][] target2;
    static int[][] target3;
    static int[][] target4;

    public static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
                System.out.println();
        }
        System.out.println();

    }

    public static int[][] process(int[][] matrix, String line, int count){
        for(int i = 0; i<line.length(); i++){
                if(line.charAt(i) == 'o'){
                    matrix[count-1][i] = 1;
                    coin++;
                } else {
                    matrix[count-1][i] = 0;
                }
        }
        return matrix;
    }

    public static int[][] buff(int[][] matrix, int height, int width){
        int[][] buffed = new int[height][width];
        for(int i = 0; i<height; i++){
            for(int j = 0; j<width; j++){
                buffed[i][j] = 0;
            }
        }
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                buffed[i][j] = matrix[i][j];
            }
        }
        return buffed;
    }

    public static int[][] rotate(int[][] matrix){
        int[][] rotated = new int[matrix[0].length][matrix.length];
        int temp;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                rotated[j][i] = matrix[i][j];
            }
        }

        for(int j = 0; j < rotated.length; j++){
                int low = 0; int high = rotated.length-1;
                while(low<high){
                    temp = rotated[j][low];
                    rotated[j][low] = rotated[j][high];
                    rotated[j][high] = temp;
                    low++;
                    high--;
                }
        }
        return rotated;
    }

    public static boolean compare(int[][] target, int[][] source){
        int match;
        String move="";
        String to="";
        //the target is always smaller than the source
        for(int h1 = 0; h1<=source.length-target.length; h1++){
            for(int w1 = 0; w1<=source[0].length-target[0].length; w1++){
                match = 0;
                for(int h2 = 0; h2<target.length; h2++){
                    for(int w2 = 0; w2<target[0].length; w2++){
                        int an = h1+h2; int bn = w1+w2;
                        if(source[an][bn]==1 && target[h2][w2]==1){
                            match++;
                        }
                        if(match == coin/2-1){
                            for(int x = 0; x<target.length; x++){
                                for(int y = 0; y<target[0].length; y++){
                                    int cn = h1+x; int dn = w1+y;
                                    if(source[cn][dn]==1 && target[x][y]==1){
                                        source[cn][dn] =0;
                                    } else if(source[cn][dn]==0 && target[x][y]==1){
                                        int icn = cn;
                                        int idn = dn;
                                        to = idn + " " + icn;
                                    }
                                }
                            }
                            for(int a = 0; a<h; a++){
                                for(int b = 0; b<w; b++){
                                    if(source[a][b] == 1){
                                        int ia = a;
                                        int ib = b;
                                        move = ib+ " " + ia;
                                    }
                                }
                            }
                            System.out.println(move);
                            System.out.print(to);
                            return true;
                        }

                    }
                }
            }
        }
        return false;
    }


    
    public static void main(String[] args){
        String inputFileName = args[0];
        int count = 0;
        int flag = 0;
        try(BufferedReader reader = new BufferedReader(new FileReader(inputFileName))){
            String line; 
            while ((line = reader.readLine()) != null){
                if(count == 0){
                    String[] hw = line.split("\\s");
                    int height = Integer.parseInt(hw[0]);
                    int width = Integer.parseInt(hw[1]);
                    h = height;
                    w = width;
                    source = new int[h][w];
                } else if(flag == 0) {
                    process(source, line, count);
                    if(count == h){
                        flag = 1;
                    }
                } else if(count == h+1) {
                    String[] HW = line.split("\\s");
                    int HEIGHT = Integer.parseInt(HW[0]);
                    int WEIGHT = Integer.parseInt(HW[1]);
                    H = HEIGHT;
                    W = WEIGHT;
                    target = new int[H][W]; 
                } else {
                    process(target, line, count-h-1);
                }
                count++;
            } 
        } catch (IOException e) {
            System.err.println("Error" + e.getMessage());
        }
        target2 = rotate(target);
        target3 = rotate(target2);
        target4 = rotate(target3);
        
        int[][] buffsource = buff(source, h+H, w+W);
        h = h+H; w = w+W;
        if(!compare(target,buffsource)){
            if(!compare(target2,buffsource)){
                if(!compare(target3,buffsource)){
                    compare(target4, buffsource);
                }
            }
        }
    }

}