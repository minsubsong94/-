package com.myspring.pro30.member.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.myspring.pro30.member.vo.MemberVO;

public interface MemberService {

	List listMembers() throws DataAccessException;
//	public List listMembers() throws DataAccessException;
//
//	int addMember(MemberVO memberVO) throws DataAccessException;
//
//	int removeMember(String id) throws DataAccessException;
//
//	public int mod(MemberVO memberVO)throws DataAccessException;
//
//	public MemberVO selectMemberById(String id) throws DataAccessException;
//
//	public MemberVO login(MemberVO member) throws Exception;

	
	int removeMember(String id) throws DataAccessException;

	

	

	int addMember(com.myspring.pro30.member.vo.MemberVO memberVO) throws DataAccessException;

	int mod(com.myspring.pro30.member.vo.MemberVO memberVO) throws DataAccessException;


	com.myspring.pro30.member.vo.MemberVO selectMemberById(String id) throws DataAccessException;


	com.myspring.pro30.member.vo.MemberVO login(com.myspring.pro30.member.vo.MemberVO memberVO) throws Exception;

	
}
