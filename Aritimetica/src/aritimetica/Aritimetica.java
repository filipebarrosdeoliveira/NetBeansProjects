/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritimetica;

/**
 *
 * @author FilipeBarros
 */
public class Aritimetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    /**
     *
     */
        private double soma, subtrai, multiplica, divide, op;
	public Aritimetica(){}
	public void setSomaRacional(int n1, int n2, int d1, int d2){
		soma = (n1*d2)+ (n2*d1)/(d1*d2);
	}
	public void setSubtraiRacional(int n1, int n2, int d1, int d2){
		subtrai = (n1*d2)- (n2*d1)/(d1*d2);
	}
	public void setMultiplicaRacional(int n1, int n2, int d1, int d2){
		multiplica = ((n1*n2)/ (d1*d2));
	}
	public void setDivideRacional(int n1, int n2, int d1, int d2){
		divide = ((n1*d2)/(n2*d1));
	}
	public double getSomaRacional(){
		return soma;
	}
	public double getSubtraiRacional(){
		return subtrai;
	}
	public double getMultiplicaRacional(){
		return multiplica;
	}
	public double getDiviteRacional(){
		return divide;
        }
    }
    

