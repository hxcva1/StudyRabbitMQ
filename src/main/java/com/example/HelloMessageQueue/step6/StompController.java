package com.example.HelloMessageQueue.step6;

// @Controller
// public class StompController {
//
// 	private final SimpMessagingTemplate messagingTemplate;
//
// 	public StompController(SimpMessagingTemplate messagingTemplate) {
// 		this.messagingTemplate = messagingTemplate;
// 	}
//
// 	@MessageMapping("/send")
// 	public void sendMessage(NotificationMessage notificationMessage) {
// 		String message = notificationMessage.getMessage();
//
// 		System.out.println("[#] message stomp" + message);
// 		messagingTemplate.convertAndSend("/topic/notifications", message);
// 	}
// }
