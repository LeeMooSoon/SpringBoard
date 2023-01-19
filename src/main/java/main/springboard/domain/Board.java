package main.springboard.domain;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

//Test
//Test2
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Board {

    private Long boardId;
    @NotEmpty(message = " 제목은 필수 입력 사항 입니다")
    private String title;

    @NotEmpty(message = " 내용은 필수 입력 사항 입니다")
    private String content;
    @NotEmpty
    @NotEmpty(message = " 이름은 필수 입력 사항 입니다")
    private String name;
    private String createDate;
    private int read;
    private Long memberId;
}
