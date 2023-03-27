package HackerRank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RubahDanAyam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] split = a.split("");

        String temp = "";

        String ans = "";

        int check = 0;

        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("[") || i == split.length - 1) {
                if (temp.contains("R")) {
                    check++;
                }
                temp = "";
            }
            if (split[i].equals("]")) {
                temp = "";
            }


            if (split[i].equals("[") || split[i].equals("]")) {
                continue;
            } else {
                temp += split[i];
            }


            if (i == split.length - 1) {
                if (temp.contains("R")) {
                    check++;
                }

            }
        }


        temp = "";


            if (check > 0) {
                for (int k = 0; k < split.length; k++) {
                    if (split[k].equals("[") || k == split.length - 1) {
                        if (k == split.length - 1) {
                            ans += temp.replaceAll("A", ".") + "[";
                        } else {
                            ans += temp.replaceAll("A", ".") + "[";
                        }
                        temp = "";
                    }
                    if (split[k].equals("]")) {
                        if (temp.contains("R")) {
                            ans += temp.replaceAll("A", ".") + "]";
                        } else {
                            ans += temp + "]";
                        }
                        temp = "";
                    }


                    if (split[k].equals("[") || split[k].equals("]")) {
                        continue;
                    } else {
                        temp += split[k];
                    }


                    if (k == split.length - 1) {
                        if (temp.contains("R")) {
                            ans += temp.replaceAll("A", ".");
                        } else {
                            ans += temp;
                        }
                    }

                }

            } else {
                for (int j = 0; j < split.length; j++) {
                    if (split[j].equals("[") || j == split.length - 1) {
                        if (j== split.length - 1) {
                            ans += temp;
                        } else {
                            if (temp.contains("R")) {
                                ans += temp.replaceAll("A", ".") + "[";
                                check++;
                            } else {
                                ans += temp + "[";
                            }
                        }
                        temp = "";
                    }
                    if (split[j].equals("]")) {
                        if (temp.contains("R")) {
                            ans += temp.replaceAll("A", ".") + "]";
                        } else {
                            ans += temp + "]";
                        }
                        temp = "";
                    }


                    if (split[j].equals("[") || split[j].equals("]")) {
                        continue;
                    } else {
                        temp += split[j];
                    }


                    if (j == split.length - 1) {
                        if (temp.contains("R")) {
                            ans += temp.replaceAll("A", ".");
                        } else {
                            ans += temp;
                        }
                    }

                }
            }


            System.out.println(ans);

    }
}

