package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
                for (int j = 1; j <=  cathetusLength + 1;) {
                    if (j  == cathetusLength - i + 1) {
                        for (int k = i; k >= 1; k--) {
                            System.out.print(k);
                            j++;
                        }
                    }
                    else if (j == cathetusLength + 1) {
                        if (i >= 2) {
                            for (int l = 2; l <= i; l++) {
                                System.out.print(l);
                                j++;
                            }
                        } else {
                            j++;
                        }
                    } else {
                        System.out.print(" ");
                        j++;
                    }
                }
                System.out.println();
            }
        }


    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
