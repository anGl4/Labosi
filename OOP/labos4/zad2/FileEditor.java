package labos4.zad2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

class FileEditor {

	public static void processFile(Path inputFile, Path outputFile) throws IOException {
		try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
				new BufferedOutputStream(new FileOutputStream(outputFile.toFile())), StandardCharsets.UTF_8));
				BufferedReader reader = new BufferedReader(new InputStreamReader(
						new BufferedInputStream(new FileInputStream(inputFile.toFile())), StandardCharsets.UTF_8))) {
			List<String> lines = Files.readAllLines(inputFile);
			for (int i = 0; i < lines.size(); i++) {
				int j = 0;
				String s = lines.get(i);
				while (s.startsWith("\t")) {
					s = s.replaceFirst("\t", "");
					j++;
				}
				for (int k = 0; k < j; k++) {
					s = s.replaceFirst("", "  ");
				}
				if (i != lines.size() - 1) {
					writer.write(s + "\n");
				} else {
					writer.write(s);
				}
			}

		}

	}
}
