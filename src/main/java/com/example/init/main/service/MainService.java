package com.example.init.main.service;

import com.example.init.main.dao.MainDao;
import com.example.init.main.vo.MainVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class MainService {

    MainDao mainDao;

    public List<MainVO> getMember() {
        List<MainVO> country_list = mainDao.getMember();
        return country_list;
    }
}



