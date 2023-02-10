package hello.servlet.basic;

import lombok.Getter;
import lombok.Setter;

// 롬복 설정으로 Getter, Setter가 자동으로 들어갈 수 있도록 해준다.
@Getter @Setter
public class HelloData {

    private String username;
    private int age;

}
