public class Flag {
    public static void main(String[] args) {
        for(int i=1; i<=11; i++){
            for(int j=1; j<=15; j++){
                if(i==1||i==7||j==1){
                    System.out.print("*");
                }
                else if((i==2&&j==3)||(i==2&&j==15)||(i==3&&j==3)||(i==3&&j==15)||(i==4&&j==3)||(i==2&&j==8)||(i==4&&j==15)||(i==4&&j==6)||(i==5&&j==3)||(i==5&&j==15)||(i==6&&j==3)||(i==6&&j==15)||(i==2&&j==6)||(i==2&&j==7)||(i==3&&j==6)||(i==4&&j==7)||(i==4&&j==8)){
                    System.out.print("*");
                }
                else if(i==3&&j==8){
                    System.out.print("@");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}
