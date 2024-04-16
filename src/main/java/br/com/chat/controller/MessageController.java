package br.com.chat.controller;


import br.com.chat.entity.MessageEntity;
import br.com.chat.entity.UserEntity;
import br.com.chat.service.MenssegerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    private MenssegerService menssegerService;

    @PostMapping()
    public ResponseEntity<MessageEntity> createMessage(@RequestBody MessageEntity entity) {
        MessageEntity createdMessage = menssegerService.createMessage(entity);
        return new ResponseEntity<>(createdMessage, HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<MessageEntity>> findAllMessages() {
        List<MessageEntity> messages = menssegerService.findAllMessagem();
        return new ResponseEntity<>(messages, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MessageEntity> getMessageById(@PathVariable Long id) {
        MessageEntity message = menssegerService.getById(id);
        return message != null ? ResponseEntity.ok(message) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMessageById(@PathVariable Long id) {
        menssegerService.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}

