/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carochess;

import java.sql.JDBCType;
import javax.swing.ImageIcon;

/**
 *
 * @author Thu
 */
public class Minimax {
    PVsC game;
   
    
    int mangDiemTanCong[]={0,9,54,162,1458,13112,118008};
    int mangDiemPhongThu[]={0,3,27,99,729,6561,59049};
//    long mangDiemTanCong[]={0,3,24,192,1536,12888,98304};
//    long mangDiemPhongThu[]={0,1,9,81,729,6561,59049,784272};
//    int mangDiemTanCong[]={0,24,192,1536,12888,98304,784272};
//    int mangDiemPhongThu[]={0,9,729,6561,59049};
    public Minimax(PVsC game){this.game=game;}   
   
    int trangThaiHangDoc(int i,int j,int [][]arr,boolean turn)
    {
        
        int tong=0;int quanta,quandich;if(turn==false){quanta=2;quandich=1;}else{quanta=1;quandich=2;}
        int soquanta=0;
        int soquandich=0;
        for(int dem=1;dem<6;dem++)
        {
            if(arr[i+dem][j]==quanta)
            {
                soquanta++;
            }
            else
                if(arr[i+dem][j]==quandich){
                    soquandich++;
                    break;
                }
                else{
                    break;           
            }
        }
        for(int dem=1;dem<6;dem++)
        {
            if(arr[i-dem][j]==quanta)
            {
                soquanta++;
            }
            else
                if(arr[i-dem][j]==quandich){
                    soquandich++;
                    break;
                }
                else
                    break;
                
            
        }
        if(soquandich==2)
            return 0;
        if(soquandich==0){
        tong=tong-mangDiemTanCong[soquandich];
        tong=tong+mangDiemTanCong[soquanta];
        }
        else{
        tong=tong-mangDiemTanCong[soquandich];
        tong=tong+mangDiemTanCong[soquanta];
        }
        return tong;
    }
    int trangThaiHangNgang(int i,int j,int [][]arr,boolean turn)
    {
        
        int tong=0;int quanta,quandich;if(turn==false){quanta=2;quandich=1;}else{quanta=1;quandich=2;}
        int soquanta=0;
        int soquandich=0;
        for(int dem=1;dem<6;dem++)
        {
            if(arr[i][j+dem]==quanta)
            {
                soquanta++;
            }
            else
                if(arr[i][j+dem]==quandich){
                    soquandich++;
                    break;
                }
                else{
                    break;
                
            }
        }
        for(int dem=1;dem<6;dem++)
        {
            if(arr[i][j-dem]==quanta)
            {
                soquanta++;
            }
            else
                if(arr[i][j-dem]==quandich){
                    soquandich++;
                    break;
                }
                else {
                    break;
                
            }
        }
        if(soquandich==2)
            return 0;
        if(soquandich==0){
        tong=tong-mangDiemTanCong[soquandich];
        tong=tong+mangDiemTanCong[soquanta];
        }
        else{
        tong=tong-mangDiemTanCong[soquandich];
        tong=tong+mangDiemTanCong[soquanta];
        }
        return tong;
    }
    int trangThaiHangCheo1(int i,int j,int [][]arr,boolean turn)
    {
        
        int tong=0;int quanta,quandich;if(turn==false){quanta=2;quandich=1;}else{quanta=1;quandich=2;}
        int soquanta=0;
        int soquandich=0;
        for(int dem=1;dem<6;dem++)
        {
            if(arr[i+dem][j+dem]==quanta)
            {
                soquanta++;
            }
            else
                if(arr[i+dem][j+dem]==quandich){
                    soquandich++;
                    break;
                }
                else{
                    break;
                }
            
        }
        for(int dem=1;dem<6;dem++)
        {
            if(arr[i-dem][j-dem]==quanta)
            {
                soquanta++;
            }
            else
                if(arr[i-dem][j-dem]==quandich){
                    soquandich++;
                    break;
                }
                else{
                    break;
                
            }
        }
        if(soquandich==2)
            return 0;
        if(soquandich==0){
        tong=tong-mangDiemTanCong[soquandich];
        tong=tong+mangDiemTanCong[soquanta];
        }
        else{
        tong=tong-mangDiemTanCong[soquandich];
        tong=tong+mangDiemTanCong[soquanta];
        }
        return tong;
    }
    int trangThaiHangCheo2(int i,int j,int [][]arr,boolean turn)
    {
        
       
        int tong=0;int quanta,quandich;if(turn==false){quanta=2;quandich=1;}else{quanta=1;quandich=2;}
        int soquanta=0;
        int soquandich=0;
        for(int dem=1;dem<6;dem++)
        {
            if(arr[i-dem][j+dem]==quanta)
            {
                soquanta++;
            }
            else
                if(arr[i-dem][j+dem]==quandich){
                    soquandich++;
                    break;
                }
                else{
                    break;
                
            }
        }
        for(int dem=1;dem<6;dem++)
        {
            if(arr[i+dem][j-dem]==quanta)
            {
                soquanta++;
            }
            else
                if(arr[i+dem][j-dem]==quandich){
                    soquandich++;
                    break;
                }
                else{
                    break;
                }
            
        }
        if(soquandich==2)
            return 0;
        if(soquandich==0){
        tong=tong-mangDiemTanCong[soquandich];
        tong=tong+mangDiemTanCong[soquanta];
        }
        else{
        tong=tong-mangDiemTanCong[soquandich];
        tong=tong+mangDiemTanCong[soquanta];
        }
        return tong;
    }
    public int TrangThaiCo(int [][]arr,boolean turn)
    {
            int tc=0;
            for(int i=1;i<=game.Hang;i++){
                  for(int j=1;j<=game.Cot;j++){
                if(arr[i][j]==0){
                    int diemtancong=trangThaiHangDoc(i,j,arr,turn)+trangThaiHangNgang(i,j,arr,turn)+trangThaiHangCheo1(i,j,arr,turn)+trangThaiHangCheo2(i,j,arr,turn);                                        
                    if(diemtancong>tc)
                        tc=diemtancong;                    
                }
            }
      }        
        return tc;               
    }
    public int TrangThaiBanCo(int[][]arr,boolean turn)
    {
        int ttmay=TrangThaiCo(arr,false);
        int ttnguoi=TrangThaiCo(arr,true);
        if(turn==false){
            ttmay*=2;
        }else{
            ttnguoi*=2;
        }
        return ttmay-ttnguoi;
    }
    public boolean kiemTraBuocDi(int [][]arr){
        //return step==col*row;
        for(int i=1;i<=game.Hang;i++){
            for(int j=1;j<=game.Cot;j++){
                if(arr[i][j]==0)
                    return true;
            }
        }
        return false;
    }
  
    
   public int minimax(int [][]arr,int depth,boolean turn,int alpha,int beta){       
      
        
        
        if(kiemTraBuocDi(arr)==false) return 0;
        //if(TrangThaiCo(arr, turn)>=1536) return TrangThaiBanCo(arr, turn);
        
        if(depth==2){            
            return TrangThaiBanCo(arr,turn);
        }
         
       if(turn==false){
           int best=Integer.MIN_VALUE;
           
           for(int i=1;i<=game.Hang;i++){
            for(int j=1;j<=game.Cot;j++){
                if(arr[i][j]==0){                  
                    arr[i][j]=2;                                      
                    if(game.kiemtraThang(arr, turn)==-10){
                        arr[i][j]=0;
                        return Integer.MAX_VALUE-depth;                     
                    }
                    int diem = minimax(arr,depth+1,!turn,alpha,beta);                    
                    if(best<diem){ 
                        best=diem;                        
                    }
                    if(best>=beta){
                        arr[i][j]=0;
                        return best;
                    }
                    alpha = Math.max(alpha, best);
                    arr[i][j]=0;
                }
                
            }
           }           
           
           return best;
       }else {
           int best=Integer.MAX_VALUE;
          
           for(int i=1;i<=game.Hang;i++){
            for(int j=1;j<=game.Cot;j++){
                if(arr[i][j]==0){                    
                    arr[i][j]=1;                    
                    if(game.kiemtraThang(arr, turn)==10){
                       arr[i][j]=0;
                       return Integer.MIN_VALUE+depth;
                   }
                   else{
                    int diem=minimax(arr,depth+1,!turn,alpha,beta);                    
                    if(best>diem){
                        best=diem;                        
                    }
                    if(best<=alpha){
                        arr[i][j]=0;
                        return best;
                    }
                    beta = Math.min(beta, best);
                    arr[i][j]=0;
                }
                }
            }
           }     
           
           return best;
       }       
   }
    public int[] bestMove(int arr[][],boolean turn,int alpha,int beta){
        int[] move=new int[2];
        int best=Integer.MIN_VALUE;
        //if(kiemtraThang(arr, turn)==10) return move=null;
        for(int i=1;i<=game.Hang;i++){
            for(int j=1;j<=game.Cot;j++){
                if(arr[i][j]==0)
                {
                    arr[i][j]=2;
                    if(game.kiemtraThang(arr,turn)==-10){
                    move[0]=i;
                    move[1]=j;                    
                    arr[i][j]=0;
                    return move;
                    }
                    else{                    
                    int diem=minimax(arr,0,!turn,alpha,beta); 
                    
                    if(diem>best){
                        move[0]=i;
                        move[1]=j;
                        best=diem;
                    }                    
                    arr[i][j]=0;
                    }
                }
            }
        }
        
        return move;
    }
}
