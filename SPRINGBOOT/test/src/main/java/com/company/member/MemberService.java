package com.company.member;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MemberService {

	private final MemberRepository mR;
	private final PasswordEncoder pE;
	
	public Member insert(Member member) {
		
		member.setPassword(pE.encode(member.getPassword()));
		return mR.save(member);
	}
	
}
