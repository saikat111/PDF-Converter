package com.quantunsoft.pdfcreator.interfaces;

public interface OnPDFCompressedInterface {
    void pdfCompressionStarted();
    void pdfCompressionEnded(String path, Boolean success);
}
