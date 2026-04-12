package com.haveanicepickem.app.shared.constants;

public enum RecordType {
    CONFERENCE("Conference"),
    OVERALL("Overall");

    private final String value;

    RecordType(String value) {
        this.value = value;
    }

    public String text() {
        return value;
    }
}
