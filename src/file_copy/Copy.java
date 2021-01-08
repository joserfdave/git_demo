package file_copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
	public static void main(String[] args) throws IOException {
		if (args.length != 2) {
			System.out.println("没有输入和输入文件");
			System.exit(1);
		}
		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) {
			System.out.println("文件 " + args[0] + " 不存在");
			System.exit(2);
		}
		File targetFile = new File(args[1]);
		if (targetFile.exists()) {
			System.out.println("文件 " + args[1] + " 存在");
			System.exit(3);
		}

		try (BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile));
				BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile));) {
			int r, numberOfBytesCopied = 0;
			while ((r = input.read()) != -1) {
				output.write((byte) r);
				numberOfBytesCopied++;
			}
			System.out.println("面向字节缓冲流");
			System.out.println(numberOfBytesCopied + " byte copied");
		}

	}

}
