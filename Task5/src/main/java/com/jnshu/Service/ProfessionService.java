package com.jnshu.Service;

import com.jnshu.Entity.Profession;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProfessionService {
    //展示职业信息
    List<Profession> getListProfession();
}
