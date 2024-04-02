package Exceptions.Seminar.Sem03.Task00;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Переписать код, воспользовавшись 
 * механизмом try-with-resources
 * (автоматическое закрытие (close) ресурса)
 */
public class Task0 {

	public void rwLine(Path pathRead, Path pathWrite) throws IOException {

        // поместить поля в try, в круглых скобках
		BufferedReader in = null;
		BufferedWriter out = null;
		try {
			in = Files.newBufferedReader(pathRead);
			out = Files.newBufferedWriter(pathWrite);
			out.write(in.readLine());

        // удалить блок finally
		} finally {
			try {
				if (in != null) in.close();
			} catch (IOException e) {}
			try {
				if (out != null) out.close();
			} catch (IOException e){}
		}
	}
}


/**
 * Решение задания "Task0"
 * Модефицированный код закрытия ресурса
 * (механизм try-with-resources)
 */
class Task0Solution {

	public void rwLine(Path pathRead, Path pathWrite) throws IOException {
		try (BufferedReader in = Files.newBufferedReader(pathRead);
			BufferedWriter out = Files.newBufferedWriter(pathWrite);) {
			out.write(in.readLine());
		}
	}
}