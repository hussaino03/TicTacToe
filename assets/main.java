import java.util.Scanner;
public class tictactoe{
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        String TL = keyboard.next();
                    String TM = keyboard.next();
                    String TR = keyboard.next();
                    String ML = keyboard.next();
                    String MM = keyboard.next();
                    String MR = keyboard.next();
                    String BL = keyboard.next();
                    String BM = keyboard.next();
                    String BR = keyboard.next();
                        System.out.print(TL);
                        System.out.print(TM);
                        System.out.print(TR);
                        System.out.print("\n"+ML);
                        System.out.print(MM);
                        System.out.print(MR);
                        System.out.print("\n"+BL);
                        System.out.print(BM);
                        System.out.print(BR);
                           if (TL.equals(TM) && TL.equals(TR) && TL.equals(TR) && !TL.equals("b")){ 
                                System.out.println("\n"+TL +" "+"wins");
            }
                            else if (ML.equals(MM) && ML.equals(MR) && !ML.equals("b")){
                                System.out.println("\n"+ML +" "+"wins");
            }
                            else if (TL.equals(ML) && TL.equals(BL) && !TL.equals("b")){
                                System.out.println("\n"+TL +" "+"wins");
            }
                            else if (BL.equals(BM) && BL.equals(BR) && !BL.equals("b")){
                                System.out.println("\n"+BM +" "+"wins");
            }
                            else if (TM.equals(MM) && TM.equals(BM) && !TM.equals("b")){
                                System.out.println("\n"+TM +" "+"wins");
            }
                            else if (TR.equals(MM) && TR.equals(BL) && !TR.equals("b")){
                                System.out.println("\n"+TR +" "+"wins");
            }
                            else if (TR.equals(MR) && TR.equals(BR) && !TR.equals("b")){
                                System.out.println("\n"+TR +" "+"wins");
            }
                            else if (TL.equals(MM) && TL.equals(BR) && !TL.equals("b")){
                                System.out.println("\n"+TL +" "+"wins");
            }
                            else{
                                System.out.println("\n"+"No Winner");
            }
