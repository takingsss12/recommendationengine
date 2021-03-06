package com.sqli.challenge.similarity;

public class SimilarityMetricFactory {
    public static SimilarityMetric create(String similarityMetric){
        switch (similarityMetric.toLowerCase()){
            case "euclidian":
                return EuclidianSimilarityMetric.getInstance();
            case "jaccardindex":
                return JaccardIndexSimilarityMetric.getInstance();
            default:
                throw new RuntimeException("Unknown metric!");
        }
    }
}
