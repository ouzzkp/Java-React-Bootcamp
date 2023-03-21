package Abstract;
import Entities.*;
public interface IMemberService {
	public void saveMember(Member member);
	public void deleteMember(Member member);
	public void updateMember(Member member);

}
