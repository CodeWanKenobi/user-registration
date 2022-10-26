package com.github.codewankenobi.userregistration.email;

public interface EmailSender {

    void send(String to, String email);
}
