package com.feedbackguru;

import java.io.File;
import java.util.*;

public class FeedbackGuruApp {

    public static void main(String[] args) {

        File feedbackFolder = new File("feedbacks");

        FeedbackAnalyzer<String> analyzer =
                new FeedbackAnalyzer<>();

        Map<String, List<Feedback<String>>> summary =
                analyzer.analyzeFeedbacks(feedbackFolder, "Service");

        System.out.println(" Feedback Summary:\n");

        for (Map.Entry<String, List<Feedback<String>>> entry : summary.entrySet()) {
            System.out.println("=== " + entry.getKey() + " Feedback ===");
            for (Feedback<String> f : entry.getValue()) {
                System.out.println(f);
            }
            System.out.println();
        }
    }
}

