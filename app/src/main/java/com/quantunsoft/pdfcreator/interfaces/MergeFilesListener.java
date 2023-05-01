package com.quantunsoft.pdfcreator.interfaces;

public interface MergeFilesListener {
    void resetValues(boolean isPDFMerged, String path);
    void mergeStarted();
}
