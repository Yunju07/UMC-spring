package umc.study.service.MemberService;

import org.springframework.data.domain.Page;
import umc.study.domain.Review;
import umc.study.domain.Member;

import java.util.Optional;

public interface MemberQueryService {

    Optional<Member> findMember(Long id);

    Page<Review> getReviewList(Long MembertjId, Integer page);
}
