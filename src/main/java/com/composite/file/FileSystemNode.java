package com.composite.file;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件节点（文件夹 或 文件）
 * @author yanzhihao
 * @since 2022/5/5
 */
public abstract class FileSystemNode {

    protected String path;

    public FileSystemNode(String path) {
        this.path = path;
    }

    public abstract int countNumOfFiles();
    public abstract long countSizeOfFiles();

    public String getPath() {
        return path;
    }
}
