package com.vg.js.bridge;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.functions.Callback1;

/**
 * ST-JS bridge for PDF.js
 */
@STJSBridge
public class PDFJS {

    public native Async<Document> getDocument(String url);

    public static class Async<T> {
        public native void then(Callback1<T> onDone);
    }

    public static class Document {
        public native Async<Page> getPage(int pageNum);
    }

    public static class Page {

    }

}
