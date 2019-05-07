package com.bolsadeideas.springboot.backend.apirest.auth;

public class JwtConfig {

	public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEowIBAAKCAQEA9jJasitmHZvUZWhwxQAGDOHCZZB902d9sTWWfwj2qBqfPj/X\r\n" + 
			"9rIA06fFDshTnW2+DSTGvD55oPzhvOnXCRmXIihlKLZyhufgQxMpkfj6ZozpZ02g\r\n" + 
			"1R2ymLn2wv+mmq/KlGoUNR4fjdaSaDZy3cgrDC0oFIN6yXavc8sLTH7PGLl4tA+E\r\n" + 
			"/Rp422G0W152eJs+GEQLPJr57sxC+X5Ld3M0bdfimuRzfAteHNBPebDXiH1Q/LUQ\r\n" + 
			"o7Ax3DvGDK/6dVQ89WuOUCbkDgWE0AP4wOnWtwi1DaEnX3ARXnl3FDrWvxv1j2le\r\n" + 
			"YQVtHja8jdsywnclf7yD+FSx5Tua40UvpjnvQwIDAQABAoIBAAImFlyPvGhtv8DS\r\n" + 
			"1Ikjounh3ox8YlzB/nrZeOLK9TwqX1FvxTbF/vPZ9wJWBUTOfGYo+AMUmIMrMd0w\r\n" + 
			"PUw7CPKnX5qnXQCIbZCoTiiT/7t9Z1wbdVfm1nQ2y0yQZqfa+O2qr1p3VNcsFEMM\r\n" + 
			"lpwQ7y9ABaWIMD4p5wYfs42LXctdbqo3i88srzaIBdy0yPqKr0wYUemHU2Q8xOxl\r\n" + 
			"EeB3ROzjspeK9sa7qCuhwanV5tYDdTe3X9D8hGFE/iBLbkwxmVlLkL2McyIuTcbF\r\n" + 
			"vswVOx5e3KMoXwk/h9ZjWQqmJLFyCZWybLY/zewDbs4Khbx7ssURChb4ShHk38NN\r\n" + 
			"jCZtd0ECgYEA/2X8S+yCSeNQoxC4EugnvXsqsp3A6M7PwDCfp4ew5UTpHQIiME3f\r\n" + 
			"q7eZA4bkVQHo7hqoDfdSjm8oEwwJgkXsErhLLgXCEyM59H3wEqFh1Qfkpcmo3voA\r\n" + 
			"HDEw4/yNS6zjE+6qa6K4ASv3fZU8m/Fp5bpdLDWv3PZ7YCQHdDy1/vkCgYEA9sbR\r\n" + 
			"3lYxEq04RqvtPkVpunJOJ3UfeScTQ5s47KXY9ZQRBJgP/mSUBRA2t4spTNt7qtxq\r\n" + 
			"T32ry80iSpgfCyaAiZ1jfjm/z71linfi3FqYec56bwhxCQOeBG4YfoGqQdtLN61F\r\n" + 
			"7RI2EoRwHEwqUzvSgaqazB6rhvn2/AKuwpWMIxsCgYBGnCSnvQi8cttNagbqO0MZ\r\n" + 
			"cN76KQE3nE31vbu2Lp6qlGW6vmdDYZRQPl9QiU/BbNjAU6BY1CL//B1hPre2S6yb\r\n" + 
			"9FXcsHzam6efP95K2FFa+2asq1dD5mx3XuY8cguCe5cAYMC/J2ql8EjpcIQkPRdh\r\n" + 
			"CyhNW752YbL0fqGM8mgCyQKBgQCWXLZrfqEP/DOZ/A/mLW0qiZNNP3QZ4dE/FEkv\r\n" + 
			"CC6WE836upykKKx4GVT9qPFVPzau+PZd0PjoiOkoAmCH7sHLF/cTZiSVc5V3NW0p\r\n" + 
			"TpoxPbokBUS6dVXG5T5PdrpCvleqaQ1+UeZYihG1bEMty/mLwGPpk5Z3+76d9xR8\r\n" + 
			"w5pLmQKBgEc/slSjnbzLzcPEc1S7pt6R0XtTpIGEb6oQzBrBoYTVxjASC/AzHbsL\r\n" + 
			"/SYoUsRsd6RoynUGqTfKkQefJEM53spz8YMIK4WLNOMR0C83titMGeQvjiPgEMxc\r\n" + 
			"wadQwdd4tgk1KlrqvCLo1RNLW51/EuNVGteUypcQFVLHFlOXFasx\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA9jJasitmHZvUZWhwxQAG\r\n" + 
			"DOHCZZB902d9sTWWfwj2qBqfPj/X9rIA06fFDshTnW2+DSTGvD55oPzhvOnXCRmX\r\n" + 
			"IihlKLZyhufgQxMpkfj6ZozpZ02g1R2ymLn2wv+mmq/KlGoUNR4fjdaSaDZy3cgr\r\n" + 
			"DC0oFIN6yXavc8sLTH7PGLl4tA+E/Rp422G0W152eJs+GEQLPJr57sxC+X5Ld3M0\r\n" + 
			"bdfimuRzfAteHNBPebDXiH1Q/LUQo7Ax3DvGDK/6dVQ89WuOUCbkDgWE0AP4wOnW\r\n" + 
			"twi1DaEnX3ARXnl3FDrWvxv1j2leYQVtHja8jdsywnclf7yD+FSx5Tua40Uvpjnv\r\n" + 
			"QwIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";
}
