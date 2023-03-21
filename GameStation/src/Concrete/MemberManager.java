package Concrete;

import Abstract.IMemberCheckService;
import Abstract.IMemberService;
import Entities.Member;

public class MemberManager implements IMemberService {
	private IMemberCheckService memberCheckService;

	public MemberManager(IMemberCheckService checkService) {
		this.memberCheckService = checkService;
	}

	@Override
	public void saveMember(Member member) {
		if (memberCheckService.checkIfRealMember(member)) {
			System.out.println("Üye Eklendi : " + member.getId());
		} else {
			System.out.println("Üye Eklenemedi.");
		}

	}

	@Override
	public void deleteMember(Member member) {
		System.out.println("Üye silindi: " + member.getId());
	}

	@Override
	public void updateMember(Member member) {
		System.out.println("Üye güncellendi: " + member.getId());

	}

}
