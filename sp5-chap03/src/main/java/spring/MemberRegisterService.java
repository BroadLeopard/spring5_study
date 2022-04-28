package spring;

import java.time.LocalDateTime;

public class MemberRegisterService {//회원 등록 클래스
	private MemberDao memberDao;

	public MemberRegisterService(MemberDao memberDao) {//MemberDao 객체를 받아서
		this.memberDao = memberDao;
	}

	public Long regist(RegisterRequest req) {
		Member member = memberDao.selectByEmail(req.getEmail());//이메일을 얻는다
		if (member != null) {
			throw new DuplicateMemberException("dup email " + req.getEmail());//중복이면 예외 생성
		}
		Member newMember = new Member(
				req.getEmail(), req.getPassword(), req.getName(), 
				LocalDateTime.now());
		memberDao.insert(newMember);
		return newMember.getId();
	}
}
