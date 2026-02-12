//package project.oshiashi.oshiashi.security;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import net.datasa.web5.domain.entity.MemberEntity;
//import net.datasa.web5.repository.MemberRepository;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Slf4j
//@Service
//@RequiredArgsConstructor
//public class AuthenticatedUserDetailsService implements UserDetailsService {
//	private final MemberRepository memberRepository;
//	@Override
//	public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
//		log.info("로그인 시도 : {}", id);
//
//		// DB에서 회원 조회
//		MemberEntity entity = memberRepository.findById(id)
//				.orElseThrow(()->new UsernameNotFoundException(id+"없는 아이디 입니다."));
//		log.info("로그인 시도에 대한 엔티티 조회 결과 : {} ", entity);
//
//		// 조회된 엔티티를 기반으로 인증 사용자 객체 생성
//		return AuthenticatedUser.builder()
//				.id(entity.getMemberId())
//				.password(entity.getMemberPassword())
//				.name(entity.getMemberName())
//				.enabled(entity.isEnabled())
//				.roleName(entity.getRolename())
//				.build();
//	}
//}
