package com.example.HelloMessageQueue.step2;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WorkQueueController {
	private final WorkQueueProducer sender;

	public WorkQueueController(WorkQueueProducer sender) {
		this.sender = sender;
	}

	@PostMapping("/workqueue")
	public String sendMessage(@RequestParam String message, @RequestParam int duration) {
		sender.send(message, duration);
		return "[#] Message sent successfully " + message;
	}
}
