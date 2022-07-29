package basics_of_OOP;

import java.util.Arrays;

public class Vector {
    private double x;
    private double y;
    private double z;
    public Vector (double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double lengthOfVector(){
        return Math.sqrt(x*x+y*y+z*z);
    }
    public double scalarOfVectors(Vector otherVector){
        return x*otherVector.x+y*otherVector.y+z*otherVector.z;
    }
    public double[] vectorOfVectors(Vector otherVector){
        double[] vectors = new double[3];
        vectors[0] = y*otherVector.z - z * otherVector.y;
        vectors[1] = z*otherVector.x - x * otherVector.z;
        vectors[2] = x*otherVector.y - y * otherVector.x;
        return vectors;
    }
    public double cornerOfVectors(Vector otherVector){
        return this.scalarOfVectors(otherVector)/(this.lengthOfVector()*otherVector.lengthOfVector());
    }
    public Vector add(Vector otherVector){
        Vector vector = new Vector(x + otherVector.x, y + otherVector.y, z + otherVector.z);
        return vector;
    }
    public Vector sub(Vector otherVector){
        Vector vector = new Vector(x - otherVector.x, y - otherVector.y, z - otherVector.z);
        return vector;
    }
//    public static double[][] arrayOfVectors (int num){
//        double[][] vectors = new double[num][3];
//        for (int i = 0; i < num; i++){
//            vectors[i][0] = Math.random();
//            vectors[i][1] = Math.random();
//            vectors[i][2] = Math.random();
//        }
//        return vectors;
//    }
    public static Vector[] arrayOfVectors(int num){
        Vector[] vectors = new Vector[num];
        for (int i = 0; i < vectors.length; i++){
            vectors[i] = new Vector(Math.random()*100, Math.random()*70, Math.random()*50);
        }
        return vectors;
    }
    @Override
    public String toString(){
        return "[ " + x + ", " + y + ", " + z + " ]";
    }

}
