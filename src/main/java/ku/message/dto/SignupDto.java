package ku.message.dto;

import ku.message.validation.ValidPassword;
import lombok.Data;

import javax.validation.constraints.*;
import javax.validation.constraints.Size;

@Data
public class SignupDto {
    @NotBlank
    @Pattern(regexp = "^[a-zA-Z]+$",
            message = "First name can only contain letters")
    private String username;

    @NotBlank
    @ValidPassword
    private String password;

    @NotBlank(message = "First name is required")
    private String firstName;

    @NotBlank
    private String lastName;

    @Email
    @NotBlank
    private String email;

    private String role;
}
