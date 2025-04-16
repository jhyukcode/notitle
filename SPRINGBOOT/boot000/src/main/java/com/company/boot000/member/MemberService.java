package com.company.boot000.member;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service  //##1
@RequiredArgsConstructor
public class MemberService {
	
	
	
	private final MemberRepository   memberRepository;
	private final PasswordEncoder    passwordEncoder;  // SecurityConfig
	private final MemberStatusRepository memberStatusRepository;
	
	//insert
	public Member insertMember(Member member) {
		try {
			member.setJoinIp(InetAddress.getLocalHost().getHostAddress());
			member.setMemberStatus(memberStatusRepository.findById(1).get());
			member.setMemberPass(passwordEncoder.encode( member.getMemberPass()  ));
		} catch (UnknownHostException e) { e.printStackTrace();}
		return memberRepository.save(member);
	}
	// 실명과 휴대폰 번호로 아이디 찾기
	public Optional<String> findId(String name, String mobile) {
		Optional<String> find = memberRepository.findIdByRealNameAndMobileNumber(name, mobile);
		if (find.isPresent()) {
		return find; }
		return Optional.empty();
	}
	
	//selectAll
	public List<Member> selectMemberAll(){  
		return memberRepository.findAll();
	}
	
	//select
	public Member selectMember(Long id) {  
		return memberRepository.findById(id).get();
	}
	 
	//update / updatePass
	public int updateByPass( Member member, String old  ) {
		return memberRepository.updateByIdAndPassword(
					member.getMemberPass(), old, member.getId()
			   ); 
	}
	public Member updateByEmail(Member member) {
		Member find = memberRepository.findById(member.getId()).get();
		find.setEmail(member.getEmail());
		return memberRepository.save(find);
	} 
	//delete
	public void deleteMember(Long id) {
		Member find = memberRepository.findById(id).get();
		memberRepository.delete(find);
	}
	
}
