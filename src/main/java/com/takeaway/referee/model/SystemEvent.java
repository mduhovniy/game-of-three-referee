package com.takeaway.referee.model;

import com.takeaway.referee.model.enums.PlayerStatus;

public record SystemEvent(PlayerStatus status, String originName, String counterpartName, int score) {
}
