import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Main {

	public static void main(String[] args) throws Exception {
		Callable task = () -> {
			return 7;
		};

		FutureTask<String> future = new FutureTask<>(task);
		new Thread(future).start();
		System.out.println(future.get());

	}

}
