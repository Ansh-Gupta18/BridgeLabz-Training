package com.annotations;

class LegacyAPI {

    @Deprecated
    void oldFeature() {
        System.out.println("This is the old feature (deprecated)");
    }

    void newFeature() {
        System.out.println("This is the new and improved feature");
    }
}

public class LegacyAPITest {
    public static void main(String[] args) {

        LegacyAPI api = new LegacyAPI();

        api.oldFeature();   // ⚠️ Compiler warning
        api.newFeature();   // ✅ Recommended
    }
}

