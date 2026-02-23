//package project.oshiashi.oshiashi.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
///**
// * 보안관련 설정 (스프링 시큐리티)을 모아놓은 클래스
// * - url 접근 권한
// * - 로그인 로그아웃 설정
// */
//@Configuration
//public class WebSecurityConfig {
//
//	// 로그인 없이 접근 가능한 URL 목록
//	private static final String[] PUBLIC_URLS = {
//			"/"	// root
//			, "/error"
//			// 정적 리소스 공개: 브라우저가 페이지 로딩을 하기 위해서
//			, "/images/**"
//			, "/js/**"
//			, "/css/**"
//			, "/test/auth"		// 인증상태 확인용 URL
//			, "/member/join"	// 회원가입
//			, "/member/idCheckForm" // id 중복확인 화면보여주기
//			, "/member/idCheck" // id 중복확인 처리하기
//	};
//
//	@Bean
//	SecurityFilterChain config(HttpSecurity http) throws Exception{
//		// 일련의 필터들이 사슬처럼 연결되어 요청을 순차적으로 처리하는 구조
//		http
//				// URL별 접근 권한 설정
//				.authorizeHttpRequests(author->author
//							// 비로그인 접근 가능 URL 설정
//							.requestMatchers(PUBLIC_URLS).permitAll()
//							// 나머지요청들에 대하여 인증 요구
//							.anyRequest().authenticated()
//				)
//				// 기본 HTTP 인증
//				.httpBasic(AbstractHttpConfigurer::disable)
//				// 로그인 설정
//				.formLogin(form -> form
//						.loginPage("/member/login")	// 커스텀한 로그인 페이지 URL (컨트롤러의 GetMapping)
//						.usernameParameter("id")	// ID 파라미터명
//						.passwordParameter("password")	// PW 파라미터명
//						// PostMapping 로그인처리 (시큐리티가 가로채 처리할 요청)
//						.loginProcessingUrl("/member/login")
//						.defaultSuccessUrl("/", true) // 로그인 성공 후 이동
//						.permitAll()
//				)
//				// 로그아웃 설정
//				.logout(logout->logout
//						.logoutUrl("/member/logout")
//						.logoutSuccessUrl("/")
//				);
//		http.cors(AbstractHttpConfigurer::disable)
//				.csrf(AbstractHttpConfigurer::disable);
//
//		return http.build();
//	}
//
//	// BCrypt 알고리즘을 사용하는 인코더 Bean으로 등록
//	@Bean
//	public BCryptPasswordEncoder passwordEncoder(){
//		return new BCryptPasswordEncoder();
//	}
//}
