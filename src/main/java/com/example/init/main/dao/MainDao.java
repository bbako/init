package com.example.init.main.dao;

import com.example.init.main.vo.MainVO;
import lombok.AllArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class MainDao {

    private SqlSession sqlSession;

    public List<MainVO> getCountry() {

        List<MainVO> noticeList = sqlSession.selectList("mainMapper.getCountry");

        return noticeList;
    }

}