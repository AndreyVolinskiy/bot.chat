package model;

import lombok.*;

/**
 * @author Andrey Volinskiy on 23.02.2018.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    private String message;
    private int messageId;
    private int senderId;
    private int recipientId;
}
