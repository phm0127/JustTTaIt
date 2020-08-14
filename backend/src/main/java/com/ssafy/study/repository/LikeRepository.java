package com.ssafy.study.repository;

import java.util.Collection;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssafy.study.model.Feed;
import com.ssafy.study.model.Like;
import com.ssafy.study.model.Member;

public interface LikeRepository extends JpaRepository<Like, Long> {
	Optional<Like> findById(Long id);
	Optional<Like> findByMemberAndFeed(Member member, Feed feed);
	Collection<Like> findAllByMember(Member member);
	Collection<Like> findAllByFeed(Feed feed);
	Long countByMember(Member member);
	Long countByFeed(Feed feed); 
	void deleteAllByMember(Member member);
	void deleteAllByFeed(Feed feed);
	void deleteAllByMemberAndFeed(Member member, Feed feed);
}
