package com.pkware.archive.zip;

// Fake class for ZipArchiveEntry
public class ZipArchiveEntry {
    private String name;
    private long size;

    public ZipArchiveEntry(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public long getSize() {
        return size;
    }

    public boolean isDirectory() {
        return name.endsWith("/");
    }
}

