package top.aftery.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.aftery.dao.UpvoteMapper;
import top.aftery.entity.Upvote;
import top.aftery.service.UpvoteService;

@Service
public class UpvoteServiceImpl implements UpvoteService {
    @Autowired
    private UpvoteMapper upvoteMapper;


    public Upvote findByUidAndConId(Upvote upvote) {
      return  upvoteMapper.selectOne( upvote);
    }

    public int add(Upvote upvote) {
        return upvoteMapper.insert( upvote );
    }

    public Upvote getByUid(Upvote upvote) {
        return null;
    }

    public void update(Upvote upvote) {
        upvoteMapper.updateByPrimaryKey( upvote );
    }
}
