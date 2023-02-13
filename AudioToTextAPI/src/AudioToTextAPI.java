import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;

import netscape.javascript.JSObject;

public class AudioToTextAPI {

	public static void main(String[] args) {
		
		Transcript transcript = new Transcript();
		transcript.setAudio_url("https://www.youtube.com/redirect?event=video_description&redir_token=QUFFLUhqbGlFR2JmS1laTlRZYTkyNEZDcndLVmxLZGVLd3xBQ3Jtc0trYWFHU3ByQWVYLWtHUmtNVkJHTkJua0l3RF9pVkhBSHM0MTgtSnI3SXpQb2JqQzU5eHBxbmRLd0ZXY05aMjZqWlRMZDM5ZkF6b20wa1piekxjNmZtbnFEcGRXc2VuS2VlNDdGSk1BWk9DSG5NaXpQYw&q=https%3A%2F%2Fgithub.com%2Fjohnmarty3%2FJavaAPITutorial%2Fblob%2Fmain%2FThirsty.mp4%3Fraw%3Dtrue&v=9oq7Y8n1t00");
		Gson gson = new Gson();
		String jsonRequest = gson.toJson(transcript);
		HttpRequest postRequest = (HttpRequest) HttpRequest.newBuilder()
				.uri(new URI("https://api.assemblyai.com/v2/transcript"))
				.header("Authorization", "API-key")
				.POST(BodyPublishers.ofString("{\"audio_url\":\"https\"}"));
	}

}
