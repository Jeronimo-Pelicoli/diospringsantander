package com.diospring.diospringsantander.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MessageResponseDTO {

    @Builder.Default
    private String message;
}
