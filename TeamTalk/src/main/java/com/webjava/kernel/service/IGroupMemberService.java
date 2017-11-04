package com.webjava.kernel.service;

import com.webjava.kernel.entity.IMGroup;
import com.webjava.kernel.entity.IMGroupMember;

import java.util.List;

/**
 * Created by wx on 2017/10/27.
 */
public interface IGroupMemberService {

    IMGroupMember getGroupMemberById(Integer id);

    IMGroupMember getGroupMemberByGroupId(Integer groupId);

    IMGroupMember getGroupMemberByUserId(Integer userId);

    List<IMGroupMember> getAllGroupMember();

    Boolean addGroupMember(IMGroupMember user);

    Boolean deleteGroupMember(Integer id);

    Boolean updateGroupMember(IMGroupMember user);
}
