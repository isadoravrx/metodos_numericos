class bisseccao {
    public void func1(double a,double b, double erroAceit){
        while(true){
            double c = (a + b) / 2;
        
            double erro = Math.abs(c - a);
            
            if(erro <= erroAceit){
                System.out.printf("%.2f\n",c);
                break;
            }

            System.out.printf("%.2f ",c);
            if ((calculo1(a) * calculo1(c)) < 0){
                b = c;
            }
            else if((calculo1(c) * calculo1(b)) < 0){
                a = c;
            }
        }
            
    }
        

    public double calculo1(double x){
        return Math.pow(x,2) + Math.log(x);
    }

    public void func2(double a,double b, double erroAceit){
        while(true){
            double c = (a + b) / 2;
        
            double erro = Math.abs(c - a);
            
            if(erro <= erroAceit){
                System.out.printf("%.2f\n",c);
                break;
            }

            System.out.printf("%.2f ",c);
            if ((calculo2(a) * calculo2(c)) < 0){
                b = c;
            }
            else if((calculo2(c) * calculo2(b)) < 0){
                a = c;
            }
        }
            
    }
    public double calculo2(double x){
        return Math.pow(x,5) + 2 * Math.pow(x,3) + 2 * x + 1;
    }

    public void func3(double a,double b, double erroAceit){
        while(true){
            double c = (a + b) / 2;
        
            double erro = Math.abs(c - a);
            
            if(erro <= erroAceit){
                System.out.printf("%.2f\n",c);
                break;
            }

            System.out.printf("%.2f ",c);
            if ((calculo3(a) * calculo3(c)) < 0){
                b = c;
            }
            else if((calculo3(c) * calculo3(b)) < 0){
                a = c;
            }
        }
            
    }
    public double calculo3(double x){
        return Math.sin(x) - Math.log(x);
    }
}
