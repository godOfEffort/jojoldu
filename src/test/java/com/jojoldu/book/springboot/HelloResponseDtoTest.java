package com.jojoldu.book.springboot;

import com.jojoldu.book.springboot.web.dto.HelloResponseDto;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() {
        String name = "test";
        int amount = 1000;

        HelloResponseDto helloResponseDto = new HelloResponseDto(name, amount);

        assertThat(helloResponseDto.getName()).isEqualTo(name);
        assertThat(helloResponseDto.getAmount()).isEqualTo(amount);
    }
}
