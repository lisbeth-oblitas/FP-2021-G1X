public class Tarea3 {
    
    public void imprimirMatrizCadena(String[][] matrizMO) {
        for (int f = 0; f < matrizMO.length; f++) {
            for (int c = 0; c < matrizMO[0].length; c++) {
                if(matrizMO[f][c]!=null && !matrizMO[f][c].equals("")){
                    System.out.print(matrizMO[f][c]+"\t");
                }else{
                    System.out.print("\t");
                }                
            }
            System.out.println("");
        } 
    }  
    public void funcion6(int dimen, int numInit) {
        String[][] matrizMO=new String[dimen][dimen];//i=filas, j=columnas
        for (int i = 0; i < matrizMO.length; i++) {
             for (int j = 0; j <=i; j++) {
                 matrizMO[i][j] = ""+numInit;
                 numInit++;
             }
        }
        System.out.println("MATRIZ 6");
        imprimirMatrizCadena(matrizMO);
    }
    public void funcion7(int dimen, int numInit) {
        String[][] matrizMO=new String[dimen][dimen];//i=filas, j=columnas
        for (int i = 0; i < matrizMO.length; i++) {
             for (int j = 0; j <(dimen-i); j++) {
                 matrizMO[i][j] = ""+numInit;
                 numInit++;
             }
        }
        System.out.println("MATRIZ 7");
        imprimirMatrizCadena(matrizMO);
    }
    public void funcion8(int dimen, int numInit) {
        String[][] matrizMO=new String[dimen][dimen];//i=filas, j=columnas
        for (int i = 0; i < matrizMO.length; i++) {
             for (int j = 0; j <(dimen-i); j++) {
                 matrizMO[i][j+i] = ""+numInit;
                 numInit++;
             }
        }
        System.out.println("MATRIZ 8");
        imprimirMatrizCadena(matrizMO);
    }
    public void funcion9(int dimen, int numInit) {
        String[][] matrizMO=new String[dimen][dimen];//i=filas, j=columnas
        for (int i = 0; i < matrizMO.length; i++) {
             for (int j = 0; j <=i; j++) {
                 matrizMO[i][(dimen-1)-i+j] = ""+numInit;
                 numInit++;
             }
        }
        System.out.println("MATRIZ 9");
        imprimirMatrizCadena(matrizMO);
    }
    public void funcion10(int dimen, int numInit) {
        String[][] matrizNO=new String[dimen][dimen];//i=filas, j=columnas
        for (int i = 0; i < matrizNO.length; i++) {
             for (int j = 0; j <=i; j++) {
                 matrizMO[i][i-j] = ""+numInit;
                 numInit++;
             }
        }
        System.out.println("MATRIZ 10");
        imprimirMatrizCadena(matrizNO);
    }
    public void funcion11(int dimen, int numInit) {
        String[][] matrizMO=new String[dimen][dimen];//i=filas, j=columnas
        for (int i = 0; i < matrizMO.length; i++) {
             for (int j = 0; j <(dimen-i); j++) {
                 matrizMO[i][(dimen-1)-(j+i)] = ""+numInit;
                 numInit++;
             }
        }
        System.out.println("MATRIZ 11");
        imprimirMatrizCadena(matrizMO);
    }
    
    public void funcion12(int dimen, int numInit) {
        String[][] matrizMO=new String[dimen][dimen];//i=filas, j=columnas
        for (int i = 0; i < matrizMO.length; i++) {
             for (int j = 0; j <(dimen-i); j++) {
                 matrizMO[i][(dimen-1)-j] = ""+numInit;
                 numInit++;
             }
        }
        
        System.out.println("MATRIZ 12");
        imprimirMatrizCadena(matrizMO);
    }
    public void funcion13(int dimen, int numInit) {
        String[][] matrizMO=new String[dimen][dimen];//i=filas, j=columnas
        for (int j = 0; j <dimen; j++) {
            for (int i = 0; i < (matrizMO.length)-j; i++) {            
                matrizMO[i][j]=""+numInit;
                numInit++;
            }
        }
        System.out.println("MATRIZ 13");
        imprimirMatrizCadena(matrizMO);
    }
    public void funcion14(int dimen, int numInit) {
        String[][] matrizMO=new String[dimen][dimen];//i=filas, j=columnas
        for (int j = 0; j <dimen; j++) {
            for (int i = 0; i < 1+j; i++) {            
                matrizMO[i][j]=""+numInit;
                numInit++;
            }
        }
        System.out.println("MATRIZ 14");
        imprimirMatrizCadena(matrizMO);
    }
    public void funcion16(int dimen, int numInit) {
        String[][] matrizMO=new String[dimen][dimen];//i=filas, j=columnas
        for (int j = 0; j <dimen; j++) {
            for (int i =4; i > (matrizMO.length-2)-j; i--) {            
                matrizMO[i][j]=""+numInit;
                numInit++;
            }
        }
        System.out.println("MATRIZ  16");
        imprimirMatrizCadena(matrizMO);
    }
 









public static void main(String[] args) {
    Tarea3 transf=new Tarea3();
    //transf.funcion6(5, 0);
    //transf.funcion7(5, 0);
    //transf.funcion8(5, 0);
    //transf.funcion9(5, 0);
    //transf.funcion10(5, 0);
    //transf.funcion11(5, 0);
    //transf.funcion12(5, 0);
    //transf.funcion13(5, 0);
    //transf.funcion14(5, 0);
    //transf.funcion16(5, 0);

}












}