package org.personal.ganjun;
// Create Java RDD Example
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

public class Main {
    public static void main(String args[]){
        // Todo: create the environment for SPARK
        SparkConf conf = new SparkConf();
        conf.setMaster("local");
        conf.setAppName("spark");
        JavaSparkContext jsc = new JavaSparkContext(conf);

        // Todo: release the resource
        jsc.close();
    }
}