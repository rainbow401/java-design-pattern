package com.composite.file;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件夹
 *
 * @author yanzhihao
 * @since 2022/5/5
 */
public class Directory extends FileSystemNode {

    private List<FileSystemNode> subNodes = new ArrayList<>();

    public Directory(String path) {
        super(path);
    }

    @Override
    public int countNumOfFiles() {
        int numFiles = 0;
        for (FileSystemNode fileOrDir : subNodes) {
            // 存在隐式转换，如果数量级超过int，就会产生 long 型数值赋值给 int 导致报错；
            numFiles += fileOrDir.countNumOfFiles();
        }
        return numFiles;
    }

    @Override
    public long countSizeOfFiles() {
        long sizeOfFiles = 0;
        for (FileSystemNode fileOrDir : subNodes) {
            sizeOfFiles += fileOrDir.countSizeOfFiles();
        }
        return sizeOfFiles;
    }

    public void addSubNode(FileSystemNode fileOrDir) {
        subNodes.add(fileOrDir);
    }

    public void removeSubNode(FileSystemNode fileOrDir) {
        int size = subNodes.size();
        int i = 0;
        for (; i < size; ++i) {
            if (subNodes.get(i).getPath().equalsIgnoreCase(fileOrDir.getPath())) {
                break;
            }
        }
        if (i < size) {
            subNodes.remove(i);
        }
    }

}
