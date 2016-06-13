package com.java.algorithm;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 文件搜索
 * ArrayDeque；需要从根目录查找某个文件，要用非递归的方式，因为当目录深度太深时使用递归容易导致栈溢出
 * @author dale
 * @date 2014-10-6
 */
public class FileSearch {

    public static void main(String[] args) {
	File root = new File("E:/api/kk");
	File resultFile = search(root, "2.txt");
	System.err.println(resultFile);
    }

    /**
     * 查询指定目录中的文件
     * 
     * @param root
     *            目录
     * @param fileName
     *            文件名
     * @return 结果文件
     */
    public static File search(File root, String fileName) {
	Queue<File> fileQueue = new ArrayDeque<File>();
	File resultFile;
	if (root != null) {
	    fileQueue.add(root);
	}

	while (!fileQueue.isEmpty()) {
	    resultFile = fileQueue.poll();
	    if (resultFile.getName().equals(fileName)) {
		return resultFile;
	    } else {
		File[] files = resultFile.listFiles();
		if (files != null && files.length > 0) {
		    for (File file : files) {
			fileQueue.add(file);
		    }
		}
	    }
	}
	return null;
    }

}