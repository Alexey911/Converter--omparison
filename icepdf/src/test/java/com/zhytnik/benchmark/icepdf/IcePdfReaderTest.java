package com.zhytnik.benchmark.icepdf;

import com.zhytnik.benchmark.common.Reader;
import com.zhytnik.benchmark.test.ReaderTest;

import java.io.InputStream;

import static com.zhytnik.benchmark.test.Resources.PDF_RESOURCE;

/**
 * @author Alexey Zhytnik
 * @since 26.08.2016
 */
public class IcePdfReaderTest extends ReaderTest {

    @Override
    protected String getResource() {
        return PDF_RESOURCE;
    }

    @Override
    protected Reader<InputStream> getReader() {
        return new IcePdfReader();
    }
}