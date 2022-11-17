package com.bitc.board2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Rest 란?
// Representational State Transfer 의 약자
// 기존 웹은 웹의 프로토콜인 HTTP의 기능을 다 활용하지 못하고 있어 그것을 해결하기 위한 방법으로 제시된 방식
// 자원을 이름으로 구분하여 해당 자원의 상태를 주고 받는 모든 것
// HTTP 프로토콜을 그대로 활용(GET, POST, UPDATE, DELETE)하여 해당 자원의 CRUD 명령을 적용하는 것을 의미함
// 웹의 모든 자원에 고유한 ID인 HTTP URI를 부여함

// 자원 (Resource) URL
// 모든 자원에 고유한 ID가 존재하고, 이 자원은 서버에 존재
// 자원을 구분하는 ID는 /orders/order_id/1 형태 같은 HTTP URI 임

// 행위 (Verb) Http Method
// Http 프로토콜의 Method 임
// Http 프로토콜은 GET, POST, UPDATE, DELETE와 같은 메서드를 제공

// 표현 (Repersentation of Resource)
// Client 가 자원의 상태에 대한 조작을 요청 시 서버는 이에 적절한 응답을 보냄
// REST에서 하나의 자원은 JSON, XML, TEXT, RSS 등 여러 형태의 Representation으로 나타낼 수 있음
// 현재는 JSON으로 주고 받는 것이 대부분임


@Controller
public class BoardController {

  @RequestMapping("/")
  public String index() throws Exception {
    return "index";
  }
}
