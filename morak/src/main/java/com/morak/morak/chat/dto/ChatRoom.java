package com.morak.morak.chat.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class ChatRoom {
	private String roomId;
	private String name;

	public static ChatRoom create(String name) {
		ChatRoom chatRoom = new ChatRoom();
		chatRoom.name = name;
		chatRoom.roomId = UUID.randomUUID().toString();
		return chatRoom;
	}
}
