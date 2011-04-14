package cvut.fel.mobilevoting.murinrad.communications;

import java.util.ArrayList;

import org.apache.http.message.BasicHeader;

import cvut.fel.mobilevoting.murinrad.datacontainers.QuestionData;

public interface ConnectionInterface {

	public abstract void run();

	public abstract void postAndRecieve(String method, String URL,
			ArrayList<BasicHeader> headers, String body);

	public abstract void closeConnection();

	//public abstract void post(QuestionData answers);

	void postAnswers(ArrayList<QuestionData> answers);

}