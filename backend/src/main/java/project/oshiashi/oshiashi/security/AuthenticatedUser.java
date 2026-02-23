//package project.oshiashi.oshiashi.security;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//import java.util.Collections;
//
//@Data
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
//public class AuthenticatedUser implements UserDetails {
//	// 사용자 ID
//	private String id;
//	// 패스워드 (암호화 된)
//	private String password;
//	// 이름
//	private String name;
//	// 권한명
//	private String roleName;
//	// 계정 활성화 상태
//	private boolean enabled;
//
//	/**
//	 * 사용자의 권한 목록 반환
//	 * @return
//	 */
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		return Collections.singletonList(new SimpleGrantedAuthority(roleName));
//	}
//
//	@Override
//	public String getPassword() {
//		return password;
//	}
//
//	@Override
//	public String getUsername() {
//		return id;
//	}
//
//	@Override
//	public boolean isEnabled() {
//		return enabled;
//	}
//}
