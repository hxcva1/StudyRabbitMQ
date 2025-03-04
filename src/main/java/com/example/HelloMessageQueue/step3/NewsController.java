package com.example.HelloMessageQueue.step3;

import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
public class NewsController {


	private final NewsPublisher newsPublisher;

	public NewsController(NewsPublisher newsPublisher) {
		this.newsPublisher = newsPublisher;
	}

	// /app/subscribe
	@MessageMapping("/subscribe")
	public void handleSubscribe(@Header("newsType") String newsType) {
		System.out.println("[#] newsType: " + newsType);

		String newsMessage = newsPublisher.publish(newsType);
		System.out.println("# newsMessage: " + newsMessage);

	}
}
